//break
class BreakDemo 
{
	public static void main(String[] args) 
	{
		//打印1-10,附加条件当输出7时终止循环
		for(int i = 1;i <= 10;i ++)
		{
			if(i == 7)
			{
				break;//跳出,终止本次循环=跳出,终止for循环
			}
			System.out.println(i);
		}
		System.out.println("ending.............");

		//案例:循环输出100以内前5个3的倍数的数字
		/*
		  思路:
		  1.循环输出100以内所有的数字
		  2.判断哪些是3的倍数
		  3.如果是3的倍数,使用计数器递增1
		  4.当计数器的值为5的时候,就没必要继续循环了
		*/

		int count = 0;
		for(int i = 1;i <= 100;i ++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
				count ++;
			}

			if(count ==5)
			{
				break;
			}
		}
		System.out.println(count);
	}
}
