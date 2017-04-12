//求数组中最大/最小值
class ArryOperateDemo2 
{
	//方法:求数组中最大的值
	static int getMax(int[] nums)
	{
		int max = nums[0];//假设第一个数是最大的
		//Index从第二个数开始比较=index = 1
		for(int index = 1;index < nums.length;index ++)
		{
			if(nums[index] > max)
			{
				max = nums[index];
			}
		}
		return max;
	}

	//方法:求数组中最小的值
	static int getMin(int[] nums)
	{
		int min = nums[0];//假设第一个数是最小的
		for(int i = 1;i < nums.length;i ++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}

	static void printArry(String[] arr)
	{
		String ret = "[";
		for(int index = 0;index < arr.length;index ++)
		{
			ret= ret + arr[index];
			//如果当前index不是最后一个索引则拼接
			if(index != arr.length - 1)
			{
				ret =ret +", ";
			}
		}
		ret = ret +"]";
		System.out.println(ret);
	}

	//逆序输出数组元素

	static String[] reverse(String[] oldArr)
	{
		String[] newArr = new String[oldArr.length];
		for(int index = oldArr.length-1;index >= 0;index --)
		{
			newArr[oldArr.length-1-index] = oldArr[index];
		}

		return newArr;
	}


	public static void main(String[] args) 
	{
		int[] nums = new int[]{-3,1,4,6,10};

		int max = ArryOperateDemo2.getMax(nums);
		System.out.println(max);

		System.out.println(ArryOperateDemo2.getMin(nums));

		String[] arr = {"A", "B", "C", "D", "E"};
		ArryOperateDemo2.printArry(arr);

		
		String[] newArr = ArryOperateDemo2.reverse(arr);
		ArryOperateDemo2.printArry(newArr);
	}
}
