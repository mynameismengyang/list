class ForDemo 
{
	public static void main(String[] args) 
	{
		/*
			for(��ʼ���;boolean���ʽ;ѭ��֮��Ĳ������)
			{
				ѭ����
			}

			ִ��˳��:
			1.��ʼ�����
			2.boolean���ʽ:
					true:�����3��
					false:����ѭ��
			3.ִ��ѭ����
			4.ִ��ѭ��֮��Ĳ������
			5.�ٽ����2��

			ע��:��ʼ�����ֻ���ʼ��ʱ��,ִ��һ��
		*/

		//����1:��ӡ500��˧��
		/*
		for(int count = 1;count <= 500;count ++)
		{
			System.out.println("˧��" + count);
		}
		*/

		//����2:1-100��ӡ
		/*
		for(int number = 1;number <= 100;number ++)
		{
			System.out.println(number);
		}
		*/
		
		//����3:1-100�ĺ�
		int result = 0;
		for(int number = 1;number <= 100;number ++)
		{
			result = result + number;
			System.out.println(number);//100
		}
		System.out.println(result);//5050

	}
}
