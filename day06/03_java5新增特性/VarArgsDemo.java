class VarArgsDemo 
{
	public static void main(String[] args)
	{
		double[] num = new double[]{10.0,20.0,30.0,40.0};
		double i = getSum(num);
		System.out.println(i);
	}

	static double getSum(double[] sss)
	{
		double sum = 0.0;
		for(double price : sss)
		{
			sum += price;
		}
		return sum;
	}
}
