package by.htp.oop.test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ������ �����: ");
		int x = sc.nextInt();

		System.out.print("������� ������ �����: ");
		int y = sc.nextInt();

		Test1 obj = new Test1(x, y);

		obj.print();

		System.out.println("����� ���� ����� ����� " + obj.sum(x, y));

		System.out.println("���������� �������� �� ���� ����� ����� " + obj.max(x, y));

	}

}
