package hw2;

public class Homewor07 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，輸出結果為以下：
<<<<<<< HEAD
		// A		65
=======
		// A
>>>>>>> f35b6f8a84262169b00c9bddae42e8b7cb94300d
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		int i, j;
		char a = 'A';
<<<<<<< HEAD
		for (; a <= 'F'; a++) {		//從a('A')到 'F'（共 6 次循環） a~f
			j = a - 'A' + 1;

			//A=65,a=97
			//F=70
=======
		for (; a <= 'F'; a++) {
			j = a - 'A' + 1;

>>>>>>> f35b6f8a84262169b00c9bddae42e8b7cb94300d
			for (i = 0; i < j; i++) {
				System.out.print(a);
			}
			System.out.println();
		}

	}
}
//外層循環：控制字母從 'A' 到 'F'
//內層循環：控制每個字母的輸出次數
//內層循環 (for (i = 0; i < j; i++)):
//
//i 從 0 到 0（共 1 次循環）
//
//每次循環輸出 A → 第一行輸出：A
//
//外層循環繼續 (a = 'B'):
//
//計算 j：
//
//java
//复制
//j = 'B' - 'A' + 1 → 1 + 1 = 2
//內層循環執行 2 次 → 輸出 BB
//
//第二行輸出：BB
//
//重複此模式直到 a = 'F'：

//字母 (a)	j 的計算	內層循環次數	輸出內容
//	 A		 1		 1 次			A
//	 B		 2		 2 次			BB
//	 C		 3		 3 次			CCC
//	 D		 4		 4 次			DDDD
//	 E		 5		 5 次			EEEEE
//	 F		 6		 6 次			FFFFFF
