package PaymentAppPackage;

import java.util.Scanner;

public class PaymentApp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the payment options from below: ");
		
		System.out.println("1. Debit Card");
		System.out.println("2. Credit Card");
		System.out.println("3. UPI Card");
		System.out.println("4. NetBanking Card");
		System.out.println("5. Cash");
		
		int choice=sc.nextInt();
		
		Payment payments =PaymentOptions.getPayment(choice);
		
		if(payments!=null)
		{
			System.out.println(payments.pay());
		}
		else
		{
			System.out.println("Invalid payment!!!");
		}
		
	}

}
