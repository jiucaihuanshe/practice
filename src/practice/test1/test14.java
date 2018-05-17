package practice.test1;

import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		int score=0,count=0;
		System.out.println("欢迎进入猜字母游戏：");
		char[] dest = generate();
		Scanner sc = new Scanner(System.in);
		while(true){
			String input= sc.next().toUpperCase();
			if("EXIT".equals(input)){
				System.out.println("退出程序");
				break;
			}
			
			char[] inputArray = input.toCharArray();
			if(inputArray.length!=5){
				System.out.println("输入的字符个数必须等于5！");
				count++;
				continue;
			}
			int[] result = check(inputArray,dest);
			if(result[1]==dest.length){
				score=100*dest.length-10*count;
				System.out.println("恭喜猜对了，得分是："+score);
				break;
			}else{
				System.out.println("猜对的字符个数是："+result[0]+",其中位置正确的字符个数是："+result[1]);
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
