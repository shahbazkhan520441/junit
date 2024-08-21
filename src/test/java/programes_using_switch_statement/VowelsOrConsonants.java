package programes_using_switch_statement;

import java.util.Scanner;

public class VowelsOrConsonants {
public static void main(String[] args) {
	System.out.println("enter one digit from A to Z or a to z");
	Scanner sc=new Scanner(System.in);
	char choice=sc.next().charAt(0);
	choice = Character.toLowerCase(choice);
	switch(choice) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println( choice + "is vowel");
	break;
	default:
		if(choice >='a' && choice <='z') {
			System.out.println(choice + "  is a consonant. ");
		}
	 else {
        System.out.println(choice + " is not an alphabetic character.");
    }
    break;
	
	}
}
}
