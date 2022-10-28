package Program;

public class ReverseAstring {

	public static void main(String[] args) {

		ReverseAstring.getReversestring("Abinash Jena");
		
	}
	/* 
	* Algorithm of this program
    * =============================
    * 1)convert the string to character 
    * 2)find the length of character array 
    * 3)print in to reverse order
	
	*/
	
	public static void getReversestring(String str)
	{
		
		char[] ch = str.toCharArray();
		for (int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	
	}

}
