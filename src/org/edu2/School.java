//Methodoverloadingstaticbindingcompiletime

package org.edu2;

public class School {

	public void classroom() {
		System.out.println("Classroom in a school");
	}

	public void classroom(int a) {
		System.out.println("Child" +a);
	}

	public static void main(String[] args) {
		School s = new School();

		s.classroom();
		s.classroom(123);
		

	}
}
