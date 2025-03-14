package hw2;

public class Homework02 {
	public static void main(String[] args){
//		• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		
		int i,j;
		j=1;
		for(i=1;i<=10;i++){			
			j*=i;	//j=j*i
			System.out.println("1*2*...*10="+j);	
		}
	}

}
// 1*2*3*4*5