class TernaryOperatorDemo 
{
	//����:�ָ�һ��С��,����������֮���ֵ
	public static void main(String[] args) 
	{
		/*
			1.��ȡ3.49����������--3;
			2.��ȡ3.49��С������--3.49-3-->0.49;
			3.��0.49��0.5���Ƚ�
				0.49 >= 0.5 -->3+1
				0.49 <  0.5 -->3
			��Ԫ�����,��Ŀ�����.
			�������� ���� = boolean���ʽ ? ֵ1 : ֵ2;
			
			���:boolean���ʽ���Ϊtrue,��Ԫ������ʽ�������ֵ1;
			����:boolean���ʽ���Ϊfalse,��Ԫ������ʽ�������ֵ2;
		*/

		double num = 3.49;
		int num1 = (int)num;
		double num2 = num - num1;
		int result = num2 >= 0.5 ? num1 + 1 : num1;
		System.out.println(result);

		//(1).�����������ֵ/��Сֵ;
		int a = 20;
		int b = 10;
		int ret = a > b ? a : b;
		System.out.println(ret);

		//(2).�ж�һ��������������ż��
		int n = 5;
		String res = n % 2 == 0 ? "ż��" : "����";
		System.out.println(res);
		}
}
