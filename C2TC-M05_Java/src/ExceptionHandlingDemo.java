
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			int data=100/0;
		}
		catch(ArithmeticException ae)
		{
			ae.getMessage();
		}
		System.out.println("Exception Handling Demo");

	}

}
