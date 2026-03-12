import java.util.Scanner;
public class Bank_project{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] aaa){
	
	
	double balance = 1060;
	int choise;
	boolean isrunning = true;
	
	while(isrunning){
		
	System.out.println("************");
	System.out.println("BANK ACCOUNT");
	System.out.println("************");
	
	System.out.println("1. BANK BALANCE");
	System.out.println("2. DEPOSIT");
	System.out.println("3. WITHDRAW");
	System.out.println("4. EXIT");
	System.out.println("************");
	
	System.out.print("MAKE YOUR CHOISE (1-4) : ");
	choise = scan.nextInt();
	
	switch(choise){
		case 1 -> bankbalance(balance);
		case 2 -> balance = balance + bankdeposit();
		case 3 -> balance = balance - bankwithdraw(balance);
		case 4 -> isrunning = false;	
		default -> System.out.println("\nINVALID CHOISE\n");
	}
	}
	System.out.println("*******************");
	System.out.println("HAVE A NICE DAY !!");
	System.out.println("*******************");
	
	
	}

	static void bankbalance(double balance){
		System.out.println("*******************");
		System.out.println("\nYOUR BALANCE : "+balance+ " $\n");
		System.out.println("*******************");
			}
		
	static double bankdeposit(){
		System.out.print("WRITE THE AMOUNT FOR DEPOSIT : ");
		double deposit = scan.nextDouble();
		if(deposit < 0){
			System.out.println("YOU CANT DEPOSIT NEGATIVE AMOUNT.");
			return 0;
		}
		else{
			return deposit;
		}
		
	}
	
	static double bankwithdraw(double balance){
		System.out.print("WRITE AMOUNT YOU WHANT TO WHITDRAW : ");
		double whitdraw = scan.nextDouble();
		if(whitdraw < 0){
			System.out.println("YOU CANT WITHDRAW NEGATIVE AMOUNT.");
			return 0;
		}
		else if(whitdraw > balance){
			System.out.println("YOU DONT HAVE ENOUGH MONEY FOR THIS AMOUNT.");
			return 0;
		}
		else{
		return whitdraw;
		}
	}

	
}
