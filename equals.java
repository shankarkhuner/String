class Demo4
{String s1;
	Demo4(String s1)
		{
			this.s1 = s1;
		}
	public static void main(String[] args) 
	{
		Demo4 d1 = new Demo4("cyber");
		Demo4 d2 = new Demo4("cyber");
		System.out.println(d1.equals(d2));

		String p1 = "Success";
		String p2 = "Success";
		System.out.println(p1.equals(p2));

		String str1 = new String("cyber");
		String str2 = new String("cyber");
		System.out.println(str1.equals(str2));
	}
}
