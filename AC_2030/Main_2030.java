package AC_2030;
/*���ֻ������ڼ�����ı�﷽ʽ�������ǣ�ʹ�ö����ֽڣ�ÿ���ֽ����λһλΪ1��
 *������У� �����һλ�Ƿ���λ�� 1��ʾΪ ������ ���� ���ֻ������ÿ���ֽڱ�ʾ��ʮ���������Ǹ���
*/
import java.util.Scanner;

public class Main_2030 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while(n-- > 0){
			int count = 0;
			String s = in.nextLine();
			byte[] bytes = s.getBytes();
			for(byte b:bytes){
				if(b < 0){
					count++;
				}
			}
			System.out.println(count/2);
		}

	}

}
