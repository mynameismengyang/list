//��������(byte,short,int,long)
public class IntegerDemo
	{
	public static void main(String[] args)
	{
	/*
	1.����������:0b��0B��ͷ(java7��������),��:int a = 0B110;
	2.�˽�������:Ҫ����0��ͷ,��:int a = 012;
	3.ʮ��������:��:int a = 17;
	4.ʮ����������:Ҫ��0x��ͷ,��:int a = 0x12;
	*/
	//��ʾ10���Ƶĳ���
	System.out.println(110);
	//��ʾ2���Ƶĳ���
	System.out.println(0b01101110);
	//��ʾ8���Ƶĳ���
	System.out.println(0156);
	//��ʾ16���Ƶĳ���
	System.out.println(0x6e);

	//long ���L
	long num = 127L;
	System.out.println(num);
	}

}