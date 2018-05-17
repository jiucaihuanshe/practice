package practice.test1;
/**
 * 数组扩容
 * Arrays.copyOf(original, newLength)
 * original:源数组
 * newLength:新数组的长度
 * 
 * 特点：生成的新数组是原始数组的副本
 * newLength<原数组的长度		截取
 * newLength>原数组的长度		在新数组的后边的元素默认初始化
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
