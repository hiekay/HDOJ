package AC_2080;

import java.util.Scanner;

public class Main_2087 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		while(in.hasNext()){
			String n = in.next();
			if(n.equals("#")){
				break;
			}
			String m = in.next();
			
			String r = n.replace(m, "");//���Ӵ��滻Ϊ��Ӧ���ȵĿո�
			int ans = (n.length() - r.length()) / m.length();
			System.out.println(ans);
		}

	}

}
