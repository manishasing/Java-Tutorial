package List;

import java.util.ArrayList;

public class EnhanceForloop {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(76676767);
		
		obj1.add("Manisha");
		
		obj1.add("Manisha");
		
		obj1.add('F');
		
		obj1.add(12.88);
		
		
		for(Object abc:obj1) {
			System.out.println("Value is :"+abc);
		}
		
		

	}

}
