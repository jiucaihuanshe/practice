package practice.test1;
/**
 * ����ĸ�ֵ
 * System.arraycopy(src, srcPos, dest, destPos, length);
 * src:Դ����
 * srcPos:��Դ����Ĵ��±꿪ʼ����
 * dest:Ŀ������
 * destPos:��Ŀ������Ĵ��±꿪ʼ����
 * length:��Դ����ָ���±꿪ʼ���Ƴ���Ϊn��Ԫ��
 * @author lenovo
 *
 */
public class test7 {
	public static void main(String[] args) {
		int[] ary1 = {1,2,3};
		int[] ary2 = new int[5];
		/*System.arraycopy(ary1, 0, ary2, 0, ary1.length);
		for(int i=0;i<ary2.length;i++){
			System.out.print(ary2[i]+" ");
		}*/
		
		System.out.println();
		//ary1�д��±�1��ʼ����β�����ݸ��Ƶ�ary2��
		System.arraycopy(ary1, 1, ary2, 0, 2);
		for(int i=0;i<ary2.length;i++){
			System.out.print(ary2[i]+" ");
		}
	}
}
