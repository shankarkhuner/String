/*class Aray 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int[] a = new int[5];
		a[0] = 100;
		a[1] = 200;								// 1). To store multiple values we use Array[] 

		a[2] = 300;								// 2). Each valu store in Array[] will be within the cell in an Array[] 
		a[3] = 400;								//every cell will be given an index
		a[4] = 500;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}*/

class Aray 
{
	public static void main(String[] args) 
	{
		int[] a = new int[3];
		a[0] = 1000;
		a[1] = 2000;
		a[2] = 3000;
		for(int i = 0; i<3; i++){
			System.out.println(a[i]);
		}



	}
}