package practice.test1;
/**
 * ���������
 * ð������
 * 	�Ƚ����ڵ�Ԫ�أ����Υ����������׼���򽻻���
 * 	�Ƚ�ʱ�ȿ��Բ���"�³�"�ķ�ʽ(����),Ҳ���Բ���"�ϸ�"�ķ�ʽ(����)
 */
import java.util.Arrays;

public class test10 {
	public static void main(String[] args) {
		int[] ary = {23,45,7,4,8,98,4,7,65,35};
		/*for(int i=0;i<ary.length-1;i++){
			for(int j=0;j<ary.length-1-i;j++){
				if(ary[j]>ary[j+1]){
					int tmp=0;
					tmp=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=tmp;
				}
			}
		}*/
		
		for(int i=0;i<ary.length-1;i++){
			for(int j=ary.length-1;j>0;j--){
				if(ary[j]>ary[j-1]){
					int tmp=0;
					tmp=ary[j];
					ary[j]=ary[j-1];
					ary[j-1]=tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ary));
	}
}
