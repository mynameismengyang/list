class ForEachDemo 
{
	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,4,5};
		for(int index = 0;index < nums.length;index ++)
		{
			System.out.println(nums[index]);
			nums[index] = 100;//起了作用
		}

		System.out.println("-------------------------------");

		for(int ele : nums )
		{
			System.out.println(ele);
			//ele = 100; 不起作用
		}
	}
}
