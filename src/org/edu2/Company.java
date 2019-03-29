// Data types and scanner Class
package org.edu2;

import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter");

		byte b = input.nextByte();
		System.out.println("Byte is :" + b);
		System.out.println("Enter Bolean type true or false?");

		short s = 102;
		int i = 103;
		long l = 368473257245l;
		float g = 198480379.46f;
		double d = 67324892396.3627865;
		boolean bo = input.nextBoolean();
		char c = 'a';
		String n = "sarala";

		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(g);
		System.out.println(d);

		System.out.println("ok true:" + bo);
		System.out.println(c);
		System.out.println(n);

	}
}
