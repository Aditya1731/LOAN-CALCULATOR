import java.util.*;
class loan_calculator
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***      LOAN CALCULATOR      ***");
		System.out.println();
		System.out.println("ENTER THE AMOUNT : ");
		float amount  = sc.nextFloat();
		System.out.print("ENTER THE ROI : ");
		float roi = sc.nextFloat();
		System.out.print("ENTER THE TENURE (MONTHS) :");
		int month = sc.nextInt();

		//con from month to year
		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);

		System.out.println();
		System.out.println("LOAN CALCULATOR");
		System.out.println("PRINCIPAL AMOUNT : "+amount);
		System.out.println("ROI : "+roi+"%");
		System.out.println("Tenure :"+month+"months");

		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("INTEREST  : "+totalInter);
		
		float outstanding = amount + totalInter;
		System.out.println("TOTAL OUSTANDING AMOUNT :"+outstanding);
		System.out.println("emi : "+(outstanding/month)+"rs");

	}
}