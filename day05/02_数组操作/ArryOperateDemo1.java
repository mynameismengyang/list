//������Ĳ���
class  ArryOperateDemo1
{
	public static void main(String[] args) 
	{
		int[] nums1 = new int[]{1,3,5,7,9};
		System.out.println("����ĳ���=" + nums1.length);
		//��ʱ��length������,���Ƿ���,����()
		
		//��ȡ�����һ��Ԫ��
		System.out.println("����ĵ�һ��Ԫ��=" + nums1[0]);
		System.out.println("��������һ��Ԫ��=" + nums1[4]);
		
		//�޸������һ��Ԫ��
		nums1[0] = 100;
		System.out.println("����ĵ�һ��Ԫ��=" + nums1[0]);

		//��������Ԫ��
		for(int index = 0;index < nums1.length;index ++)
		{
			System.out.println(nums1[index]);
		}
		
		//���ж�boolean�ĳ�ʼֵΪfalse
		boolean[] bs = new boolean[3];
		for(int index = 0;index < bs.length;index ++)
		{
			System.out.println(bs[index]);
		}
		
		//���ж�String�ĳ�ʼֵΪnull
		String[] s = new String[3];
		for(int index = 0;index < s.length;index ++)
		{
			System.out.println(s[index]);
		}

		
		//NullPointerException:��ָ��ָ���쳣
		bs = null;
		System.out.println(bs.length);
		

		

	}
}
