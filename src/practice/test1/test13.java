package practice.test1;

import java.util.Scanner;

/**
 * ����
 * ���η� ����ֵ���� ������ �����б� ������
 * 
 * �����б�
 * 	�β�:�ڶ��巽����ʱ������б�λ�ö�����ı���
 * 	ʵ��:�ڵ��÷�����ʱ����봫�ݵľ����ֵ
 * 
 * �ֲ�����
 * 	���һ������������һ���������ڲ�����ô��������ͽ����ֲ����������÷�Χ��������һ��{}
 * 	�ֲ��������������ڣ����ŷ������б����Ķ����������ֱ�������������ֲ��������ڴ�����
 * ��Ա����
 * 	��java�У����һ�����������ڷ������ⲿ������ڲ�����ô��������ͽ�����Ա����
 * �Ƚϣ��ֲ�������ʹ��֮ǰ������г�ʼ������Ա�����ᱻĬ�ϳ�ʼ��
 * @author lenovo
 *
 */
public class test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������������ÿո����");
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
