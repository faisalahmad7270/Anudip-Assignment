package exerciseCodeIt;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.next();
		int index=0;
        char[] ch =new char[str.length()];
        for(int i=str.length()-1;i>=0;i--) {
        	ch[index++]=str.charAt(i);
        }
        String s=new String(ch);
        System.out.println(s);
	}

}
