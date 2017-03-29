//三元运算符在分页业务逻辑中使用
class PageDemo 
{
	public static void main(String[] args) 
	{
		/*
			需求:给出一共46条数据,要求每一页最多10条数据.
			计算:一共多少页.
		*/
		int totalCount = 46;
		int pageSize =10;

		//总页数
		int total = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize +1;
		System.out.println(total);

		int currentPage = 5;
		//上一页
		int prePage = currentPage -1 >= 1 ? currentPage - 1 : currentPage;
		System.out.println(prePage);
		//下一页
		int nexPage = currentPage + 1 <= total ? currentPage + 1 : total;
		System.out.println(nexPage);

	}
}
