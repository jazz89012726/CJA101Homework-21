package hw5;

import java.util.Random;

public class Homework05 {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//	請設計一個方法	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼
//	此驗證碼內容包含了英文大小寫，與數字的亂數組合
	static void genAuthCode() {
		int[] arr = new int[62];
		for (int i = 0; i < arr.length; i++) {
			if (i < 10) {
				arr[i] = 48 + i; // 計算出0-9 ASCII碼
			} else if (i < 36) {
				arr[i] = 55 + i; // 計算出大寫英文 ASCII碼 arr[10-35]
			} else {
				arr[i] = 61 + i; // 計算出小寫英文 ASCII碼 arr[36-61]
			}
		}

		int arryBsize = 8; // 取8個
		int[] arrayB = new int[arryBsize];
		Random r = new Random();
		for (int i = 0; i < arryBsize; i++) {
			arrayB[i] = arr[r.nextInt(62)];
		}

		for (int i = 0; i < arryBsize; i++) {
			System.out.print((char) arrayB[i]);
		}
	}

	public static void main(String[] args) {
		genAuthCode();
	}
}
