package AC_2060;

import java.util.Scanner;

public class Main_2063 {
	static int[][] line;
	static int[] used;
	static int[] boy;
	static int k,m,n;
	
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
	    	 /*��������*/
	    	 k = in.nextInt();
	    	 if(k == 0){
		    	 break;
		     }
		     m = in.nextInt();
		     n = in.nextInt();

		     line = new int[505][505];
		 	 used = new int[505];
		 	 boy = new int[505];
		 	 int a,b,sum = 0;

		     while(k-- > 0){
		    	 a = in.nextInt();
		    	 b = in.nextInt();
		    	 line[a][b] = 1;
		     }
		     
		     for (int i = 1; i <= m; i++){
		    	 //�ָ�ÿ��������������
		         for(int j = 1; j <= m; j++){
		        	 used[j] = 0;
		         }
	             if(find(i)){  //�ɹ��ҵ�һ���µ�����·��
	            	 sum++;
	             }	
	         }
		     
		     System.out.println(sum);
	     }

	}

	private static boolean find(int x) { 
		for (int j = 1; j <= n; j++){    //ɨ��ÿ������
			if (line[x][j] == 1 && used[j] == 0){    //��Ů��x����ͼ������j�������ξ�û������
				used[j] = 1;
				if (boy[j] == 0 || find(boy[j])){    //���������ܻ�û��������ܽ�֮ǰ�Ĵ���Ÿ�����
					boy[j] = x;
					return true;
				}
			}
		}
		return false;
	}

}
