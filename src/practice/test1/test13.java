package practice.test1;

import java.util.Scanner;

/**
 * 方法
 * 修饰符 返回值类型 方法名 参数列表 方法体
 * 
 * 参数列表：
 * 	形参:在定义方法的时候参数列表位置定义出的变量
 * 	实参:在调用方法的时候必须传递的具体的值
 * 
 * 局部变量
 * 	如果一个变量定义在一个方法的内部，那么这个变量就叫做局部变量，作用范围紧邻它的一堆{}
 * 	局部变量的生命周期：随着方法体中变量的定义而产生，直到方法结束，局部变量从内存销毁
 * 成员变量
 * 	在java中，如果一个变量定义在方法的外部，类的内部，那么这个变量就叫做成员变量
 * 比较：局部变量在使用之前必须进行初始化。成员变量会被默认初始化
 * @author lenovo
 *
 */
public class test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数，用空格隔开");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = sum(a,b);
		int max = getMaxVlaue(a,b);
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(max);
		sc.close();
	}

	private static int getMaxVlaue(int a, int b) {
		return a>b?a:b;
	}

	private static int sum(int a, int b) {
		return a+b;
	}
}
