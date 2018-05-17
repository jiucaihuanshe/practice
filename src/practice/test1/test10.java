package practice.test1;
/**
 * 数组的排序
 * 冒泡排序
 * 	比较相邻的元素，如果违反最后的排序准则，则交换。
 * 	比较时既可以采用"下沉"的方式(降序),也可以采用"上浮"的方式(升序)
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
