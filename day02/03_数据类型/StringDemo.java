class StringDemo 
{
	public static void main(String[] args) 
	{
		//�ַ�������
		System.out.println("Hello World!");
		//String����
		String name = "��17";
		System.out.println("name ="+name);
		//���"Hello"
		System.out.println("\"Hello\"");

		name = "����"+"will"+",����17��";
		System.out.println(name);
		System.out.println("-------------------------");
		System.out.println(8 + 7 + "Hello");//�����15Hello
		System.out.println("Hello" + 7 + 8);//Hello78
		System.out.println(7 + "Hello" +8);//7Hello8
		String str = 17 + "Hello";//���һ���µ��ַ���17Hello
		System.out.println(str);
		String str2 = (String)17 + "ABC";// ����,����ת��������
	}
}
