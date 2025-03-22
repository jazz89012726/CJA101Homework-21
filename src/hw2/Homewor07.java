package hw2;

public class Homewor07 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，輸出結果為以下：

		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		int i, j;
		char a = 'A';

		for (; a <= 'F'; a++) {
			j = a - 'A' + 1;

			for (i = 0; i < j; i++) {
				System.out.print(a);
			}
			System.out.println();
		}

	}
}
