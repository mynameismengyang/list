//二维数组的初始化操作
class ArryInArryDemo 
{
	public static void main(String[] args) 
	{

		int[][] arry = new int[][]{
			{1,2,3,4},
			{5,6,7},
			{8,9,10}
		};

		for(int i = 0;i < arry.length;i ++)
		{
			System.out.println(arry[i]);
			for(int j = 0;j < arry[i].length;j ++)
			{
				System.out.println(arry[i][j]);
			}
		}
	}
}
