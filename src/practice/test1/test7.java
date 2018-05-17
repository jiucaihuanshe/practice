package practice.test1;
/**
 * 数组的赋值
 * System.arraycopy(src, srcPos, dest, destPos, length);
 * src:源数组
 * srcPos:从源数组的此下标开始复制
 * dest:目标数组
 * destPos:从目标数组的此下标开始复制
 * length:从源数组指定下标开始复制长度为n个元素
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
		//ary1中从下标1开始到结尾的内容复制到ary2中
		System.arraycopy(ary1, 1, ary2, 0, 2);
		for(int i=0;i<ary2.length;i++){
			System.out.print(ary2[i]+" ");
		}
	}
}
