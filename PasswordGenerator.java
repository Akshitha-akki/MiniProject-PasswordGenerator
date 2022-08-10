//Random - This package will generate random values.
import java.util.Random;

public class PasswordGenerator
{
    public void generatePswd(int len)
    {
        System.out.println("Password:");
        
        //This are the Strings which we are going to pass to generate random password.
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0987654321";  
        String symbols = "!@#$%^&*_=+-/€.?<>`~";

        //Appending the strings
        String alphaNumeric = charsCaps + chars + nums + symbols;
        
        //Creating object for Random
        Random rnd = new Random();
        
        //Taking the Variable for password of char type.
        /*char[] password = new char[len];
        for (int i = 0; i < len; i++) 
        {
            password[i] = alphaNumeric.charAt(rnd.nextInt(alphaNumeric.length()));
            
        }
        System.out.println(password);	*/
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {

            // generate random index number
            int index = rnd.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }
          System.out.println(sb.toString());
	}
}
