package Prob2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws MyException1 {

		double withdraw=0.0; 
		CustomerAccount ca1=new CustomerAccount("Thomas Tibebu","12458796", 900);
		Scanner scanner = new Scanner(System.in);

		
		
		System.out.println("Balance: " + ca1.getBalance());
		System.out.println("New Balance After Withdraw $500: " + ca1.Withdraw(500));
		ca1.deposit(600);

		System.out.println("New Balance After Deposit $600: " + ca1.getBalance());
		


	}

}
/*Output
 Case1//correct input
Balance: 900.0
New Balance After Withdraw $500: 400.0
New Balance After Deposit $600: 1000.0

Case2//amount>balance
Balance: 900.0
Exception in thread "main" Prob2.MyException1: Withdraw amont exceed the balance
	at Prob2.CustomerAccount.Withdraw(TestCustomerAccount.java:54)
	at Prob2.TestMain.main(TestMain.java:23)
Case3//balance-amount<100
Balance: 900.0
Exception in thread "main" Prob2.MyException1: Balance reach below $100
	at Prob2.CustomerAccount.Withdraw(TestCustomerAccount.java:57)
	at Prob2.TestMain.main(TestMain.java:16)
*/
