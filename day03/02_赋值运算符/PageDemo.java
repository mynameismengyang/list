//��Ԫ������ڷ�ҳҵ���߼���ʹ��
class PageDemo 
{
	public static void main(String[] args) 
	{
		/*
			����:����һ��46������,Ҫ��ÿһҳ���10������.
			����:һ������ҳ.
		*/
		int totalCount = 46;
		int pageSize =10;

		//��ҳ��
		int total = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize +1;
		System.out.println(total);

		int currentPage = 5;
		//��һҳ
		int prePage = currentPage -1 >= 1 ? currentPage - 1 : currentPage;
		System.out.println(prePage);
		//��һҳ
		int nexPage = currentPage + 1 <= total ? currentPage + 1 : total;
		System.out.println(nexPage);

	}
}
