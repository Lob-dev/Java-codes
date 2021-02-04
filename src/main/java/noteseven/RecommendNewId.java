package noteseven;

public class RecommendNewId {

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("z--"));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}

	public static String solution(String new_id) {
		StringBuilder id = new StringBuilder(new_id.toLowerCase()
				.replaceAll("[^-_.a-z0-9]", "")
				.replaceAll("[.]{2,}", ".")
				.replaceAll("^[.]|[.]$", ""));

		if(id.toString().equals("")) {
			id.append("a");
		}

		if(id.length() >= 16){
			id = new StringBuilder(id.substring(0, 15)
					.replaceAll("^[.]|[.]$", ""));
		}

		if(id.length() <= 2) {
			while (id.length() < 3) {
				id.append(id.charAt(id.length() - 1));
			}
		}

		return id.toString();
	}

}
