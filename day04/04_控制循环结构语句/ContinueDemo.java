class ContinueDemo 
{
	public static void main(String[] args) 
	{
		//���1-10,������������4
		for(int i = 1;i <= 10;i ++)
		{
			if(i == 4)
			{
				continue;//��������ѭ����,�ٽ����µ�һ��ѭ��
			}
			System.out.println(i);
		}

		//���100-200֮�䲻��3�ı���������

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
