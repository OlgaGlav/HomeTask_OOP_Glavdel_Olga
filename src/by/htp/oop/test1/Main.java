package by.htp.oop.test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		int x = sc.nextInt();

		System.out.print("Введите второе число: ");
		int y = sc.nextInt();

		Test1 obj = new Test1(x, y);

		obj.print();

		System.out.println("Сумма двух чисел равна " + obj.sum(x, y));

		System.out.println("Наибольшее значение из двух чисел равно " + obj.max(x, y));

	}

}
