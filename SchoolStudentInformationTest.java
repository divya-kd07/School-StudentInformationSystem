/**
 * 
 */
package in.divy2624;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author divy2624
 *
 */
public class SchoolStudentInformationTest {

	//task1:To check the Registration process.
	
	@Test
	public void test1() 
	{
		Registration.Details();
		
	}
	
	//task2:To check the EmailValidation process.
	
	@Test
	public void test2() 
	{
		String email="divya@gmail.com";
		boolean userEmail=EmailValidation.isValid(email);
		assertEquals(true,userEmail);
	}
	
	@Test
	public void test3() 
	{
		String email="divyagmail.com";
		boolean userEmail=EmailValidation.isValid(email);
		assertEquals(false,userEmail);
	}

	//task33:To check the Login process.
	
	@Test
	public void test4() 
	{
		Login.UserLogin();
		
	}
	
	
}
