//break
class BreakDemo 
{
	public static void main(String[] args) 
	{
		//��ӡ1-10,�������������7ʱ��ֹѭ��
		for(int i = 1;i <= 10;i ++)
		{
			if(i == 7)
			{
				break;//����,��ֹ����ѭ��=����,��ֹforѭ��
			}
			System.out.println(i);
		}
		System.out.println("ending.............");

		//����:ѭ�����100����ǰ5��3�ı���������
		/*
		  ˼·:
		  1.ѭ�����100�������е�����
		  2.�ж���Щ��3�ı���
		  3.�����3�ı���,ʹ�ü���������1
		  4.����������ֵΪ5��ʱ��,��û��Ҫ����ѭ����
		*/

		int count = 0;
		for(int i = 1;i <= 100;i ++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
				count ++;
			}

			if(count ==5)
			{
				break;
			}
		}
		System.out.println(count);
	}
}
