class TernaryOperatorDemo 
{
	//需求:现给一个小数,求四舍五入之后的值
	public static void main(String[] args) 
	{
		/*
			1.获取3.49的整数部分--3;
			2.获取3.49的小数部分--3.49-3-->0.49;
			3.把0.49和0.5作比较
				0.49 >= 0.5 -->3+1
				0.49 <  0.5 -->3
			三元运算符,三目运算符.
			数据类型 变量 = boolean表达式 ? 值1 : 值2;
			
			如果:boolean表达式结果为true,三元运算表达式结果就是值1;
			否则:boolean表达式结果为false,三元运算表达式结果就是值2;
		*/

		double num = 3.49;
		int num1 = (int)num;
		double num2 = num - num1;
		int result = num2 >= 0.5 ? num1 + 1 : num1;
		System.out.println(result);

		//(1).两个数求最大值/最小值;
		int a = 20;
		int b = 10;
		int ret = a > b ? a : b;
		System.out.println(ret);

		//(2).判断一个数是奇数还是偶数
		int n = 5;
		String res = n % 2 == 0 ? "偶数" : "奇数";
		System.out.println(res);
		}
}
