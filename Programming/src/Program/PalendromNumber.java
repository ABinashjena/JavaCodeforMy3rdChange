package Program;

public class PalendromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 getPalendromNumber(121);

	}
	/* any num which is reverse can get same original num is palendrom
	 * run the loop while num>0
	 * find the reminder of the num
	 * store a temp =(temp*10)+reminder
	 * devide num=num/10
	 * if(copy==temp) palendrom else not
	 * 
	 */
	public static void getPalendromNumber(int num)
	{
		int reminder;
		int temp=0;;
		int copy=num;
		while(num>0) //1
		{
			reminder=num%10; //1
			temp=(temp*10)+reminder;//121
			num=num/10;//1
			
		}
		if(temp==copy)
		{
			System.out.println("its a palendrom num" + temp);
		}
		else
		{
			System.out.println("its not palendrom num "+ temp);
		}
	}

}
