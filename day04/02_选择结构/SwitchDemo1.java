class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		/*
			switch(整型表达式)
			{
				case A值: 执行语句;break;
				case B值: 执行语句;break;
				case C值: 执行语句;break;
				......
				default:上述的值都不是表达式的结果,就执行这里.
			}
		*/
		int weekday = 0;
		switch(weekday)
		{
			case 1 :System.out.println("周一");break;
			case 2 :System.out.println("周二");break;
			case 3 :System.out.println("周三");break;
			case 4 :System.out.println("周四");break;
			case 5 :System.out.println("周五");break;
			case 6 :System.out.println("周六");break;
			case 7 :System.out.println("周日");break;
			default:System.out.println("亲,没有这一天");


		}
	}
}
