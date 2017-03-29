/*
	当要表示的数据超出数据的临界范围,称为溢出.
	溢出情况发生时程序并没有做数据范围检查处理,
	此时会出现数据紊乱情况.
*/
class OverFlow
{
	public static void main(String[] args) 
	{
		//int类型最大的值
		int intMax = 2147483647;
		//让intMax变量加1之后,再赋给intMax变量
		intMax = intMax +1;
		System.out.println("int的最大值+1="+intMax);
		//int类型的最小值
		int intMin = -2147483648;
		//让intMin变量减1之后,再赋值给intMin变量
		intMin=intMin - 1;
		System.out.println("int的最小值-1="+intMin);

		/*
			分析数据发生紊乱的原因:
			0b 01111111_11111111_11111111_11111111
		+   0b 00000000_00000000_00000000_00000000
		----------------------------------------------
		    0b 10000000_00000000_00000000_00000000
		*/

	}
}
