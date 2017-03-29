class VarAgeDemo 
{
	public static void main(String[] args) 
	{
		/*
			1):变量的定义格式:
			     数据类型  变量名;
				 如:int age;
		    2):给变量赋值(初始化):
			     变量名 = 声明变量类型的常量值;
				 如:age = 17;
			3):在声明变量的时候,并做初始化
			     数据类型  变量名 = 声明变量类型;
				 如:int age = 17;
				 注意:变量必须初始化(赋值)之后才能使用,初始化才是真正的在内存分配空间
			
		*/
		int age;  //定义一个int类型的变量,变量名为age
		age = 17; //把17这个常量值,付给age变量
		System.out.println(age);//打印变量,其实是打印的是变量当前所赋予的值

		age = 18;//把18这个常量,赋值给age变量
		System.out.println(age);//18

		
	}
}
