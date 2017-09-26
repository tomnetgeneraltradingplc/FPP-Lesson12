package Prob2;



class CustomerAccount {
	String Cus_name;
	String Acc_No;
	double Balance;

	public CustomerAccount(String cus_name, String acc_No, double balance) {

		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;

	}

	public String getCus_name() {
		return Cus_name;
	}

	public void setCus_name(String cus_name) {
		Cus_name = cus_name;
	}

	public String getAcc_No() {
		return Acc_No;
	}

	public void setAcc_No(String acc_No) {
		Acc_No = acc_No;
	}

	public double getBalance() throws MyException1 {
		if(Balance<100)
			throw new MyException1("Balance below $100!");
		
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public  double deposit(double amount) {
		Balance= Balance+amount;

		return Balance;

	}

	public double Withdraw(double amount) throws MyException1 {
		if (amount > getBalance()){
			throw new MyException1("Withdraw amont exceed the balance");
		}
		if (getBalance()-amount<100){
			throw new MyException1("Balance reach below $100");
		}

		Balance = Balance - amount;

		return Balance;

	}
}

