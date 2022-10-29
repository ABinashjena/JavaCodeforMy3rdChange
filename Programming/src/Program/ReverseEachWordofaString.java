package Program;

public class ReverseEachWordofaString {

	public static void main(String[] args) {
		ReverseEachWordofaString.getReverseEachWordofaString("Abinash Jena");

	}
	/* Algo of program
	 *=================== 
	 * Split the String where space start 
	 * Reverse each word
	 * 
	 * 
	 * 
	 */
	
	public static void getReverseEachWordofaString(String a)
	{
		String[] word = a.split(" ");                    //Abinash Jena
		for (String var : word)
		{
		StringBuffer sb = new StringBuffer(var);
		System.out.print(sb.reverse()+" ");
		
		}
		
	}

}
