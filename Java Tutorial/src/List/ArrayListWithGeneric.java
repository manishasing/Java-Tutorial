package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithGeneric {

	public static void main(String[] args) {
		
		ArrayList<String> obj1=new ArrayList<String>();
		
		obj1.add("Manisha");
		
		obj1.add("Selenium");
		
		obj1.add("QTP");
		

		for(String v:obj1) {
			
			System.out.println("Values are:"+v);
		}

	}

}
