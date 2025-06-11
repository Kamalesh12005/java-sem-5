package Day3;

public class OverLoading {
	
	public void sum(int a,int b)
	{
		System.out.println("the sum is "+(a+b));
	}
	public void sum(double a,double b)
	{
		System.out.println("the sum is "+(a+b));
	}
	 
	 	
}
class TestOverLoading
{
	public static void main(String[] args) {
		OverLoading ov=new OverLoading();
		ov.sum(15, 25);
		ov.sum(25, 25);
	}
}