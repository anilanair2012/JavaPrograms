//Assignment 16 Multi level inheritance by using static and Non Static methods by using 4 classes

package basicprogram;
class greatgrandfather
{
	static void mul(int a,int b)
	{
	int mul=a*b;
System.out.println(mul);
}
}	
class grandFather extends greatgrandfather
{
	void sub(int a,int b)
	{
	int sub=a-b;
	System.out.println(sub);
}
}
class Father extends grandFather
{
	static void add(int a,int b)
	{
	int sum=a+b;
	System.out.println(sum);
}
}

public class AS16_Multi_level_static extends Father {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Multi_level_static ms1=new Multi_level_static();
add(2,5);
ms1.sub(5,2);
mul(2,5);
	}

}
