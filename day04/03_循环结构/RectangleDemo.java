//输出矩形图案
class RectangleDemo 
{
	public static void main(String[] args) 
	{
		//方法1:
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("----------------------");

		
		//方法2:
		//第一行
		for(int i = 1;i <= 5;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//第二行
		for(int i = 1;i <= 5;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//第三行
		for(int i = 1;i <= 5;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//第四行
		for(int i = 1;i <= 5;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("----------------------");



		//方法3:
		for(int j = 1;j <=4;j ++)
		{
			for(int i = 1;i <= 5;i ++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
