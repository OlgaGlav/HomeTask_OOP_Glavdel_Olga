package by.htp.oop.student;

import by.htp.oop.student.Student;

public class Logic {
	String exellentStudent;

	public void exellentStudent(Student student) {
		
		int[] marks = student.getMarks();
		String surname = student.getSurname();
		String group = student.getGroup();

		int x = 0;
		
		for (int i = 0; i < marks.length; i++) {
			
			if (marks[i] != 9 && marks[i] != 10) {
				
				x = x + 1;
				break;
			}
		}

		if (x == 0) {
			exellentStudent = surname + " группа " + group;
			System.out.println("Студент-отличник " + exellentStudent);
		}

	}

}
