package labtest5;

import java.util.ArrayList;
import java.util.List;

public class DeleteElement {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println(list_Strings);
		 
		  list_Strings.remove(2);

		  System.out.println("After removing third element from the list:\n"+list_Strings);

	}

}
