package AC_2050;
/**���߷�ƽ��
����ֱ�߷�ƽ���֪���ɽ�����������ߺ��߶ε���������������������������������n-1������ʱ��������Ϊf��n-1����
Ϊ��ʹ���ӵ�������࣬�����ߵ����ߵ��߶�Ҫ��n-1�����ߵıߣ���2*��n-1�����߶��ཻ����ô�������߶���Ϊ4*��n-1����������Ϊ2��
��Ҫע����ǣ����߱������ڵ����߶�ֻ������һ������

 �ʣ�f(n)=f(n-1)+4(n-1)+2-1

                =f(n-1)+4(n-1)+1

               =f(n-2)+4(n-2)+4(n-1)+2

               ����

               =f(1)+4+4*2+����+4(n-1)+(n-1)   

               =2n^2-n+1
*/
import java.util.Scanner;

public class Main_2050 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		while(c-- > 0){
			int n = in.nextInt();
			System.out.println(2*n*n - n + 1);
		}

	}

}
