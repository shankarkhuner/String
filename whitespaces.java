/*
 class removeWhiteSpace {    
    public static void main(String[] args) {    
            
        String str1="Remove white spaces of the String";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll(" ", "");    
            
        System.out.println(str1);    
    }    
}   
*/

class RemoveWhiteSpaces
{
	public static void main(String[] args){
		String str = "Remove white spaces of the String";
		str = str.replaceAll(" ","");
		System.out.println(str);
	}
}