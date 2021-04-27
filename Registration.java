package in.divy2624;

import java.util.ArrayList;

public class Registration {
	
	public static void getRegister(){
		System.out.println("************************************APPLICATION************************************");
		System.out.println("************************************WELCOME****************************************");
		String name=getNames();
		System.out.println(name);
		String details=getDetails();
		System.out.println(details);

	}
	
	public static boolean getName(String name) 
	{
		// TODO Auto-generated method stub
		 boolean checkName;
		 if( name.equals(name.toUpperCase()) )
		 {
	            checkName=true;
		 }
	        else
	       {
	        	checkName=false;

	       }
		 return checkName;
        
	}
	
	public static String getNames()
	{
		// TODO Auto-generated method stub
		String name1="K.DIVYA";
		if(getName(name1)) //check whether the name is capital not
		{
			System.out.println("NAME OF THE STUDENT  ( WRITE IN CAPITAL WITH INITIAL) :	"+ name1);
		}
		else 
		{
			System.out.println("PLEASE ENTER YOUR NAME IN CAPS WITH INITIAL");
		}
		String name2="R.KUMAR";
		if(getName(name2)) //check whether the father name is capital not
		{
			System.out.println("FATHER NAME  ( WRITE IN CAPITAL WITH INITIAL) :	"+ name2);
		}
		else 
		{
			System.out.println("PLEASE ENTER YOUR NAME IN CAPS WITH INITIAL");
		}
		String name3="K.RAJESWARI";
		if(getName(name3)) //check whether the mother name is capital not
		{
			System.out.println("MOTHER NAME  ( WRITE IN CAPITAL WITH INITIAL) :	"+ name3);
		}
		else 
		{
			System.out.println("PLEASE ENTER YOUR NAME IN CAPS WITH INITIAL");
		}
		return null;
	}
	
	public static String getDetails()
	{
				ArrayList<String> details = new ArrayList<String>();
				details.add("divya@gmail.com");
				details.add("divyamar");
				details.add("FEMALE");
				details.add("ANNA NAGAR");
				details.add("CHENNAI");
				details.add("MASON");
				details.add("A+ve");
				details.add("IX");
					System.out.println("EMAILID : "+details.get(0));
			        System.out.println("PASSWORD(MINIMUM 4 CHARACTERS): "+details.get(1));
					System.out.println("GENDER : "+details.get(2));
					System.out.println("ADDRESS : "+details.get(3));
					System.out.println("CITY : "+details.get(4));
					System.out.println("FATHER OR MOTHER OCCUPATION : "+details.get(5));
					System.out.println("BLOOD GROUP : "+details.get(6));
					System.out.println("STANDARD : "+details.get(7));
				long mobileNumber=9087898768l;
					System.out.println("PARENT MOBILE NUMBER : "+mobileNumber);
				ArrayList<String> dateDetails= new ArrayList<String>();
				dateDetails.add("07.06.2000");
				dateDetails.add("27.04.2021");
					System.out.println("DATE OF BIRTH : "+dateDetails.get(0));
					System.out.println("DATE OF JOINING : "+dateDetails.get(1));
				return null;
	}
	

}
