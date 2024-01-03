package JumpStatement;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=6;i++)
		{
		System.out.println(i+"Selenium");	
		if(i==3)
		{
		System.out.println(i+"WebDriver");	
		continue;
		}
		
		System.out.println(i+"Testing");
		System.out.println("Laddu");
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println();
		
		for(int i=2;i<=3;i++)
		{
			System.out.println(i+"Selenium");
			if(i==3)
			{
		System.out.println(i+"WebDriver");
		continue;
			}
			System.out.println(i+"Testing");
			System.out.println("Laddu");
		}
	}
}

	
	
		
		
		

	


