class ForDemo 
{
	public static void main(String[] args) 
	{
		/*
			for(初始语句;boolean表达式;循环之后的操作语句)
			{
				循环体
			}

			执行顺序:
			1.初始化语句
			2.boolean表达式:
					true:进入第3步
					false:跳过循环
			3.执行循环体
			4.执行循环之后的操作语句
			5.再进入第2步

			注意:初始化语句只在最开始的时候,执行一次
		*/

		//问题1:打印500次帅哥
		/*
		for(int count = 1;count <= 500;count ++)
		{
			System.out.println("帅哥" + count);
		}
		*/

		//问题2:1-100打印
		/*
		for(int number = 1;number <= 100;number ++)
		{
			System.out.println(number);
		}
		*/
		
		//问题3:1-100的和
		int result = 0;
		for(int number = 1;number <= 100;number ++)
		{
			result = result + number;
			System.out.println(number);//100
		}
		System.out.println(result);//5050

	}
}
