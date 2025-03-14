package hw1;

public class Homework03 {
	public static void main(String[] args){	
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		//定義 1分=60秒,1小時=60分,1天=24小時,1年=365天
		// 256559秒/分/小時/天
		//定義 256559秒,分,小時,天
		int num=256559;
		int sec=60;
		int min=60;
		int hour=24;
		int day=24;
		//秒已經有了 計算有 分
		int min1=num/sec; 
		//計算 多少 小時
		int hour1=min1/min;
		//計算 多少 天
		int day1=hour1/hour;
		//輸出 
		System.out.println(day1+"天"+"\n"+hour1+"小時"+"\n"+min1+"分"+"\n"+num+"秒");
	}
}
