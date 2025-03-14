package hw1;

public class Homework05 {
	public static void main(String[] args){
//		5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		  金加利息共有多少錢(用複利計算，公式請自行google)
//		複利公式	S=A(1+r)n次方  本利和=資金(1+利率)幾次
		// %(1+0.01)
//				S=1500000*(1+2/100)10
		  int year=10;
		  double a=1500000;  
		  double r =(1+2/100.0);
		  int money =(int)(a*r+Math.pow(r,year));
		  System.out.println("總共="+money);
//		  System.out.printf("總共=%.2f", money);
	}
}
