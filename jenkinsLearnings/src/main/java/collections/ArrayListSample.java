package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {

	
public void print() {
		
		ArrayList col=new ArrayList(); 
		col.add(10);
		col.add(34);
		col.add(null);
		col.add(56);
		col.add(30);
		col.add(3);
		System.out.println("ArrayList Elements:"+col);
		System.out.println("element present:"+col.contains(56));
	 Iterator its=col.iterator();
	 while(its.hasNext()) {
		 
		 System.out.println(its.next());
	 }
	 
	 Collections.sort(col);
	 System.out.println("ArrayList Elements:"+col);
		
	}
	public static void main(String[] args) {
		ArrayListSample obj=new ArrayListSample();
		obj.print();
		
		
	}

}
