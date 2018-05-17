package practice.test1;
/**
 * สýื้
 * .length
 * @author lenovo
 *
 */
public class test5 {
	public static void main(String[] args) {
		int[] ary = {12,323,5,3,5,7,67,8,765};
		for(int i=0;i<ary.length;i++){
			System.out.print(ary[i]+" ");
		}
		System.out.println("");
		for(int i=ary.length-1;i>=0;i--){
			System.out.print(ary[i]+" ");
		}
	}
}
