package stringExercises;

import java.util.Scanner;

public class InputStringCharacters {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("next function");
		
		String str;
		char ch, ch1;
		str = s.next();
		System.out.println(str);
		ch = s.next().charAt(0);
		str = s.next();
		System.out.println(str);
		ch1 = s.next().charAt(0);
		str = s.next();
		System.out.println(str + ch + ch1);
		
		System.out.println("nextLine function");
		str = s.nextLine();
		System.out.println("str" + str + "str");
		ch = s.next().charAt(0);
		str = s.nextLine();
		System.out.println(str);
		ch1 = s.next().charAt(0);
		str = s.nextLine();
		System.out.println(str + ch + ch1);
		

	}

}
