//输出三角形图案
class TriantangleDemo 
{
	public static void main(String[] args) 
	{
		//方法1:
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("----------------");
		

		//方法2:
		//第一行:
		for(int i = 1;i <=1;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//第二行:
		for(int i = 1;i <=2;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//第三行:
		for(int i = 1;i <=3;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//第四行:
		for(int i = 1;i <=4;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("-----------------");

		//方法3:
		/*
		int line = 1;
		for(int i = 1;i <=line;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		line ++;
		//第二行:
		for(int i = 1;i <=line;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		line ++;
		//第三行:
		for(int i = 1;i <=line;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		line ++;
		//第四行:
		for(int i = 1;i <=line;i ++)
		{
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("-------------");
		*/

		//方法4:
		for(int line = 1;line <= 4;line ++)
		{
			for(int i = 1;i <=line;i ++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}





	}
}
