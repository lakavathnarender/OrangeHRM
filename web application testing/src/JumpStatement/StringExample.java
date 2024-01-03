package JumpStatement;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var='A';
		System.out.println(var);
		
		char charVariable='A';
		System.out.println(charVariable);
		
		
		String stringVariable="AB";
		System.out.println("The value of the variable stringVariable is:"+stringVariable);
		
		
		String srini="This is a Super Good Batch of Mr.Vishnu";
		System.out.println(srini);
		
		
		System.out.println("**********************");
		System.out.println();
		
		
		String string1="LiveTech";
		String string2="Venkat";
		
		if(string1.equals(string2))
		{
		System.out.println("string variable value is Equal to string2 variable value");
		}
		else
		{
		System.out.println("string1 variable value Not equal to string2 variable value");	
			
		}
		
		
		
		String string3="LiveTech";
		String string4="Venkat";
		
		if(string3.equals(string4))
		{
		System.out.println("string3 variable value is Equal to string4 variable value");
		}
		else
		{
		System.out.println("string3 variable value Not equal to string4 variable value");	
			
		}
		
		
		
		String string5="LiveTech";
		String string6="Venkat";
		
		if(string5.equalsIgnoreCase(string6))
		{
		System.out.println("string5 variable value is Equal to string6 variable value");
		}
		else
		{
		System.out.println("string5 variable value Not equal to string6 variable value");	
			
		}
		
		
		System.out.println("#####################");
		System.out.println();
		
		String string7="LiveTech";
		String string8="Venkat";
		
		if(string7.equalsIgnoreCase(string8))
		{
		System.out.println("string7 variable value is Equal to string8 variable value");
		}
		else
		{
		System.out.println("string7 variable value Not equal to string8 variable value");	
			
		}
		
		System.out.println("#####################");
		System.out.println();
		
		String string9="LiveTech";
		String string10="Tech";
		
		if(string9.contains(string10));
		{
		System.out.println("string value exsting");	
		}
		
		{
		System.out.println("Expected String Not Found");	
		}
		System.out.println("######## To Upper Case ###########");
		System.out.println();
		int stringCharactersLength=string9.length();
		System.out.println("The number of characters of the string9 variable is:-"+stringCharactersLength);
		

		
		
		char alphabetAtALocationOfTheString=string9.charAt(5);
		String alphabetAtALocatoionOfTheString;
		System.out.println("The character at the 5th index of the string variable string9 is:-"+alphabetAtALocationOfTheString);
		
		
	}
	
}

	
			
		
		
		
		
				
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				

	


