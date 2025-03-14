package hw2;

public class Homework03 {
	public static void main(String[] args){
//		• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		
		int i,j;
		i=1;
		j=1;
		while(i<=10) {			
			i++;
			j*=i;
			System.out.println("1*2*...*10="+j);
		}
	}

}
