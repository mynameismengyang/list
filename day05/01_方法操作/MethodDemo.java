class MethodDemo
{
	static void doWork()//ע��:��static,����,�������
	{
		System.out.println("��Ҫִ�е�200�д���");
	}
	public static void main(String[] args)
	{
		System.out.println("����Ƭ��A");
		MethodDemo.doWork();//���÷���
		System.out.println("����Ƭ��B");
		MethodDemo.doWork();//���÷���
		System.out.println("����Ƭ��C");
		MethodDemo.doWork();//���÷���
		System.out.println("����Ƭ��D");
		MethodDemo.doWork();//���÷���

	}
}