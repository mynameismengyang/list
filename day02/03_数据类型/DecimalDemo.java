//float,double����
class DecimalDemo
{
	public static void main(String[] args)
	{
		//С������(Ĭ����double���͵�)
		System.out.println(3.14);//double���͵ĳ���
		System.out.println(3.14F);//float���͵ĳ���
		System.out.println(3.14e2);//314.0

		//С������
		//С������ ������ = С������;
		double pi = 3.14;
		float pi2 = 3.14F;
		double a = 1.000000000000000000000001;
		double b = 1.00000000000001234;
		System.out.println(a + b);
	}
}