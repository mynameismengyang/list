/*
表达式(expression):是由数字,运算符,数字分组符(),
变量/常量等以求得一个结果的有意义排列组合.

用运算符号连接的变量/常量可称为表达式.
那么也就是说表达式是由常量,变量,运算符,括号组成能求得值的有意义结果的语句.
*/
public class ExpressionDemo
{
	public static void main(String[] args)
	{
		System.out.println(1 + 2 + 3);
		System.out.println("------------------");
		int result = 1 + 2 +3;
		System.out.println(result);
		System.out.println("------------------");
		int a = 12;
		int b = 13;
		int c = 14;
		result=(a + b)/c;
		System.out.println(result);
	}
}