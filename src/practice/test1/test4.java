package practice.test1;
/**
 * break:用于循环，跳出当前循环
 * 	可以用于循环和分支
 * continue:用于循环
 * 	跳出本次循环，继续下次循环
 * @author lenovo
 *
 */
public class test4 {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=100;i++){
			num+=i;
			if(num>300){
				System.out.println(i);
				break;
			}
		}
		
		System.out.println();
		
		int num1=0;
		for(int i=1;i<=100;i++){
			if(i%10==3){
				continue;
			}
			num1+=i;
		}
		System.out.println(num1);
	}
}
