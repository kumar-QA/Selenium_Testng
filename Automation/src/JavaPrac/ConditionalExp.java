package JavaPrac;

public class ConditionalExp {

	public static void main(String[] args) {

		String Signal="red";
		
		switch(Signal) {
		case "red":
			System.out.println("Stop");
		break;
		case "Yellow":
			System.out.println("Be Ready");
		 break;
		case "green":
			System.out.println("Run");
			break;
		default:
			System.out.println("Park Vehical Start Dancing");
		
	}

}
}
