package practice.test1;

import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		int score=0,count=0;
		System.out.println("��ӭ�������ĸ��Ϸ��");
		char[] dest = generate();
		Scanner sc = new Scanner(System.in);
		while(true){
			String input= sc.next().toUpperCase();
			if("EXIT".equals(input)){
				System.out.println("�˳�����");
				break;
			}
			
			char[] inputArray = input.toCharArray();
			if(inputArray.length!=5){
				System.out.println("������ַ������������5��");
				count++;
				continue;
			}
			int[] result = check(inputArray,dest);
			if(result[1]==dest.length){
				score=100*dest.length-10*count;
				System.out.println("��ϲ�¶��ˣ��÷��ǣ�"+score);
				break;
			}else{
				System.out.println("�¶Ե��ַ������ǣ�"+result[0]+",����λ����ȷ���ַ������ǣ�"+result[1]);
				count++;
			}
		}
		sc.close();
	}

	private static int[] check(char[] inputArray, char[] dest) {
		int[] result = new int[2];
		for(int i=0;i<inputArray.length;i++){
			for(int j=0;j<dest.length;j++){
				if(inputArray[i]==dest[j]){
					result[0]++;
					if(i==j){
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}

	private static char[] generate() {
		char[] letters = {'A','B','T','E','S','E','Q','U','J','M','O'};
		char[] chs = new char[5];
		boolean[] flag =new boolean[letters.length];
		for(int i=0;i<chs.length;i++){
			int index;
			do{
				index = (int) (Math.random()*letters.length);
			}while(flag[index]);
			chs[i]=letters[index];
			flag[index]=true;
		}
		return chs;
	}
}
