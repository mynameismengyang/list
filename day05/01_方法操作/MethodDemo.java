class MethodDemo
{
	static void doWork()//注意:有static,否则,编译出错
	{
		System.out.println("需要执行的200行代码");
	}
	public static void main(String[] args)
	{
		System.out.println("代码片段A");
		MethodDemo.doWork();//调用方法
		System.out.println("代码片段B");
		MethodDemo.doWork();//调用方法
		System.out.println("代码片段C");
		MethodDemo.doWork();//调用方法
		System.out.println("代码片段D");
		MethodDemo.doWork();//调用方法

	}
}