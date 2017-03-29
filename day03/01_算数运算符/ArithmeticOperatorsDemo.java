//算数运算符:用来处理四则运算的符号
class ArithmeticOperatorsDemo
{
	public static void main(String[] args)
	{
		//操作数
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println("---------------------");
		//操作字符
		System.out.println('A' + 'B');//131
		//操作字符串
		System.out.println("AAAA" + "BBBB");//
		System.out.println("---------------------");

		System.out.println(10/3);//3
		System.out.println(9876 / 1000 * 1000);//9000
		//System.out.println(100 / 0);//lang.ArithmeticException: / by zero	
		//注意:后面不执行
		//System.out.println(100.0 / 0);//Infinity正无穷大
		//System.out.println(-100.0 / 0);//-Infinity负无穷大
		System.out.println(0.0/0.0);//NaN not a number
        double a = 0.0 / 0/0;
		System.out.println(a == a);//false

        System.out.println("ending...........");

	}
}