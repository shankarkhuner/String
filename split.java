class Split 
{
	public static void main(String[] args) 
	{
		String str = "This-is-an-example-of-split-Method-1"; 
		String[] ss = str.split("-");
		for(int i = 0; i < ss.length; i++)
			{
			System.out.println(ss[i]);
				
			}
	}
}
