package practice.test1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int random =(int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("请猜数字：1-100之间，如果输入0，结束程序");
		int num =sc.nextInt();
		while(num!=random){
			if(num==0){
				System.out.println("程序结束");
				break;
			}
			if(num>random){
				System.out.println("猜大了");
			}
			if(num<random){
				System.out.println("猜小了");
			}
			System.out.println("请继续猜");
			num=sc.nextInt();
		}
		if(num==random){
			System.out.println("猜对了");
		}
		sc.close();
	}
}
