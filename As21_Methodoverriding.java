/*"Assignment 21
WAP on Method Overriding"*/
package basicprogram;
class parent
{
	void login()
	{
	System.out.println("First");
	}
	
}
public class As21_Methodoverriding extends parent {

	void login()
	{
		System.out.println("second");
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		As21_Methodoverriding as1=new As21_Methodoverriding();
		as1.login();
	}

}
