//�������Сֵ,��ҳ����
class IfElseDemo
{
	public static void main(String[] args) 
	{
		int x = 100;
		int y = 200;

		if(x > y)
		{
			System.out.println("x����y");
		}
		else
		{
			System.out.println("xС��y");
		}

		String ret = x > y ? "x����y" : "xС��y";
		System.out.println(ret);
        
		//ע:�ڴ����������������if-else�����ṹ�����,����if-else��ǿ��
		int totalCount = 41;
		int pageSize = 10;
			
		//��ҳ��

		int totalPage = totalCount % pageSize ==0 ? totalCount / pageSize : totalCount / pageSize + 1;
		System.out.println(totalPage);

		//��һҳ

		int currentPage = 1;
		int prePage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
		System.out.println(prePage);

		//��һҳ
		int nextPage = currentPage + 1 <= totalPage ? currentPage + 1 : 5;
		System.out.println(nextPage);

		if(totalCount % pageSize ==0)
		{
			System.out.println(totalCount / pageSize);
		}
		else
		{
			System.out.println(totalCount / pageSize + 1);
		}
	}
}
