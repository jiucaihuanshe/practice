package practice.test1;

import java.util.Scanner;
/**
 * whileѭ����do...whileѭ��֮�������
 * while:���ж���ִ��
 * 	����whileѭ����ѭ�������û��ִ��
 * do...while:��ִ�к��ж�
 * 	����ѭ��������ִ��һ��
 * @author lenovo
 *
 */
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password;
		do{
			System.out.println("����������");
			password = sc.nextInt();
		}while(password!=123456);
		System.out.println("����������ȷ");
		sc.close();
	}
}
