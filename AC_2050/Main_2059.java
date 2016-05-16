package AC_2050;

import java.util.Scanner;

public class Main_2059 {
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
	    	 double L = in.nextInt();
	    	 int n = in.nextInt();   //���վ����
	    	 double c = in.nextInt();   //�������߾���
	    	 double t = in.nextDouble();   //���ʱ��
	    	 double vr = in.nextInt();   //�����ٶ�
	    	 double vt1 = in.nextInt();   //�ڹ�綯���ٶ�
	    	 double vt2 = in.nextInt();   //�ڹ���·�ٶ�
	    	 double s[] = new double[n + 2];  //���վ��������
	    	 double dp[] = new double[n + 2];  //dp[i]��ʾ����i���ӵ�վ����С�ķ�ʱ��
	    	 double time = 0,len; //�ڹ���ʱ��
	    	 int i,j;
	    	 s[0] = 0;
	    	 s[n+1] = L;
	    	 dp[0] = 0;
	    	 for(i = 1; i <= n; i++){
	    		 s[i] = in.nextInt();
	    	 }

	    	 for(i = 1; i <= n+1; i++){
	             dp[i] = Integer.MAX_VALUE;
	             for(j = 0; j < i; j++){
	            	 len = s[i] - s[j];
	            	 //����þ�����ڵ綯������ʻ��������,����ȫ�̵綯��
	                 if(len > c){	
	                	 time = c / vt1 + (len - c) / vt2;//�ѵ綯����ʻ��ʱ������ڹ��ý�̤��ʱ��
	                 }
	                 else{
	                	 time = len / vt1;
	                 }           
	                 time += dp[j];//֮����ϵ���j���ӵ�վ������ʱ��
	                 if(j > 0){  //�����,���ϳ��ʱ��
	                     time += t;
	                 }
	                 dp[i] = Math.min(dp[i],time);//ÿ����������i���ӵ�վ������ʱ��
	             }
	    	 }

	    	 double t2 = (L / vr);
	    	 if(dp[n+1] < t2){
	    		 System.out.println("What a pity rabbit!");
	    	 }else{
	    		 System.out.println("Good job,rabbit!");
	    	 }
	     }
	}

}
