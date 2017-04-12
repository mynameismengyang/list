class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println("main方法前,x=" + x);//10
		change(x);
		System.out.println("main方法后,x=" + x);//10

	}

	//修改变量
	static void change(int x)
	{
		System.out.println("change方法前,x=" + x);//10
		x = 50;
		System.out.println("change方法后,x=" + x);//50
	}
}
