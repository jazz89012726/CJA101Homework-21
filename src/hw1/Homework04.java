package hw1;

public class Homework04 {
	public static void main(String[] args){
		//4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		//定義 常數 圓周率
		final double PI=3.1415;
		//設 半徑=5
		int r=5;
		//面積公式	r*r*PI
		//定義area=面積公式
		//計算圓面積
		double area=r*r*PI;
		//周長公式	2*PI*r
		//定義c為圓周長公式
		//計算圓周長
		double c=2*PI*r;
		//輸出
//		System.out.println("圓面積:"+area+"\n圓周長:"+c);
		System.out.printf("圓面積: %.2f",area);		
		System.out.printf("\n圓周長: %.2f",c);	
		//前面輸出要換成printf"%.2f"=取小數點後2位
	}

}
