package practice.test1;
/**
 * ��Ŀ�����
 * �������� ������ = ���ʽ(boolean) ? ���ʽ1 : ���ʽ2;
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
