
public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try //Used to place the exception inside this block
		{
		int i = Integer.parseInt(args[0]);
		int j = i/(i-9);
		System.out.println("Value of j:"+j);
		}											//Can not write any statement between try and catch 
		catch(ArrayIndexOutOfBoundsException ex)	//catch is used to handle the exception
		{
			System.out.println("Command Line Arg Not Passed");
		}
		catch(ArithmeticException ex)				//multiple catch is possible
		{
			System.out.println("Divide By Zero");
		}
		catch(NumberFormatException ex)				//nesting can be there in try, catch and finally
		{
			System.out.println("String to int");
		}
		finally
		{
		System.out.println("Main End");//Used in resource closing Finally Block
										// finally block will not run if we hv used exit in catch block and if we used exit in finally block it will run partially
		}
	}
}
