class StringDemo 
{
	public static void main(String[] args) 
	{
		//字符串常量
		System.out.println("Hello World!");
		//String变量
		String name = "龙17";
		System.out.println("name ="+name);
		//输出"Hello"
		System.out.println("\"Hello\"");

		name = "我是"+"will"+",今年17岁";
		System.out.println(name);
		System.out.println("-------------------------");
		System.out.println(8 + 7 + "Hello");//结果是15Hello
		System.out.println("Hello" + 7 + 8);//Hello78
		System.out.println(7 + "Hello" +8);//7Hello8
		String str = 17 + "Hello";//组成一个新的字符串17Hello
		System.out.println(str);
		String str2 = (String)17 + "ABC";// 错误,不可转换的类型
	}
}
