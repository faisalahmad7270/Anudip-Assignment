package firstproject;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[2];
		arr[0]=3;
		arr[1]=2;
		double num=0;
		for(int i=0;i<arr.length;i++) {
			num+=arr[i];
		}
		double ans=num/arr.length;
		System.out.print(ans);

	}

}
