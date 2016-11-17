import java.util.Scanner;


public class BankAccount {
	private int balance = 0;
	private String password = "secret";
	public void showBalance() {
		System.out.println("The balance is " + getBalance()); }
	public boolean checkPassword() {
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter password: ");
		String guess = kbd.nextLine();
		if(guess.equals(password)) {
			System.out.println("Password Correct");
			return true; }
		else {
			System.out.println("Password Incorrect");
			return false; } }
	public int getBalance() {
		return balance;
	}
	public void setBalance(int bal) {
		if(this.checkPassword())
			this.balance = bal;
	}
	public void changePassword() {
		if(checkPassword()) {
			System.out.println("New password: ");
			Scanner kbd = new Scanner(System.in);
			this.password = kbd.nextLine();
		}
	}
}

