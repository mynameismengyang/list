//++��--������
class ArithmeticOperatorsDemo2 
{
	public static void main(String[] args) 
	{
		/*
			++ǰ�����:
				++a;
				��ʾ,a���������ȼ�1,������.
			--��֪���:
				a++;
				��ʾ,a���������ȼ�1,�ѵ���1֮ǰ��ԭʼֵ��ȥ������.
		*/
		int a1 = 5;
		int b1 = ++ a1;
		System.out.println("a1=" + a1 + ",b1=" + b1);
		//a1=6,b1=6

		int a2 = 5;
		int b2 = a2 ++;
		System.out.println("a2=" + a2 + ",b2=" + b2);
		//a2=6,b2=5
	}
}
