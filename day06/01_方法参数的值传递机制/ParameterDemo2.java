//参数的值传递机制-引用数据类型
class ParameterDemo2
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10,99};
		printArry(arr);
		swap(arr);
		printArry(arr);
	}


	static void swap(int[] arr)
	{
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
	}


	static void printArry(int[] arr)
	{
		String ret = "[";
		for(int index = 0;index < arr.length;index ++)
		{
			ret = ret + arr[index];
			if(index != arr.length - 1)
			{
				
				ret = ret + ", ";
			}
		}

		ret = ret + "]";
		System.out.println(ret);
	}


}
