class  SwapVarDemo
{
	public static void main(String[] args) 
	{
		int a = 13;
		int b = 6;
		//����һ:��ӵ���������
		/*
		int temp;
		temp = a;
		a = b;
		b = temp;
		*/

		//������:����ӵ���������
		/*
		a = b - a;//���b��a֮��ľ���,���a��
		b = b - a;//a��ԭ��ľ���,���b��
		a = b + a;//b��ԭ��ľ���,���a��
		*/

       
		b = a - b;  //a=13  b=7
		a = a - b;  //a=6   b=7
		b = a + b;  //a=6   b=13
		
		/*
		b = a ^ b;
		a = a ^ b;
		b = a ^ b;
		*/
		System.out.println("a=" + a + ",b=" + b);
	}
}
