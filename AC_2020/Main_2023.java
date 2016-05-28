package AC_2020;
/**
 * @author LIn
 * ���⣺��ƽ���ɼ�
 * ��ϸ������http://blog.csdn.net/why_still_confused/article/details/51222366
 * */
import java.util.Scanner;

public class Main_2023 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
        	int n = in.nextInt();
        	int m = in.nextInt();
        	
        	Student[] stu = new Student[n];  //����n��ѧ�����������
        	double[] avg = new double[m];    //���Ƶ�ƽ���ɼ�
        	int i,j;
        	int sum,num = 0;
        	
        	for(i = 0; i < n; i++){
        		sum = 0;
        		stu[i] = new Student(m);
        		for(j = 0; j < m; j++){    //���ζ���һ��ѧ���ĸ��Ƴɼ�
        			stu[i].grade[j] = in.nextInt(); 
        			sum += stu[i].grade[j];             //һ��ѧ��ʵ���ĳɼ��ܺ� 
        			avg[j] += stu[i].grade[j];          //���Ƶ��ܳɼ�
        		}
        		stu[i].setAvg(sum*1.0/m);   //���ø�ѧ����ƽ���ɼ�
        	}
        	for(j = 0; j < m; j++){   //���Ƶ��ܳɼ�ȡƽ��
        		avg[j] /= n;
        	}

        	boolean flag;
        	//������Ƴɼ������ڵ���ƽ���ɼ���ѧ������
        	for(i = 0; i < n; i++){
        		flag = true;
        		for(j = 0; j < m; j++){
        			if(stu[i].grade[j] < avg[j]){
        				flag = false;
        				break;
        			}
        		}
        		//flagΪtrueʱ�����ѧ�����Ƴɼ������ڵ���ƽ���ɼ�
        		if(flag){   
        			num++;
        		}    		
        	}
        	
        	//���,�м�Ҫ���ո�ʽ,System.out.printf("%.2f\n",a);�ĸ�ʽ��PE
        	for(i = 0; i < n-1; i++){
        		System.out.printf("%.2f ",stu[i].avg);
        	}
        	System.out.printf("%.2f",stu[n-1].avg);
        	System.out.println();  
        	for(i = 0; i < m-1; i++){
        		System.out.printf("%.2f ",avg[i]);
        	}
        	System.out.printf("%.2f",avg[m-1]);
        	System.out.println();  
        	System.out.println(num);
        	System.out.println();    	
        }

	}
	//Student��
	public static class Student{
		double avg;
		double[] grade;
		//Student��Ĺ��캯��
		public Student(int m){
			grade = new double[m];  //ʵ����ÿ��Student�ĳɼ�����
		}
			
		public void setAvg(double avg){
			this.avg = avg;
		}
	}

}
