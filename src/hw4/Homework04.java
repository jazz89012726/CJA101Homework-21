package hw4;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args){
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共3 人!」
//		(提示：Scanner，二維陣列)
		int[][] c = {
				{25, 2500},
				{32, 800},
				{8, 500},
				{19, 1000},
				{27, 1200}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入預借的金額: ");
		int sum = sc.nextInt();
		
		int count = 0;
		System.out.println("有錢可借的員工編號:");
		
		for(int i = 0; i < c.length; i++) {
			if(c[i][1] >= sum) {				//第i位員工身上的現金
				System.out.println(c[i][0]);	//第i位員工的編號
			count++;
			}
		}
		System.out.println("共"+ count + "人!");
	}

}
