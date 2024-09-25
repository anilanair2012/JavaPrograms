/*"Assignment 18
WAP on Parameterised super calling statement (within multiple class)"*/

package basicprogram;

class first
{
first(int a,int b)

{
	
System.out.println("First");
}}
class second extends first
{
second(int a,String b)	
{
	super(2,3);
	System.out.println("second");	
}
}

public class AS18_Supercalling_parametrized extends second{
	AS18_Supercalling_parametrized(int a)
	{
		super(2,"3");
		System.out.println("Last");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AS18_Supercalling_parametrized (5);
	}
}

