package hw2;

public class Homework05 {
	public static void main(String[] args) {
		// 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		int i = 49; // 假設所有數字都可以選擇
		for (int j = 1; j <= 49; j++) {
			int k = j; // 用 k 來拆解數字
			// 檢查是否含有 4
			while (k > 0) {
				if (k % 10 == 4) { // 只要有 4，這個數字就不能選
					i--; // 可選數字減少
					k = -1; // 讓 k 變成負數，直接跳出 while 迴圈
				} else {
					k /= 10; // 移除個位數，繼續檢查
				}
			}
			// 如果數字沒有被排除（k 沒有變成 -1），就輸出
			if (k != -1) {
				System.out.print(j + " ");
			}
		}
		System.out.println("\n總共有 " + i + " 個數字可以選擇。");
	}
}
