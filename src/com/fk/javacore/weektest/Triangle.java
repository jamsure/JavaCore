package com.fk.javacore.weektest;

public class Triangle {

	public static void main(String[] args) {
		createIsoscelesTriangle(15);
		createIsoscelesTriangle1(15);
		createIsoscelesTriangle2(15);
		createIsoscelesTriangle3(15);
		createIsoscelesTriangle4(15);
	}

	public static void createIsoscelesTriangle(int x) {
		int a;
		a = (x + 1) / 2;
		System.out.println("param is :" + x + " mid is :" + a);
		System.out.println("Isosceles triangle :");
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= (a - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void createIsoscelesTriangle1(int x) {
		int a = (x + 1) / 2;
		System.out.println("param is :" + x + " mid is :" + a);
		System.out.println("Isosceles triangle :");
		for (int i = 1; i <= a; i++) {
			if (i == a) {
				for (int k = 1; k <= x; k++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= (a + i - 1); j++) {
					if (j == (a - i + 1) || j == (a + i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void createIsoscelesTriangle2(int x) {
		int a;
		a = (x + 1) / 2;
		System.out.println("param is :" + x + " mid is :" + a);
		System.out.println("Isosceles triangle :");
		for (int i = a; i > 0; i--) {
			for (int j = (a - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = (2 * i - 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void createIsoscelesTriangle3(int x) {
		int a = (x + 1) / 2;
		System.out.println("param is :" + x + " mid is :" + a);
		System.out.println("Isosceles triangle :");
		for (int i = 1; i <= a; i++) {
			if (i == 1) {
				for (int n = 1; n <= x; n++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= (x - i + 1); j++) {
					if (j == i || j == (x - i + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void createIsoscelesTriangle4(int x) {
		int a = (x + 1) / 2;
		System.out.println("param is :" + x + " mid is :" + a);
		System.out.println("Isosceles triangle :");
		for (int i = 1; i <= a; i++) {
			if (i == 1) {
				for (int n = 1; n <= x; n++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= (x - i + 1); j++) {
					if (j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
