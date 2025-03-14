package hw2;

public class Homework06 {
	public static void main(String[] args){

		//請設計一隻Java程式，輸出結果為以下：
		//1 2 3 4 5 6 7 8 9 10
		//1 2 3 4 5 6 7 8 9
		//1 2 3 4 5 6 7 8
		//1 2 3 4 5 6 7
		//1 2 3 4 5 6
		//1 2 3 4 5
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		
		int a,b;
		for (a = 10; a > 0; a--) {		//外
			for (b = 1; b <= a; b++) {	//內
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
		
