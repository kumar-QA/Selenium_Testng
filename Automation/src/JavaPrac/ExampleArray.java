package JavaPrac;

import java.util.ArrayList;
import java.util.List;

public class ExampleArray {

	public static void main(String[] args) {

		List value=new ArrayList<>();
		value.add("Manual testing");
		value.add("Selenium Testing");
		value.add("Java");
		value.add(100);
		value.add('@');
		
		for(int i=0;i<value.size();i++) {
			System.out.println(value.get(i));
		}
		
	}

}
