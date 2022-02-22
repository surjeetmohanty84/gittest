
public class MasterHelloOne {

	public static String getMessage() {
		System.out.println("Hello message");
		System.out.println("Hello From Master");

		System.out.println("Get Lost===========================");
		System.out.println("Changes from master");
		System.out.println("Changes from Feature branch....");
		return "Hello Git Master";
	}
	public static void main(String[] args) {
		System.out.println(getMessage());
	}

}
