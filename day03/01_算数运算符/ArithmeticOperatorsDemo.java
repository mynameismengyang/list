//���������:����������������ķ���
class ArithmeticOperatorsDemo
{
	public static void main(String[] args)
	{
		//������
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println("---------------------");
		//�����ַ�
		System.out.println('A' + 'B');//131
		//�����ַ���
		System.out.println("AAAA" + "BBBB");//
		System.out.println("---------------------");

		System.out.println(10/3);//3
		System.out.println(9876 / 1000 * 1000);//9000
		//System.out.println(100 / 0);//lang.ArithmeticException: / by zero	
		//ע��:���治ִ��
		//System.out.println(100.0 / 0);//Infinity�������
		//System.out.println(-100.0 / 0);//-Infinity�������
		System.out.println(0.0/0.0);//NaN not a number
        double a = 0.0 / 0/0;
		System.out.println(a == a);//false

        System.out.println("ending...........");

	}
}