class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		/*
			switch(���ͱ��ʽ)
			{
				case Aֵ: ִ�����;break;
				case Bֵ: ִ�����;break;
				case Cֵ: ִ�����;break;
				......
				default:������ֵ�����Ǳ��ʽ�Ľ��,��ִ������.
			}
		*/
		int weekday = 0;
		switch(weekday)
		{
			case 1 :System.out.println("��һ");break;
			case 2 :System.out.println("�ܶ�");break;
			case 3 :System.out.println("����");break;
			case 4 :System.out.println("����");break;
			case 5 :System.out.println("����");break;
			case 6 :System.out.println("����");break;
			case 7 :System.out.println("����");break;
			default:System.out.println("��,û����һ��");


		}
	}
}
