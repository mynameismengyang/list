//打印九九乘法表
class Table99Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("1 * 1 = 1");
		System.out.println("1 * 2 = 2 2 * 2 = 4");
		System.out.println("1 * 3 = 3 2 * 3 = 6 3 * 3 = 9");
		System.out.println("----------------------------------------");

		//找规律:第1位数<=第2位数,第2位数=行数
		//第1行
		/*
		int line = 1;//第2位数=行数
		for(int i = 1;i <= line;i ++)
		{
			System.out.print(i + " * " + line + " = " + i * line + "\t");
		}
		System.out.println("");
		line ++;

		//第2行
		for(int i = 1;i <= line;i ++)
		{
			System.out.print(i + " * " + line + " = " + i * line + "\t");
		}
		System.out.println("");
		line ++;

		//第3行
		for(int i = 1;i <= line;i ++)
		{
			System.out.print(i + " * " + line + " = " + i * line + "\t");
		}
		System.out.println("");
		line ++;
		*/

		for(int line = 1;line <= 9;line ++)
		{
			for(int i = 1;i <= line;i ++)
			{
				System.out.print(i + " * " + line + " = " + i * line + "\t");
			}
			System.out.println("");

		}



	}
}
