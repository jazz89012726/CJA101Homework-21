package hw3;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
//但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，
//讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數，
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int num = sc.nextInt();

		int count = 0;

		while (count < 6) {
			int r = (int) (Math.random() * 49) + 1;
			if (r % 10 != num && r / 10 != num) {
				System.out.println(r + " ");
				count++;
			}
		}
		int k = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != num && i / 10 != num) {
				k++;
			}
		}
		System.out.println("\n總共有:" + k + "個數字可選");

	}
}
