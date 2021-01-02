package notesix;

import java.util.Arrays;
import java.util.regex.Pattern;

public class JadenCase {

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
	}

	public static String solution(String s) {
		StringBuilder builder = new StringBuilder();

		s = s.toLowerCase();
		builder.append(Character.toUpperCase(s.charAt(0)));

		for (int index = 1; index < s.length(); index++) {
			if (s.charAt(index-1) == ' ') {
				builder.append(Character.toUpperCase(s.charAt(index)));
			} else {
				builder.append(s.charAt(index));
			}
		}
		return builder.toString();
	}

}
