package JavaPrac;

import java.util.ArrayList;
import java.util.List;

public class ExampleIterations {

	public static void main(String[] args) {

		
List<String>value=new ArrayList<>();

value.add("Manual Testing");
value.add("Selenium");
value.add("Automation");

System.out.println(value.size());

for(int i=0;i<value.size();i++) {
	System.out.println(value.get(i));
}

		
	
	}
}




