import java.util.Scanner;

class prime {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number:");
		num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=num/i;i++) {
			if((num%i)==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a prime no");
		}
		else
		{
			System.out.println(num+" is not a prime no.");
		}

	}

}