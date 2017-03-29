//while循环句
public class whileDemo
{
	public static void main(String[] args)
	{
		/*
			语法格式:
			while(boolean表达式)
			{
				如果boolean表达式为rue,就执行循环体
				//TODO
			}
			如果boolean表达式结果为false,则跳过循环体,不执行循环体.
		*/

		//问题1:叫500声帅哥
		int count = 0;
		while (count < 500)
		{
			System.out.println("帅哥" + count);
	     	count ++;
		}
		System.out.println("ending.......");
		
		//问题2:将1~100打印
		int num = 1;
		while(num <= 100)
		{
			System.out.println(num);
			num ++;
		}
		//问题3:求1-100之和
		int number = 1;
		int result = 0;
		while(number <= 100)
		{
			result = result + number;
			number ++;
		}
		System.out.println(result);
		
	}
}