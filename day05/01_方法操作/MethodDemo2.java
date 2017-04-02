//方法的定义和使用
class MethodDemo2 
{
	//无参数无返回.
	//需求:定义一个方法,专门打印------------------
	static void p()
	{
		System.out.println("-------------------");
	}

	//有参数无返回.
	//需求:打印任意值.
	static void pValue(String val)
	{
		System.out.println(val);
	}

	//无参数有返回.
	//需求:打印17.
	static int getAge()
	{
		return 17;
	}

	//有参数有返回.
	//需求:求两个数的和.
	static int getSum(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args) 
	{
		MethodDemo2.p();
		MethodDemo2.pValue("hello");
		MethodDemo2.pValue("world");
		System.out.println("Hello World!");

		//当有返回时,定义一个变量接收,再打印
		int age = MethodDemo2.getAge();
		System.out.println(age);

		int sum = MethodDemo2.getSum(3,5);
		System.out.println(sum);
	}
}
