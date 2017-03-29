class AssiigningOperatorDemo 
{
	public static void main(String[] args) 
	{
		//功能就是,给变量赋值.
		String name;
		name = "Hello";
		System.out.println(name);//赋值

		/*
			1.声明int类型变量age;
			2.在内存中存储常量数据17;
			3.把17赋予age变量;
		*/
		//声明一个int类型变量,并设置初始值为17
		int age = 17;
		System.out.println("Hello World!");
		System.out.println("------------");
		/*
			+= 赋值运算符:中间不能打空格,自带隐士类型转换
			int a = 10;
			a += 5;等价于 a = (int)(a + 5);
		*/
		int a = 10;
		a += 5;
		System.out.println(a);//15

		short s = 30;
		//s = s + 5;// 可能损失精度
		//s += 5;//35(自带隐士类型转换)
		s = (short)(s + 5);//35(等价于上一行)
		System.out.println(s);

	}
}
