package AC_2060;
/**
 * @author LIn
 * ˼·�����ڣ�http://blog.csdn.net/lianqi15571/article/details/8877014
 * ע��δ��AC,Time Limit Exceeded
 */
import java.util.Scanner;

public class Main_2062 {

    public static void main(String[] args) {
         int i,t;  //t�������Ӽ�λ�ڷ����ĵڼ���
         long[] c = new long[22];  //���潫�Ӽ������ƽ��ÿ���������:c[2]��ʾn=2ʱ�ķ���ÿ�����Ӽ���
         int[] s = new int[22];  //���潫�Ӽ����ֵ�������ÿ��ĳ�ʼ��Ԫ��,����<=20

         c[1] = 1;
         for(i = 2; i < 22; i++){
             c[i] = c[i-1] * (i-1) + 1; //�Ƶ�������c[n]=(n-1)*c[n-1]+1
         }
         
         Scanner in = new Scanner(System.in);
         while(in.hasNextInt()){
             int n = in.nextInt();
             long m = in.nextLong();  //λ�ڵڼ����Ӽ�

             for(i = 0; i < 22; i++){
                 s[i] = i;    //ÿѭ��һ�ξ����¹�λÿ����Ԫ��
             }
             while (n > 0 && m > 0){
                 t = (int) (m / c[n] + ((m % c[n] > 0)?1:0));
                 if(t > 0){   //�õ���m���Ӽ��ڷ����ĵ�t��,��t>0
                     System.out.printf("%d",s[t]);
                     for(i = t; i <= n; i++){
                         s[i]=s[i+1];   //��s[i]+=1,���Ƿ���:��n���У���2��Ԫ���ڵ�n��ʱ��Ϊ������һ����
                     }
                     m -= ((t-1) * c[n] + 1);   //��ȥ(t-1�����Ӽ���+1��,m��Ϊ��ʾ��ʣ���Ӽ���λ�ڵڼ���
//                     System.out.print(m==0?'\n':' ');
                     if(m == 0){
                    	 System.out.println();
                     }else{
                    	 System.out.print(" ");
                     }
                 }
                 n--; //���εݼ�,ֱ��ִ�������if������˳�
             }
         }
    }

}