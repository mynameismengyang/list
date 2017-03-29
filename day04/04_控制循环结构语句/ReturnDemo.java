class ReturnDemo 
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
		System.out.println("---------------------------");

        for(int i = 1;i <= 10;i ++)
		{
			if(i == 7)
			{
				return;//跳出方法,同样后不能有语句
			}
			System.out.println(i);
		}
		System.out.println("ending.............");
		//此时,上一语句不执行
	}
}
