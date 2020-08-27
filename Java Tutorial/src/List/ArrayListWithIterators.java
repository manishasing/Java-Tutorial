package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterators {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(76676767);
		
		obj1.add("Manisha");
		
		obj1.add("Manisha");
		
		obj1.add('F');
		
		obj1.add(12.88);
		
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext()) {
			
			Object value=itr.next();
			
			System.out.println("Values are:"+value);
		}
		
		

	}

}
