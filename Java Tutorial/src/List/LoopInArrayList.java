package List;

import java.util.ArrayList;

public class LoopInArrayList {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		
		obj1.add(76676767);
		
		obj1.add("Manisha");
		
		obj1.add("Manisha");
		
		obj1.add('F');
		
		obj1.add(12.88);
		
		int myListSize=obj1.size();
		
		for(int i=0;i<myListSize;i++) {
			
			System.out.println("Values from ArrayList ====>"+obj1.get(i));
			
		}
		
		

	}

}
