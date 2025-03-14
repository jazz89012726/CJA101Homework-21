package hw2;

public class TestNineNine {
//	public static void main(String[] args){
//		 •可輸出九九乘法表		
//	
//		int i,j;
//		for(i=1; i<=9;i++) {
//			for(j=1; j<=9;j++) {
//				System.out.println(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println(i*9);
//			
//		}
//		
//	}
//
//}
	
//			一：使用for迴圈+ while迴圈
//	public static void main(String[] args){
//		int i,j;
//		for(i=1; i<=9; i++){		// for當這件事
//			j=1;
//			while(j<=9){
//				System.out.println(i+"*"+j+"="+i*j+"\t");
//				j++;
//			}									
//		}
//	}
//}
	
//			•二：使用for迴圈+ do while迴圈
//	public static void main(String[] args){
//		int i,j;
//		for(i=1; i<=9; i++){
//			j=1;
//			System.out.println(i+"*"+j+"="+i*j+"\t");
//			
//			do {										//do才做 這件事	先2
//				System.out.println(i+"*"+j+"="+i*j+"\t");
//				j++;
//			}
//			while(j<=9);								//while當 j<9	 先1
//		}
//		
//	}
//}
			
//			•三：使用while迴圈+ do while迴圈
	public static void main(String[] args){
		int i=1;		
		while(i<=9){
			int j=1;
			
			do {
				System.out.println(i+"*"+j+"="+i*j+"\t");
				j++;
		}while(j<=9);
//			System.out.println(i+"*"+j+"="+i*j+"\t");
			i++;
		}
	}
}