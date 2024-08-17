import java.util.Scanner;
class UI{
    static Scanner sc = new Scanner(System.in);
	public static void calci()
	{
		boolean flag = true;
		do
		{
	  	System.out.println("Welcome to Calculator App");
	    System.out.println("\n1.SignUp\n2.LoginUp\n3.Exit");
	    int input = sc.nextInt();	
		switch(input)
		{
			case 1:
			{
				LoginPage.signUp();
			}
			break;
			
			case 2:
			{
				LoginPage.login();
			}
			break;
			
			case 3:
			{
				flag = false;
			}
			break;
		}
		}
		while(flag);
		
	}
	public static void main(String[] args)
	{
		calci();
		
	}
}


	   
		   