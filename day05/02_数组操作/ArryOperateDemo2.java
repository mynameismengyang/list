//�����������/��Сֵ
class ArryOperateDemo2 
{
	//����:������������ֵ
	static int getMax(int[] nums)
	{
		int max = nums[0];//�����һ����������
		//Index�ӵڶ�������ʼ�Ƚ�=index = 1
		for(int index = 1;index < nums.length;index ++)
		{
			if(nums[index] > max)
			{
				max = nums[index];
			}
		}
		return max;
	}

	//����:����������С��ֵ
	static int getMin(int[] nums)
	{
		int min = nums[0];//�����һ��������С��
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
			//�����ǰindex�������һ��������ƴ��
			if(index != arr.length - 1)
			{
				ret =ret +", ";
			}
		}
		ret = ret +"]";
		System.out.println(ret);
	}

	//�����������Ԫ��

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
