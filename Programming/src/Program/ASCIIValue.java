package Program;

public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1
		 * 1 2
		 * 1 2 3 
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * Run the two loop i start 0 to total no of row 
		 *                  j start 0 to i
		 *                  print(temp+j)
		 */
		
		int temp=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((temp+j)+" ");
			}
			System.out.println();
		}

	}

}
