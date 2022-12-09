package labtestfirst;

public class Calculator {

	public static void main(String[] args) {
		int a,b;
		a=2;
		b=5;
		int op=5;
		switch(op)
	    {
	    case 1:
	    	System.out.println("Sum "+a+b);
	        break;
	    case 2:
	    	System.out.println(a-b+"Difference");
	        break;
	    case 3:
	    	System.out.println("Multiplication "+a*b);
	        break;
	    case 4:
	    	System.out.println("Division "+a/b);
	        break;
	    case 5:
	    	System.out.println("Mode "+a%b);
	        break;    
	    default:
	    	System.out.println(" Enter Your Correct Choice.");
	        break;
	    }

	}

}
