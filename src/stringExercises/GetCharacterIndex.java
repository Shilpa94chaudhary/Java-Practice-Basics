package stringExercises;

import java.util.Scanner;

public class GetCharacterIndex {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String str;
		str = s.next();
		System.out.println(str);
		char ch = s.next().charAt(0);
		str = s.next();
		System.out.println(str);
		char ch1 = s.next().charAt(0);
		str = s.next();
		System.out.println(str + ch + ch1);
		
//		for(int i=0; i < str.length(); i++) {
//			
//		}

	}

}
