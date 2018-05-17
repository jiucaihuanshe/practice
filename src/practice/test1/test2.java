package practice.test1;

import java.util.Scanner;
/**
 * while循环与do...while循环之间的区别
 * while:先判断在执行
 * 	——while循环的循环体从来没有执行
 * do...while:先执行后判断
 * 	——循环体至少执行一次
 * @author lenovo
 *
 */
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password;
		do{
			System.out.println("请输入密码");
			password = sc.nextInt();
		}while(password!=123456);
		System.out.println("密码输入正确");
		sc.close();
	}
}
