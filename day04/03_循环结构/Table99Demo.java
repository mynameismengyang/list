//��ӡ�žų˷���
class Table99Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("1 * 1 = 1");
		System.out.println("1 * 2 = 2 2 * 2 = 4");
		System.out.println("1 * 3 = 3 2 * 3 = 6 3 * 3 = 9");
		System.out.println("----------------------------------------");

		//�ҹ���:��1λ��<=��2λ��,��2λ��=����
		//��1��
		/*
		int line = 1;//��2λ��=����
		for(int i = 1;i <= line;i ++)
		{
			System.out.print(i + " * " + line + " = " + i * line + "\t");
		}
		System.out.println("");
		line ++;

		//��2��
		for(int i = 1;i <= line;i ++)
		{
			System.out.print(i + " * " + line + " = " + i * line + "\t");
		}
		System.out.println("");
		line ++;

		//��3��
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
