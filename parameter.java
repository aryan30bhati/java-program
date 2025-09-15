public class parameter 
{
	public static void main(String args[]) {
		para(9,3,20);
		para(2,2,2);
	}
	public static void para (int a, int b , int  c)
	{
		int sum=a+b+c;
		int sub=45-sum;
		if(sum>45 ) {
			System.out.println("sum is : " +sum);
			
		}
		else {
			System.out.println("sub is:" +sub);
			
		}
	}
}