public class TypeConvertDemo
{
	public static void main(String[] args) 
	{
		/*
			byte的二进制:00000101
		   short的二进制:00000000_000000101
		     int的二进制:00000000_00000000_00000000_00000101
		*/
		byte b1 = 5;
		short s1 = b1;
		int i1 = s1;
		long l1 = i1;

		float f1 = l1;//long-->float
		double d1 = f1;
		System.out.println(d1);


		double pi =3.14;
		int i2 = (int)pi;//double-->int
		System.out.println(i2);

		//直接把double类型的常量,赋值给int类型变量i3
		int i3 = (int)(3.14 + 1.2);
		System.out.println(i3);

		//整数常量,默认是int类型
		//把一个int类型常量直接赋值给byte类型变量
		byte b2 = 125;
		System.out.println(b2);
		//编译器,发现125在byte的范围内,底层偷偷转换了


		byte b3 = 128;
		System.out.println(b3);
	}
}
