package practice.test1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int random =(int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("������֣�1-100֮�䣬�������0����������");
		int num =sc.nextInt();
		while(num!=random){
			if(num==0){
				System.out.println("�������");
				break;
			}
			if(num>random){
				System.out.println("�´���");
			}
			if(num<random){
				System.out.println("��С��");
			}
			System.out.println("�������");
			num=sc.nextInt();
		}
		if(num==random){
			System.out.println("�¶���");
		}
		sc.close();
	}
}
