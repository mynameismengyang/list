class  SwapVarDemo
{
	public static void main(String[] args) 
	{
		int a = 13;
		int b = 6;
		//方法一:添加第三方变量
		/*
		int temp;
		temp = a;
		a = b;
		b = temp;
		*/

		//方法二:不添加第三方变量
		/*
		a = b - a;//求出b和a之间的距离,存放a中
		b = b - a;//a到原点的距离,存放b中
		a = b + a;//b到原点的距离,存放a中
		*/

       
		b = a - b;  //a=13  b=7
		a = a - b;  //a=6   b=7
		b = a + b;  //a=6   b=13
		
		/*
		b = a ^ b;
		a = a ^ b;
		b = a ^ b;
		*/
		System.out.println("a=" + a + ",b=" + b);
	}
}
