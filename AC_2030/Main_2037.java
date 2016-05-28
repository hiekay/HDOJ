package AC_2030;
/**
 * @author LIn
 * ��ϸ������http://blog.csdn.net/why_still_confused/article/details/51199493
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main_2037 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			//���ӽ�Ŀ����
			TV[] tvs = new TV[n];
			for(int i = 0; i < n; i++){				
				tvs[i] = new TV(in.nextInt(),in.nextInt());
			}
			//������ʱ����������
			Arrays.sort(tvs);
			int k = 0;
			int sum = 0;
			for(int i = 0; i < n; i++){
				if(tvs[i].s >= k){
					sum++;
					k = tvs[i].e;
				}
			}
			System.out.println(sum);
		}
	}
}
//���ӽ�Ŀ��
class TV implements Comparable<TV>{
	int s;  //��ʼʱ��
	int e;  //����ʱ��
	public TV(int s,int e){
		this.s = s;
		this.e = e;
	}
	//��д�ȽϷ���
	@Override  
    public int compareTo(TV tv) {  
        return (e > tv.e)? 1:-1;  
	}
	
}
