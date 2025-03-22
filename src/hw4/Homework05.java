package hw4;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入年(yyyy):");
        int year = sc.nextInt();
        System.out.print("請輸入月(mm):");
        int month = sc.nextInt();
        System.out.print("請輸入日(dd):");
        int day = sc.nextInt();
        
        // 每個月有幾天
        int[] alldays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 判斷閏年	二月為29天
        if ((year % 4 == 0 && year% 100!= 0) || (year % 400 == 0)) {
            alldays[1] = 29;         
        }       
        if (month < 1 || month > 12) {
            System.out.println("月份輸入錯誤，請輸入 1 ~ 12 之間的數字。");
            return;
        }      
        if (day < 1 || day > alldays[month-1]) {
            System.out.println("日期輸入錯誤，該月最多只有 " + alldays[month - 1] + " 天。");
            return;
        }
        // 程式執行到這裡,表示日期有效      
        int x = day;  
        for(int i = 0; i < month - 1; i++) {
            x += alldays[i]; 
        }        
        System.out.println
        ("輸入的日期為:"+"該年的第"+ x + "天");
    }
}

