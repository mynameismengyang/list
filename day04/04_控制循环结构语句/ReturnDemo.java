class ReturnDemo 
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
		System.out.println("---------------------------");

        for(int i = 1;i <= 10;i ++)
		{
			if(i == 7)
			{
				return;//��������,ͬ�����������
			}
			System.out.println(i);
		}
		System.out.println("ending.............");
		//��ʱ,��һ��䲻ִ��
	}
}
