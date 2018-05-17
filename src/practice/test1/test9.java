package practice.test1;

import java.util.Arrays;

public class test9 {
	public static void main(String[] args) {
		int[] ary = {12,43,5,34,99,6,7,2,76};
		int max=ary[0];
		for(int i=1;i<ary.length;i++){
			max=(max>ary[i])?max:ary[i];
		}
		ary = Arrays.copyOf(ary, ary.length+1);
		ary[ary.length-1]=max;
		/*for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}*/
		System.out.println(Arrays.toString(ary));
	}
}
