package Program;

public class Swap2String {

	public static void main(String[] args) {
		Swap2String.getSwapstring("Abinash", "Jena");

	}
	/* Algorithm of this program
     * =========================
	 * a=a+b;
	 * b=a-b;
	 * a=a-b;
	 * 
	 */
	
	public static void getSwapstring(String a,String b)
	{
		a=a+b;                                   //AbinashJena
		b=a.substring(0, a.length()-b.length()); //0 11-4=7 Abinash
		a=a.substring(b.length());               //7   Jena 
		System.out.println("Value of a "+ a);
		System.out.println("Value of b "+ b);
		
	}

}
