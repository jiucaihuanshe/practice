package practice.test1;
/**
 * ��������
 * Arrays.copyOf(original, newLength)
 * original:Դ����
 * newLength:������ĳ���
 * 
 * �ص㣺���ɵ���������ԭʼ����ĸ���
 * newLength<ԭ����ĳ���		��ȡ
 * newLength>ԭ����ĳ���		��������ĺ�ߵ�Ԫ��Ĭ�ϳ�ʼ��
 */
import java.util.Arrays;

public class test8 {
	public static void main(String[] args) {
		int[] ary = {1,2,3};
		ary = Arrays.copyOf(ary, 5);
		for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}
	}
}
