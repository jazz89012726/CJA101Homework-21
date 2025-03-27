package hw5;

import java.util.Scanner;

public class Homework01 {
//		請設計一個方法為starSquare(int width, int height)，
//		當使用者鍵盤輸入寬與高時，即會印出對應的*長方形	
	static void starSquare(int width, int height) {

		for (int i = 0; i < width; i++) {

			for (int k = 0; k < height; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入寬度:");
		int w = sc.nextInt();
		System.out.print("請輸入高度:");
		int h = sc.nextInt();

		starSquare(w, h);// 呼叫
	}
}
