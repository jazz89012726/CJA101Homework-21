package hw3;

import java.util.Random;
import java.util.Scanner;

public class Homework02 {	
	public static void main(String[] args){
//		請設計一隻程式，會亂數產生一個0～9的數字，
//		然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息
//		猜對則顯示正確訊息，如圖示結果：
		
//		這是0~9的版本
		int i;
		i = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧！");

		while (true) {
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();

			if (j > i) {
				System.out.println("猜錯囉" + j);
			} else if (j < i) {
				System.out.println("猜錯囉" + j);
			} else {
				System.out.println("答對囉！答案就是" + j);
				break;
			}
		}
	}
}
		
		
//					這是0~100的版本	
//		int i;
//		i = (int) (Math.random() * 100) + 1;
//		System.out.println("開始猜數字吧！");
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			int j = sc.nextInt();
//
//			if (j > i) {
//				System.out.println("小於" + j);
//			} else if (j < i) {
//				System.out.println("大於" + j);
//			} else {
//				System.out.println("正確答案就是:" + j);
//				break;
//			}
//		}
//	}
//}
