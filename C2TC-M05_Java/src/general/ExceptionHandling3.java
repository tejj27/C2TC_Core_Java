package general;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		int a=45;
		int b=0;
		
		try
		{
			arr[4]=35;
			int c=a/b;
			System.out.println("In try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
			System.out.println("Exception in try block");
		}
		catch(ArithmeticException ae)
		{
		System.out.println("Exception in try block");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("In the class");

	}

}