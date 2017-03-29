//字符
class CharDemo
{
	public static void main(String[] args)
	{
		/*
		char常量有3中表示形式:
		1>:直接使用单个字符来指定字符常量,格式如'A','7'.此时使用单引号直接表示字符
		2>:直接作为十进制整数数值使用,但是数据范围在[0,65535],格式如97,打印出的数值依然是ASCII表对应的字符
		3>:和2一样,只不过表示的是16进制的数值
		*/
		char c1 = 'A';//直接表示符号
		System.out.println(c1);

		char c2 = 65;//表示符号对应的10进制顺序
		System.out.println(c2);

		char c3 = '\u0041';//使用16进制的顺序
		System.out.println(c3);
	}
}