package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		maxDienTich(shapes);
		maxCircle(shapes);
		maxRetangle(shapes);
		maxTriangle(shapes);
	}

	public static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			if (i < 3) {
				System.out.println("nhap vao ban kinh hinh tron");
				int r = sc.nextInt();
				shapes[i] = new HinhTron(r);
			} else if (i >= 3 && i <= 5) {
				System.out.println("nhap vao 2 canh hinh chu nhat");
				int a = sc.nextInt();
				int b = sc.nextInt();
				shapes[i] = new HinhChuNhat(a, b);
			} else {
				System.out.println("nhap vao 3 canh cua tam giac");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				shapes[i] = new TamGiac(a, b, c);
			}
		}

	}

	public static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}

	public static void maxDienTich(Shape[] shapes) {
		int n = 0;
		Shape answer = shapes[0];
		double max = shapes[0].dienTich();
		for (int i = 1; i < shapes.length; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);
	}

	public static void maxCircle(Shape[] shapes) {
		int n = 0;
		Shape answer = shapes[0];
		double max = shapes[0].dienTich();
		for (int i = 0; i < 3; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh tron co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);

	}

	public static void maxRetangle(Shape[] shapes) {
		int n = 3;
		Shape answer = shapes[3];
		double max = shapes[3].dienTich();
		for (int i = 3; i < 6; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh chu nhat co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);
	}

	public static void maxTriangle(Shape[] shapes) {
		int n = 6;
		Shape answer = shapes[6];
		double max = shapes[6].dienTich();
		for (int i = 6; i < shapes.length; i++) {
			if (shapes[i].dienTich() > max) {
				n = i;
				answer = shapes[i];
				max = shapes[i].dienTich();
			}
		}
		System.out.println("------------------------");
		System.out.println("hinh tam giac co dien tich lon nhat " + answer + " " + n);
		System.out.println("dien tich lon nhat " + max);
}
}

