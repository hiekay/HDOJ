package AC_2060;
/**
 * @author LIn
 * ��̬�滮
 * ����������һ���·����=�����Ϸ�����·����+�����󷽸���·����
 * (���°�������Ϊ��)
 */
import java.util.Scanner;

public class Main_2067 {
	static long[][] dp = new long[40][40];

	public static void main(String[] args) {
		dp();
		int k = 1;
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == -1){
				break;
			}
			//�Խ��߽����̷�Ϊ���ߣ���̬�滮�����������һ�ߵ�·����
			System.out.println(k++ +" "+ n +" "+ 2 * dp[n+1][n+1]);
		}

	}

	private static void dp() {
		dp[1][1] = 1;
		int i,j;
		for(i = 2; i <= 36; i++){
			for(j = 1; j <= i; j++){
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
	}

}
