public class TypeConvertDemo
{
	public static void main(String[] args) 
	{
		/*
			byte�Ķ�����:00000101
		   short�Ķ�����:00000000_000000101
		     int�Ķ�����:00000000_00000000_00000000_00000101
		*/
		byte b1 = 5;
		short s1 = b1;
		int i1 = s1;
		long l1 = i1;

		float f1 = l1;//long-->float
		double d1 = f1;
		System.out.println(d1);


		double pi =3.14;
		int i2 = (int)pi;//double-->int
		System.out.println(i2);

		//ֱ�Ӱ�double���͵ĳ���,��ֵ��int���ͱ���i3
		int i3 = (int)(3.14 + 1.2);
		System.out.println(i3);

		//��������,Ĭ����int����
		//��һ��int���ͳ���ֱ�Ӹ�ֵ��byte���ͱ���
		byte b2 = 125;
		System.out.println(b2);
		//������,����125��byte�ķ�Χ��,�ײ�͵͵ת����


		byte b3 = 128;
		System.out.println(b3);
	}
}
