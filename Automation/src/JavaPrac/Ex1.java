package JavaPrac;

public class Ex1 {

	public static void main(String[] args) {

		
		String Signal="red";
		
		switch(Signal) {
		
		case "red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Wait");
			break;
		case "green":
			System.out.println("go");
			break;
		
		default:
			System.out.println("dance");
		
		
		}
		
	}

}
