package practice.test1;
/**
 * forѭ��
 * ��ʼ������ִֻ��һ�Σ������仯�����ڵ�һ�ε�ʱ�򲻻�ִ��
 * @author lenovo
 *
 */
public class test3 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int num=0;
		for(int i=1;i<=100;i++){
			num+=i;
		}
		System.out.println(num);
		System.out.println();
		int num1=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				num1+=i;
			}
		}
		System.out.println(num1);
		
	}
}
