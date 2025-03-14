package hw1;

public class Homework02 {
//	2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	public static void main(String[] args) {
		//定義 蛋數和每打有幾棵
		int num1=200,num2=12;
		//計算總共有幾打
		int dozen=num1/num2;
		//計算有多少顆
		int egg=num1%num2;
		//輸出結果幾打幾顆
		System.out.println("一共是"+dozen+"打"+egg+"顆");
		
		
	}
}


/*  200顆蛋/12打=x打...y顆
 * 	打=dozen 蛋=egg
 */
 