/**
 * 
 */
package in.divy2624;

/**
 * @author divy2624
 *
 */
public class Login {
	public static void UserLogin(){
	System.out.println("************************************STUDNET/PARENT LOGIN PAGE**************************************");
	String emailId = "divya@gmail.com";
	String userPassword="divyamar";
	long mobNum=9087898768l;
	String mobileNumber=String.valueOf(mobNum);
	
    if (EmailValidation.isValid(emailId))//If the email is to check correct format or not
    {
    	System.out.println("ENTER YOUR EMAIL-ID : "+emailId);
    	if(userPassword.length()<=8) //comparing the password for password checking
    	{
    		System.out.println("ENTER YOUR PASSWORD : "+userPassword);//The password includes 8 digits
        		 if(mobileNumber.length()==10) 
        		 {
        			 System.out.println("ENTER YOUR MOBILE NUMBER : "+mobileNumber);//if you or anyone   login your account each and every time,the alert message send your mobile number
        		 }
        		 else {
        			 System.out.println("INVALID MOILE NUMBER CREDENTIALS      PLEASE ENTER YOUR CORRECT MOBILE NUMBER ");
        		 }
        }
    	else
    	{
    		System.out.println("INVALID PASSWORD CREDENTIALS       PLEASE ENTER YOUR CORRECT PASSWORD");
    	}
    			 
    }
    else
    {
        System.out.print("INVALID EMAIL-ID CREDENTIALS         PLEASE ENTER YOUR CORRECT EMAIL-ID");
    }
    }
	
	    
	

}
