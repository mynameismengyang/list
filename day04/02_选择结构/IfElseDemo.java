//求最大最小值,分页案例
class IfElseDemo
{
	public static void main(String[] args) 
	{
		int x = 100;
		int y = 200;

		if(x > y)
		{
			System.out.println("x大于y");
		}
		else
		{
			System.out.println("x小于y");
		}

		String ret = x > y ? "x大于y" : "x小于y";
		System.out.println(ret);
        
		//注:在此例中三类运算符比if-else的语句结构更简洁,但是if-else更强大
		int totalCount = 41;
		int pageSize = 10;
			
		//总页数

		int totalPage = totalCount % pageSize ==0 ? totalCount / pageSize : totalCount / pageSize + 1;
		System.out.println(totalPage);

		//上一页

		int currentPage = 1;
		int prePage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
		System.out.println(prePage);

		//下一页
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
