//元素出现索引(第一次/最后一次)
class ArrySearchDemo
{
	/*
		查询key元素在arr数组中第一次出现的位置,
		参数:
			arr:从哪一个数组中去做查询
			key:当前去查询的元素
		返回:如果key存在于arr数组中,则返回第一次出现的索引.
			 key不存在于arr数组中,返回-1.
	*/
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10,20,30,10,50,-30,10};
		int getIndex = ArrySearchDemo.indexOf(arr,10);
		System.out.println(getIndex);
		
		int getLastIndexOf = ArrySearchDemo.lastIndexOf(arr,10);
		System.out.println(getLastIndexOf);
	}
    //第一次出现的索引
	static int indexOf(int[] arr,int key)
	{
		for(int index = 0;index < arr.length;index ++)
		{
			if(arr[index] == key)
			{
				return index;
			}
		}
		return -1;
	}
    
	//最后一次出现的索引
	static int lastIndexOf(int[] arr,int key)
	{
		for(int index = arr.length-1;index > 0;index --)
		{
			if(arr[index] == key)
			{
				return index;
			}
		}
		return -1;
	}


}
