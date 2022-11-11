package Program;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAmstrongNumber(153);
	}
	/*
	 * number if every digit queue sum equal to number then that number is Amstrong
	 * run the loop until >0
	 * reminder=num%10
	 * temp=temp+(reminder*reminder*reminder)
	 * num=num/10;
	 * if copy==temp then amstrong else not 
	 * 
	 * 
	 * 
	 */

	public static void getAmstrongNumber(int num)
	{
		int reminder;
		int temp=0;
		int copy=num;
		while(num>0)
		{
			reminder=num%10;
			temp=temp+(reminder*reminder*reminder);
			num=num/10;
		}
		if(copy==temp)
		{
			System.out.println("its a Amstrong number "+ temp);
		}
		else
		{
			System.out.println("its not a amstrong number "+ temp);
		}
	}
}
