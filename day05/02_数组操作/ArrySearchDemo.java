//Ԫ�س�������(��һ��/���һ��)
class ArrySearchDemo
{
	/*
		��ѯkeyԪ����arr�����е�һ�γ��ֵ�λ��,
		����:
			arr:����һ��������ȥ����ѯ
			key:��ǰȥ��ѯ��Ԫ��
		����:���key������arr������,�򷵻ص�һ�γ��ֵ�����.
			 key��������arr������,����-1.
	*/
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10,20,30,10,50,-30,10};
		int getIndex = ArrySearchDemo.indexOf(arr,10);
		System.out.println(getIndex);
		
		int getLastIndexOf = ArrySearchDemo.lastIndexOf(arr,10);
		System.out.println(getLastIndexOf);
	}
    //��һ�γ��ֵ�����
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
    
	//���һ�γ��ֵ�����
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
