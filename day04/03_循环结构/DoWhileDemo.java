//do while ѭ�����
class  DoWhileDemo
{
	public static void main(String[] args) 
	{
		/*
		    while(boolean���ʽ)
			{
				//ѭ����(��Ҫ�ظ���������)
			}
		--------------------------------------
			do
			{
				//ѭ����(��Ҫ�ظ��ɵ�����)
			}
			while(boolean���ʽ);
		*/
		//����1:��500��˧��
		/*
		int count = 0;
		do
		{
			System.out.println("˧��" + count);
			count ++;
		}while (count <500);
		*/

		//����2:1-100��ӡ
		/*
		int number = 1;
		do
		{
			System.out.println(number);
			number ++;
		}
		while (number <= 100);
		*/

		//����3:����100����������֮��
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
