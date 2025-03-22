package hw4;

public class Homewokr03 {
	public static void main(String[] args){
//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示：字元比對，String方法)
		
		String [] s1 = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		char [] s2 = {'a','e','i','o','u'};
		int xcount = 0;	//紀錄數量
		
		for(String p : s1) {
			
			for(int i = 0; i < p.length(); i++) {
				char y = p.charAt(i);
				
				for(char s3 : s2) {
					if(y == s3) {
						xcount++;
						break;
					}
				}
			}
		}
		System.out.println("共有" + xcount + "個母音");
		
	}

}
