import java.util.Scanner;

//Homework-03-Calculator
//CSE1102
//Chris Kosior
//Yusuf Albayram
//Sec: 12
//2/11/2015
public class Calculator {
	public static void main(String[] args) {
		boolean contin = true;
		Scanner keyboard = new Scanner(System.in);
		double accumulator = 0.0;
		double input;
		while(contin) {
			int opt;
			System.out.println("Accumulator = " + accumulator);
			System.out.println("Please choose one of the following options: ");
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Square root");
			System.out.println("6) Clear");
			System.out.println("0) Exit");
			System.out.print("What is your option? ");
			opt = keyboard.nextInt();
			if(opt == 0) {
					contin = false; }
					else if(opt == 1) {
						// do addition 
						System.out.println("Enter a number: ");
						input = keyboard.nextDouble();
						accumulator = accumulator + input;
					}
					else if(opt == 2) {
						//do subtraction
						System.out.println("Enter a number: ");
						input = keyboard.nextDouble();
						accumulator = accumulator - input;
					}
					else if(opt == 3) {
						//do multiplication
						input = keyboard.nextDouble();
						accumulator = accumulator * input;
					}
					else if(opt == 4) {
						//do division
						input = keyboard.nextDouble();
						accumulator = accumulator / input;
					}
					else if(opt == 5) {
						//do Sqrt
						accumulator = Math.sqrt(accumulator);
					}
					else if(opt == 6) {
						//clear
						accumulator = 0.0;
					}
					else
					{
			System.out.println("Illegal option: " + opt);
		}
	}
	}
}


	


