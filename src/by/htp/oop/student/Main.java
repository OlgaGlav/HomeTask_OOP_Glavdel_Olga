package by.htp.oop.student;

import by.htp.oop.student.Student;
import by.htp.oop.student.Logic;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("�������1", "jdk1", new int[] { 9, 9, 10, 9, 9, 10 });
		Student st2 = new Student("�������2", "jdk2", new int[] { 9, 9, 10, 9, 9, 10 });
		Student st3 = new Student("�������3", "jdk1", new int[] { 9, 7, 10, 9, 9, 10 });
		Student st4 = new Student("�������4", "jdk2", new int[] { 8, 8, 10, 8, 9, 10 });
		Student st5 = new Student("�������5", "jdk1", new int[] { 8, 8, 10, 8, 8, 10 });
		Student st6 = new Student("�������6", "jdk2", new int[] { 8, 9, 10, 8, 10, 10 });
		Student st7 = new Student("�������7", "jdk1", new int[] { 8, 9, 9, 8, 9, 10 });
		Student st8 = new Student("�������8", "jdk2", new int[] { 10, 9, 8, 10, 9, 10 });
		Student st9 = new Student("�������9", "jdk1", new int[] { 9, 9, 10, 8, 9, 10 });
		Student st10 = new Student("�������10", "jdk2", new int[] { 10, 9, 10, 9, 9, 10 });

		Logic stLogic = new Logic();

		stLogic.exellentStudent(st1);
		stLogic.exellentStudent(st2);
		stLogic.exellentStudent(st3);
		stLogic.exellentStudent(st4);
		stLogic.exellentStudent(st5);
		stLogic.exellentStudent(st6);
		stLogic.exellentStudent(st7);
		stLogic.exellentStudent(st8);
		stLogic.exellentStudent(st9);
		stLogic.exellentStudent(st10);

	}

}
