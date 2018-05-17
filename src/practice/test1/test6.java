package practice.test1;
/**
 * 三目运算符
 * 数据类型 变量名 = 表达式(boolean) ? 表达式1 : 表达式2;
 * @author lenovo
 *
 */
public class test6 {
	public static void main(String[] args) {
		int[] ary =new int[10];
		for(int i=0;i<ary.length;i++){
			int num = (int) (Math.random()*100);
			ary[i]=num;
		}
		for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}
		int max=ary[0];
		for(int i=1;i<ary.length;i++){
			max=(max>ary[i])?max:ary[i];
		}
		System.out.println();
		System.out.println(max);
	}
}
