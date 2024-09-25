/*
"Assignment 17
WAP on Non Parameterised super calling statement (within different class)"*/

package basicprogram;
class One{
	One()
	{
		System.out.println("First");
	}
	
}
class two extends One
{
	two()
	{
	super();
	System.out.println("second");
	}
}
public class AS17_Superclass_Non_parametrized extends two {

	AS17_Superclass_Non_parametrized()
{
	super();
System.out.println("last class");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AS17_Superclass_Non_parametrized ();
	}

}
