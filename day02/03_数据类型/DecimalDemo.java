//float,double类型
class DecimalDemo
{
	public static void main(String[] args)
	{
		//小数常量(默认是double类型的)
		System.out.println(3.14);//double类型的常量
		System.out.println(3.14F);//float类型的常量
		System.out.println(3.14e2);//314.0

		//小数变量
		//小数类型 变量名 = 小数常量;
		double pi = 3.14;
		float pi2 = 3.14F;
		double a = 1.000000000000000000000001;
		double b = 1.00000000000001234;
		System.out.println(a + b);
	}
}