class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println("main����ǰ,x=" + x);//10
		change(x);
		System.out.println("main������,x=" + x);//10

	}

	//�޸ı���
	static void change(int x)
	{
		System.out.println("change����ǰ,x=" + x);//10
		x = 50;
		System.out.println("change������,x=" + x);//50
	}
}
