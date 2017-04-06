//控制外层循环
class LoopInLoopControl 
{
	public static void main(String[] args) 
	{
		//第2位数=行数line,第1位数<=line
		outter:for(int line = 1;line <= 9;line ++)
		{
			for(int i = 1;i <= line;i ++)
			{
				if(line == 5)
				{
					break outter;
				}
				System.out.print(i + " * " + line + " = " + i * line + "\t");
			}
			System.out.println("");
		}
	}
}
