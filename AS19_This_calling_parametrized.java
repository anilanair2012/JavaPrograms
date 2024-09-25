package basicprogram;

public class AS19_This_calling_parametrized {
	AS19_This_calling_parametrized(int a)
	{
	this("string");
	System.out.println("Integer is printed");
	}
	AS19_This_calling_parametrized(String b)
	{
		System.out.println("String is printed");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new AS19_This_calling_parametrized(2);
	}

}
