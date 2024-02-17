package me.eguzman.learn._07_overloading_inheritance_and_overriding;

/**
 * Write a Java program to create a base class named BankAccount with methods called deposit() and withdraw(). 
 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
 */
class BankAccount {
	double balance;
	double amount;
	
	void setAmount(double amount) {
		this.amount = amount;
	}
	
	void deposit() {
		balance += amount;
	}
	
	void withdraw() {
		balance -= amount;
	}
}

class SavingsAccount extends BankAccount {
	
	SavingsAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	@Override
	void withdraw() {
		if (balance < 100) {
			System.out.println("Unable to withdraw to this account");
		}
		
		super.withdraw();
	}

	@Override
	public String toString() {
		return String.format("SavingsAccount [balance=%s]", balance);
	}
	
}

public class Exercise05 {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(1000);
		System.out.println(account);
		
		account.setAmount(950);
		account.withdraw();
		System.out.println(account);
		
		account.setAmount(100);
		account.withdraw();
		System.out.println(account);
		

	}

}
