package firstproject;

public class CopyArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1= {1,2,3,4};
		int[] ar2=new int[4];
		copyArray(ar1,ar2);
		

	}
	public static void copyArray(int[] ar1,int[] ar2) {
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
		
	}

}
