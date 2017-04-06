//方法重载设计
class OverloadDemo
{
	//需要:求两个数之和
	static int getsum(int a,int b)
	{
		return a + b;

	}

	static double getsum(double x,double y)
	{
		return x + y;
	}
	//二者在同一个类中,同一方法名,但参数列表不同
	public static void main(String[] args) 
	{
		int sum = OverloadDemo.getsum(1,2);
		System.out.println(sum);
		double ret = OverloadDemo.getsum(1.0,2.0);
		System.out.println(ret);
	}

	/*
		思考题:
		前提在同一类中,且方法名相同
		void doWork(int a,char b,boolean c){}
		下列方法哪些是上述dowork方法的重载方法
		a.void doWork(char b,int a,boolean c){}      //1
		b.int doWork(boolean a,char c,int b){}		 //1
		c.void doWork(int a,char b,double c){}       //1
		d.void doWork(int x,char y,boolean z){}      //0
		e.int doWork(int x,double y){}               //1
		f.int doWork(int x,char y,boolean z){}       //0
	*/
}
