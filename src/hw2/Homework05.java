package hw2;

public class Homework05 {
	public static void main(String[] args) {
<<<<<<< HEAD
		// 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，
		// 不論是個位數或是十位數。請設計一隻程式，
=======
		// 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
>>>>>>> f35b6f8a84262169b00c9bddae42e8b7cb94300d
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		int count = 0;
		
		for(int i=1;i<=49;i++) {
			if(i%10==4||i/10==4) {//餘數=4  個位
				continue;		
				
			}
			count++;
			System.out.print(i+" ");	
		}
		System.out.println("\n"+"總共有:"+count+"個");
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> f35b6f8a84262169b00c9bddae42e8b7cb94300d
