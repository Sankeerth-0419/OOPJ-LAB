class MethodOverloadingDemo
{
	float sum(float a,float b)
	{
		return a+b;
	}
	double sum(double a,double b,double c)
	{
		return a+b+c;
	}
	public static void main(String[] args)
	{
		MethodOverloadingDemo obj= new MethodOverloadingDemo();
		float result1 = obj.sum(10,20);
		System.out.println("sum of two numbers"+result1);
		double result2 = obj.sum(5,15,25);
		System.out.println("sum of thre numbers"+result2);
	}
}