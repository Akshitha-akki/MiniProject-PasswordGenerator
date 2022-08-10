import java.util.Scanner;

public class PasswordGenClass 
{
	public static void main(String[] args)throws IllegalArgumentException, Exception
	{
		Scanner scan = new Scanner(System.in);
		
		//Enter the password length
		System.out.println("Enter the length of the password : ");
        int length = scan.nextInt();
        
        //Creating the object for PasswordGenerator class
        PasswordGenerator obj = new PasswordGenerator();
       
        //tryCatchBlock
        try 
        {
        	obj.generatePswd(length);
        }
        catch (Exception e) 
        {
        	e.printStackTrace();
		}
        if(length == 0 )
        {
        	System.out.println("IllegalArgumentException");
        }
        if(length <0)
        {
        	System.out.println("NegativeArraySizeException");
        } 
        scan.close();
	}
}
