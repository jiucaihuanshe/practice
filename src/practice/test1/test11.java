package practice.test1;

import java.util.Arrays;
/**
 * ѡ�����򣺴�0�±꿪ʼ�����κͺ���ÿ��Ԫ�رȽϣ�С����ǰ������һ����ϣ���Сֵ����������С�±괦
 * @author lenovo
 *
 */
public class test11 {
	public static void main(String[] args) {
		int[] ary = {12,4,54,7,3,8,35,88};
		for(int i=0;i<ary.length;i++){
			for(int j=i+1;j<ary.length;j++){
				if(ary[i]>ary[j]){
					int tmp=0;
					tmp=ary[i];
					ary[i]=ary[j];
					ary[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(ary));
	}
}
