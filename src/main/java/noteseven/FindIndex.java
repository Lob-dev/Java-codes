package noteseven;

import notefive.oop.Animal;

public class FindIndex {

	public static void main(String[] args) {
		System.out.println(findIndex(new int[]{1,2,4,7,10,15}, 6));

		Class<Animal> clazz = Animal.class;

		Animal animal = new Animal();
		Class<? extends Animal> aClass = animal.getClass();

		try {
			Class<?> aClass1 = Class.forName("notefive.oop.Animal");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}



	/**
	 * 구름 EDU 강의
	 *
	 * 평균과의 차가 가장 작은 데이터의 번호를 반환하는 함수
	 * 여러 가지라면 가장 빠른 번호를 반환한다.
	 *
	 * @param data
	 * @param n
	 * @return int  가장 평균과 가까운 데이터의 번호 (1번부터 시작)
	 */
	public static int findIndex(int[] data, int n) {
		int sum = 0;
		for (int datum : data) {
			sum += datum;
		}


		int res = 0;
		for (int i = 0; i < data.length; i++) {
			// 평균 값과 근접한 값을 반환할 것으로 예상하는 값
			int min = Math.abs(n * data[res] - sum);

			// 현재 인덱스의 abs - variable 값
			int idx = Math.abs(n * data[i] - sum);

			// 현재 인덱스 값이 더 작다면 변경
			if (idx < min) {
				res = i;
			}
		}

		return res+1;
	}
}
