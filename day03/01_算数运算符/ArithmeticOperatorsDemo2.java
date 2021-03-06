//++和--的问题
class ArithmeticOperatorsDemo2 
{
	public static void main(String[] args) 
	{
		/*
			++前置情况:
				++a;
				表示,a变量自身先加1,再运算.
			--后知情况:
				a++;
				表示,a变量自身先加1,把递增1之前的原始值拿去做运算.
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
