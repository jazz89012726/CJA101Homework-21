package hw4;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args){
		//• 請建立一個字串，經過程式執行後，輸入結果是反過來的
		//例如String s = “Hello World”，執行結果即為dlroW olleH
		//(提示：String方法，陣列)
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入內容:");	
		String s = sc.nextLine();
		
//		char[]charArr = s.toCharArray(); //toCharArray()將字串轉換成字元陣列
			
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));								
		}		
	}

}

//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println("請輸入內容:");	
//		for(int i = s.length()-1; i>=0; i--) {
//			System.out.print(s.charAt(i));
//		}
//	}
//}
