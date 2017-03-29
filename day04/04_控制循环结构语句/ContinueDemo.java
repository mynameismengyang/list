class ContinueDemo 
{
	public static void main(String[] args) 
	{
		//输出1-10,附加条件跳过4
		for(int i = 1;i <= 10;i ++)
		{
			if(i == 4)
			{
				continue;//跳过本次循环体,再进入下的一次循环
			}
			System.out.println(i);
		}

		//输出100-200之间不是3的倍数的数字

		for(int i = 100;i <= 200;i ++)
		{
			if(i % 3 == 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
