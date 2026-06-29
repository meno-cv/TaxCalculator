import java.util.*;
class TaxCalculator{
	
	public final static void clearConsole(){
		try {   
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch (final Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkInputValues(int inputVlaue){
		if(inputVlaue > 0){
			return true;
		}
		
		return false;
	}
	
	public static void calculateWithHoldingTax(){
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("+--------------------------------+");
		System.out.println("|\t Whithholding Tax \t |");
		System.out.println("+--------------------------------+");
				
		System.out.println("\t [1] Rent Tax \n");
		System.out.println("\t [2] Bank Interest Tax \n");
		System.out.println("\t [3] Dividend Tax \n");
		System.out.println("\t [4] Exit \n");
				
		System.out.print("Enter an option to continue -> ");
		int withholdingOption = input.nextInt();
				
		switch(withholdingOption){
			case 1: {
					//clearConsole();
					char rentTaxOption = 'y';
					
				
					while(rentTaxOption == 'y'){
						
						System.out.println('\n');
				
						System.out.println("+------------------------+");
						System.out.println("|\t Rent Tax \t |");
						System.out.println("+------------------------+");	
						
						System.out.print("Enter your rent -> ");
						int rent = input.nextInt();
						double rentTax = 0;
						
						if(checkInputValues(rent)){
							if(rent > 100000){
								rentTax = (rent - 100000) * 0.1;
								System.out.println("You have to payrent Tax : " + rentTax);
							}else{
								System.out.println("\t You don't have to pay rent tax");
							}
						}else{
							System.out.println("Invlaid Input...");
						}
						
						System.out.print("\nDo you want to calculate another Rent tax (Y/N) : ");
						rentTaxOption = input.next().charAt(0);
						
						if(rentTaxOption == 'n'){
							clearConsole();
							main(new String[] {""});
						}

					}
					break;
					
			}
			case 2: {
						
			}
			case 3: {
						
			}
			case 4: {
						
			}
		}
	}
	
	public static void calculatePaybleTax(){
		
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("       _______              _    _          _____              _         _____   _    _   _                  _______    ____    _____      ");
		System.out.println("      |__   __|    /\\      \\ \\  / /        / ____|     /\\     | |       / ____| | |  | | | |          /\\    |__   __|  / __ \\  |  __ \\      ");
		System.out.println("         | |      /  \\      \\ \\/ /        | |         /  \\    | |      | |      | |  | | | |         /  \\      | |    | |  | | | |__) |     ");
		System.out.println("         | |     / /\\ \\      >  <         | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\     | |    | |  | | |  _  /       ");
		System.out.println("         | |    / ____ \\    / __ \\        | |____   /  ___ \\  | |____  | |____  | |__| | | |____   /  __  \\    | |    | |__| | | | \\ \\       ");
		System.out.println("         |_|   /_/    \\_\\  /_/  \\_\\        \\_____| / _/   \\_\\ |______|  \\_____|  \\____/  |______| /_ /  \\ _\\   |_|     \\____/  | |  \\_\\      ");
	 

		System.out.println('\n');
			
		System.out.println("====================================================================================================================================================");
		System.out.println('\n');
			
		System.out.println("\t [1] Whithholding Tax\n");
		System.out.println("\t [2] Payble Tax\n");
		System.out.println("\t [3] Income Tax\n");
		System.out.println("\t [4] Socail Security Contribution Levy (SSCL) Tax\n");
		System.out.println("\t [5] Leasing Payment\n");
		System.out.println("\t [6] Exit\n");
		
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();
		
		switch (option){
			case 1 : {
				clearConsole();
				calculateWithHoldingTax();
				break;
			}
			case 2 : {
				calculatePaybleTax();
				break;
			}
			case 3 : {
				System.out.println("Income Tax");
				break;
			}
			case 4 : {
				System.out.println("Socail Security Contribution Levy (SSCL) Tax");
				break;
			}
			case 5 : {
				System.out.println("Leasing Payment");
				break;
			}
			case 6 : {
				System.out.println("Exit");
				break;
			}
			default : System.out.println("Invalid Option");
		}
	}
}

