package Program;



public class FindDuplicatecharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getletter("abinashh");
	}
	/* Algo for FindDuplicatecharacterinstring
	 * ==========================
	 * convert the string to char array 
	 * Declare one count var with 0
	 * run the two for loop
	 * one start with 0 to s.lenght()
	 * other one start with one loop to s.lenght()
	 * compare two char array and find duplicate  
	 */
	public static void getletter(String s)
	{
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
	}

}
