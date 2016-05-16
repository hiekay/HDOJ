package AC_2020;

import java.util.Scanner;

public class Main_2024 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while(n-- > 0){
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			boolean flag = true;
			//��һ���ַ���Ϊ_����ĸ
			if(!(chars[0] == '_' || Character.isLetter(chars[0]))){
				System.out.println("no");
				continue;
			}else{
				//�����ַ���Ϊ_����ĸ������
				for(int i = 1; i < chars.length; i++){
					if(!(Character.isLetterOrDigit(chars[i]) || chars[i] == '_')){
						flag = false;
						break;
					}
				}
			}
			if(flag){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			System.out.println(Character.getNumericValue(chars[0]));
			
		}
		

	}

}
