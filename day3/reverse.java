import java.util.Scanner;

class reverse{
	public static void main(String args[]){
		int num,rem,sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		n=num;
		while(num!=0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("reverse of a number:"+n+" is:"+sum);
	}
}