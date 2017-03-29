//循环结构的死循环
class LoopDemo 
{
	public static void main(String[] args) 
	{
		//while 的死循环
		/*
		while(true)
		{
		System.out.println("美女");
		}
		*/

		//do while 的死循环
		/*
		do
		{
			System.out.println("帅哥");
		}while(true);
		*/

		//for 的死循环
		/*
		for(;;)
		{
			System.out.println("美女");
		}
		*/

		//for循环中哪些位置可以输出打印
		for(System.out.println("初始化");;System.out.println("循环之后"))
		{
			System.out.println("循环体");
		}
	}
}
