package hw3;

import java.util.Scanner;

public class Homework01 {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("不是三角形");
		} else if (a == b && b == c) {
			System.out.println("正三角形");
		} else if (a == c && b != a) {
			System.out.println("等腰三角形");
		} else if (a < b && b < c) {
			System.out.println("其他三角形");
		}
//		System.out.println(a + b + c);
//	}
		if(a*a+b*b==c*c) {
			System.out.println("直角三角形");
		}
	}
}

//}if(a*a+b*b==c*c)
//if(a*a+c*c==b*b)
//	if(b*b+c*c==a*a) {
//		System.out.println("直角三角形");
