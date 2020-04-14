package comparator;

import java.util.Scanner;

public class ExamSam {
	public static void reverse(String str) {
		int i;
		String str1="";
		for(i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		System.out.println(str1);
	}
	public static void replace(String str) {
		Scanner sc = new Scanner(System.in);
		char c;
		int i;
		String str1="";
		System.out.println("Enter the character to be replaced with @");
		c=sc.next().charAt(0);
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				str1+='@';
			}
			else {
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option;
		String str,str1="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.next();
		System.out.println("MENU");
		System.out.println("Enter 1 for reversing a digit");
		System.out.println("Enter 2 for replacing a character with @");
		option=sc.nextInt();
		switch(option) {
		case 1: reverse(str);
				break;
		case 2: replace(str);
				break;
		}
	}

}
