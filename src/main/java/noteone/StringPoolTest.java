package noteone;

import noteTwo.DTO;

public class StringPoolTest {

    public static void main(String[] args) {
/*        String helloWorld = "HelloWorld";
        String world = "World";
        System.out.print((helloWorld == "HelloWorld") + " ");
        System.out.print((Other.helloWorld == helloWorld) + " ");
        System.out.print((helloWorld == ("Hello" + "World")) + " ");
        System.out.print((helloWorld == ("Hello" + world)) + " "); // 연산 했을 경우 변경
        System.out.print((helloWorld == ("Hello" + world).intern()) + " ");
        System.out.println(helloWorld == new String("HelloWorld"));*/

        int num = 10;
        int num2 = 10;

        Integer integer = new Integer(10);

        // 기본 형은 주솟값을 가지지 않고 상수를 가지고 있다.
        System.out.println(Integer.hashCode(num));
        System.out.println(Integer.hashCode(num2));

        DTO dto = new DTO("a");
        DTO dto1 = new DTO("b");


        System.out.println(dto.hashCode());
        System.out.println(dto1.hashCode());


        System.out.println((num == num2) + " ");
        System.out.println((num == 10) + " ");
        System.out.println((num == Integer.parseInt("10")) + " ");
    }

}
