import java.util.Scanner;

class LargestNumber{
	public static void main(String args[]){
		int a,b,c;
		System.out.println("enter the three number:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if( a>b && a>c ){
			System.out.println("highest number is:"+a);
		}
		else if( b>a && b>c){
			System.out.println("highest number is:"+b);
		}
		else{
			System.out.println("highest number is:"+c);
		}
	}
}