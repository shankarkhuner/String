/*class Demo
{

	public static void main(String[] args) 
	{
/*
		System.out.println("Hello World!");
		int[] a = new int[3];    // String[] str = new String[3];
		a[0] = 10; // String[] ---> "A";
		a[1] = 20;
		a[2] = 30;
		System.out.println("Size of Array"+a.length);
		for(int i = 0;i<a.length; i++)
			System.out.println(a[i]);
*/
/*
		System.out.println("Hello World!");
		String[] a = new String[3];    // String[] str = new String[3];
		a[0] = "A"; // String[] ---> "A";
		a[1] = "B";
		a[2] = "C";
		System.out.println("Size of Array"+a.length);
		for(int i = 0;i<a.length; i++)
			System.out.println(a[i]);

}
}*/
class Demo
{ 
	public static void main(String[] args){
		String[] ss = new String[7];
		ss[0] = "A";
		ss[1] = "B";
		ss[2] = "C";
		ss[3] = "D";
						// null --5
						// null--6
						// null--7
		System.out.println(ss.length);
		for( int i = 0; i<ss.length; i++){
		System.out.println(ss[i]);
	}
	}
}