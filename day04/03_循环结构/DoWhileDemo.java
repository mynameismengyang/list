//do while 循环语句
class  DoWhileDemo
{
	public static void main(String[] args) 
	{
		/*
		    while(boolean表达式)
			{
				//循环体(需要重复做的事情)
			}
		--------------------------------------
			do
			{
				//循环体(需要重复干的事情)
			}
			while(boolean表达式);
		*/
		//问题1:叫500声帅哥
		/*
		int count = 0;
		do
		{
			System.out.println("帅哥" + count);
			count ++;
		}while (count <500);
		*/

		//问题2:1-100打印
		/*
		int number = 1;
		do
		{
			System.out.println(number);
			number ++;
		}
		while (number <= 100);
		*/

		//问题3:计算100以内正整数之和
		int number = 1;
		int result = 0;
		do
		{
			result = result + number;
			number ++;
		}
		while (number <= 100);
		System.out.println(result);//5050
		System.out.println(number);//number = 101

	}
}
