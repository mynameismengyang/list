//�����Ķ����ʹ��
class MethodDemo2 
{
	//�޲����޷���.
	//����:����һ������,ר�Ŵ�ӡ------------------
	static void p()
	{
		System.out.println("-------------------");
	}

	//�в����޷���.
	//����:��ӡ����ֵ.
	static void pValue(String val)
	{
		System.out.println(val);
	}

	//�޲����з���.
	//����:��ӡ17.
	static int getAge()
	{
		return 17;
	}

	//�в����з���.
	//����:���������ĺ�.
	static int getSum(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args) 
	{
		MethodDemo2.p();
		MethodDemo2.pValue("hello");
		MethodDemo2.pValue("world");
		System.out.println("Hello World!");

		//���з���ʱ,����һ����������,�ٴ�ӡ
		int age = MethodDemo2.getAge();
		System.out.println(age);

		int sum = MethodDemo2.getSum(3,5);
		System.out.println(sum);
	}
}
