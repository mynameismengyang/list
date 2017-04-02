//方法的递归操作
class RecursionDemo
{
	static int F(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			return F(n - 1) + F(n - 2);
		}
	}
	public static void main(String[] args) 

	{
		int ret = RecursionDemo.F(6);
		System.out.println(ret);
		System.out.println("Hello World!");
	}
}
