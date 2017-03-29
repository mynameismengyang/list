//整数类型(byte,short,int,long)
public class IntegerDemo
	{
	public static void main(String[] args)
	{
	/*
	1.二进制整数:0b或0B开头(java7的新特性),如:int a = 0B110;
	2.八进制整数:要求以0开头,如:int a = 012;
	3.十进制整数:如:int a = 17;
	4.十六进制整数:要求0x开头,如:int a = 0x12;
	*/
	//表示10进制的常量
	System.out.println(110);
	//表示2进制的常量
	System.out.println(0b01101110);
	//表示8进制的常量
	System.out.println(0156);
	//表示16进制的常量
	System.out.println(0x6e);

	//long 后加L
	long num = 127L;
	System.out.println(num);
	}

}