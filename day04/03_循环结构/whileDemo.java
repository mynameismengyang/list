//whileѭ����
public class whileDemo
{
	public static void main(String[] args)
	{
		/*
			�﷨��ʽ:
			while(boolean���ʽ)
			{
				���boolean���ʽΪrue,��ִ��ѭ����
				//TODO
			}
			���boolean���ʽ���Ϊfalse,������ѭ����,��ִ��ѭ����.
		*/

		//����1:��500��˧��
		int count = 0;
		while (count < 500)
		{
			System.out.println("˧��" + count);
	     	count ++;
		}
		System.out.println("ending.......");
		
		//����2:��1~100��ӡ
		int num = 1;
		while(num <= 100)
		{
			System.out.println(num);
			num ++;
		}
		//����3:��1-100֮��
		int number = 1;
		int result = 0;
		while(number <= 100)
		{
			result = result + number;
			number ++;
		}
		System.out.println(result);
		
	}
}