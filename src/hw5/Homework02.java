package hw5;

public class Homework02 {
//		請設計一個方法為randAvg()，
//		從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	// 亂數,平均值
	static void randAvg() {
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 101);
			System.out.print(r + " ");
			sum += r;
		}
		int avg = sum / 10;
		System.out.println("\n平均值: " + avg);
	}

	public static void main(String[] args) {
		randAvg();
	}
}
