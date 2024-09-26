package basicprogram;

public class As20_nonparamthiscalling {
	As20_nonparamthiscalling (int a)
	{
		System.out.println("printfirst");	
	}
	As20_nonparamthiscalling ()
	{
		this(2);
		System.out.println("printsecond");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new As20_nonparamthiscalling();
	}

}
