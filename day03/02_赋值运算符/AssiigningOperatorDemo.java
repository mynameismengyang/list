class AssiigningOperatorDemo 
{
	public static void main(String[] args) 
	{
		//���ܾ���,��������ֵ.
		String name;
		name = "Hello";
		System.out.println(name);//��ֵ

		/*
			1.����int���ͱ���age;
			2.���ڴ��д洢��������17;
			3.��17����age����;
		*/
		//����һ��int���ͱ���,�����ó�ʼֵΪ17
		int age = 17;
		System.out.println("Hello World!");
		System.out.println("------------");
		/*
			+= ��ֵ�����:�м䲻�ܴ�ո�,�Դ���ʿ����ת��
			int a = 10;
			a += 5;�ȼ��� a = (int)(a + 5);
		*/
		int a = 10;
		a += 5;
		System.out.println(a);//15

		short s = 30;
		//s = s + 5;// ������ʧ����
		//s += 5;//35(�Դ���ʿ����ת��)
		s = (short)(s + 5);//35(�ȼ�����һ��)
		System.out.println(s);

	}
}
