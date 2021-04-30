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

	//task3:To check the Login process.
	
	@Test
	public void test4() 
	{
		Login.UserLogin();
		
	}
	

	//task 4: Passing average for getting the grade.
	
	@Test
	public void test5() 
	{
		int average=65;
		String grade=GradeMarks.getGrade(average);
		assertEquals("C",grade);
	}
	
	@Test
	public void test6() 
	{
		String grade="B";
		GradeReview.Comment(grade);
		
	}
	
	
}
