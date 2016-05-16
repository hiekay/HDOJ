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
	    	 double s[] = new double[n + 1];  //���վ��ľ���
	    	 int a;
	    	 double sum = 0; //�ڹ���ʱ��
	    	 
	    	 s[0] = in.nextInt();
	    	 for(int i = 1; i < n; i++){
	    		 a = in.nextInt();
	    		 s[i] = a - s[i - 1];
	    		 if(i == (n - 1)){
	    			 s[n] = L - a;
	    		 }
	    	 }
	    	 
	    	 
	    	 for(int i = 1; i <= n; i++){
	    		 if(s[i] > c){
	    			 sum += Math.min((t + (c / vt1) + (s[i] - c) / vt2), s[i] / vt2);
	    		 }else{
	    			 sum += Math.min((t + (s[i] / vt1)), s[i] / vt2);
	    		 }
	    		 System.out.println(sum);
	    	 }
	    	 double t2 = (L / vr);
	    	 if(sum < t2){
	    		 System.out.println("What a pity rabbit!");
	    	 }else{
	    		 System.out.println("Good job,rabbit!");
	    	 }
	     }
	}

}
