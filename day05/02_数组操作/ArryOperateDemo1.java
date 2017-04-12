//对数组的操作
class  ArryOperateDemo1
{
	public static void main(String[] args) 
	{
		int[] nums1 = new int[]{1,3,5,7,9};
		System.out.println("数组的长度=" + nums1.length);
		//此时的length是属性,不是方法,不加()
		
		//获取数组的一个元素
		System.out.println("数组的第一个元素=" + nums1[0]);
		System.out.println("数组的最后一个元素=" + nums1[4]);
		
		//修改数组的一个元素
		nums1[0] = 100;
		System.out.println("数组的第一个元素=" + nums1[0]);

		//遍历数组元素
		for(int index = 0;index < nums1.length;index ++)
		{
			System.out.println(nums1[index]);
		}
		
		//可判断boolean的初始值为false
		boolean[] bs = new boolean[3];
		for(int index = 0;index < bs.length;index ++)
		{
			System.out.println(bs[index]);
		}
		
		//可判断String的初始值为null
		String[] s = new String[3];
		for(int index = 0;index < s.length;index ++)
		{
			System.out.println(s[index]);
		}

		
		//NullPointerException:空指针指向异常
		bs = null;
		System.out.println(bs.length);
		

		

	}
}
