//�����������
class OverloadDemo
{
	//��Ҫ:��������֮��
	static int getsum(int a,int b)
	{
		return a + b;

	}

	static double getsum(double x,double y)
	{
		return x + y;
	}
	//������ͬһ������,ͬһ������,�������б�ͬ
	public static void main(String[] args) 
	{
		int sum = OverloadDemo.getsum(1,2);
		System.out.println(sum);
		double ret = OverloadDemo.getsum(1.0,2.0);
		System.out.println(ret);
	}

	/*
		˼����:
		ǰ����ͬһ����,�ҷ�������ͬ
		void doWork(int a,char b,boolean c){}
		���з�����Щ������dowork���������ط���
		a.void doWork(char b,int a,boolean c){}      //1
		b.int doWork(boolean a,char c,int b){}		 //1
		c.void doWork(int a,char b,double c){}       //1
		d.void doWork(int x,char y,boolean z){}      //0
		e.int doWork(int x,double y){}               //1
		f.int doWork(int x,char y,boolean z){}       //0
	*/
}
