import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
	long year;
	boolean leap=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	year=sc.nextLong();
	if(year%4==0){
		if(year%100==0){
			if(year%400==0){
				leap=true;
			}
			else
				leap=false;
		}
		else
			leap=true;
	}
	else
		leap=false;
	
	if(leap){
		System.out.println("This year is leap year:"+year);
	}
	else
	{
		System.out.println("This year is not a leap year:"+year);
	}
	}
}