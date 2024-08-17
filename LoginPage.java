import java.util.Scanner;
class LoginPage
{
	static int userid,password;
	static long contact;
	static boolean signup_done = false;	
    static Scanner sc = new Scanner(System.in);
	public static void signUp()
	{
		if(signup_done)
		{
			System.out.println("\t\t\t Go and Login");
		}
		else
		{
	     	System.out.print("\t\t\tPlease Create your UID:");
		    userid = sc.nextInt();
		
		    System.out.print("\t\t\tCreate the Strong Password:");
		    password = sc.nextInt();
		
		    System.out.print("\t\t\tEnter the Contact:");
	    	contact = sc.nextLong();
		
		    signup_done=true;
			System.out.println("\t\t\tThank you");
		}
	}
	
	public static void login()
	{
		if(signup_done)
		{
			System.out.print("\t\t\tEnter your UID:");
		    int userenteredid = sc.nextInt();
			System.out.print("\t\t\tEnter your Password:");
		    int pwdenteredid = sc.nextInt();
			if(userid==userenteredid && password == pwdenteredid) 
			{
				Calculator.homePage();
			}
			else
			{
				System.out.print("\t\t\tLogin failed");
			}
			
		}
	}
	
}
	
       