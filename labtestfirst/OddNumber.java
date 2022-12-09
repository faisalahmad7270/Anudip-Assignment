package labtestfirst;

public class OddNumber {

	public static void main(String[] args) {
		oddNum();

	}
	public static void oddNum() {
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}

