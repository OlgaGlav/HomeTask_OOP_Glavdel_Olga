package by.htp.oop.test1;

public class Test1 {
	private int x;            //числа
	private int y;

	public Test1() {          //конструктор с пустым полем
		x = 0;
		y = 0;
	}

	public Test1(int x, int y) {            //конструктор 
		this.x = x;
		this.y = y;
	}

	public void print() {                   //вывод на печать значений
		System.out.println("x=" + x + ". y=" + y);
	}

	public int sum(int x, int y) {            //сумма
		int sum;
		sum = x + y;
		return sum;
	}

	public int max(int x, int y) {            //максимум
		int max = x;
		if (x < y) {
			max = y;
		} else if (x == y) {
			max = 0;
		}
		return max;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
