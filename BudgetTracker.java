import java.util.*;
class BudgetTracker
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Budget Tracker!");

        System.out.print("Enter your starting balance:Rs. ");
        double balance = scanner.nextDouble();

        boolean quit = false;

        while (!quit) 
		{
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Money Managing Tips");
            System.out.println("5. Investment Tips");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
            
				 System.out.print("Enter the amount of income:Rs. ");
                    double income = scanner.nextDouble();
                    balance += income;
                    System.out.println("Income added successfully.");
                    break;


                case 2:
					while (true)
					{
						System.out.print("Enter an expense name (or 'done' to finish) : ");
						String expensename = scanner.next();
						
						if(expensename.equals("done"))
						{
							break;
						}
						
						System.out.print("Enter the amount of expense:Rs. ");
						double expense = scanner.nextDouble();
						
						if (expense > balance) 
						{
							System.out.println("Error: Expense cannot be greater than balance.");
						} 
						else 
						{
							balance = balance - expense;						  
						}
						System.out.println("Expense added successfully.");
						}
					break;
                case 3:
                    System.out.println("Current balance:Rs. " + balance);
                    break;

                case 4:
                    System.out.println("Here are some money managing tips:");
                    System.out.println("- Create a budget and stick to it.");
                    System.out.println("- Track your spending and review it regularly.");
                    System.out.println("- Look for ways to save on your regular expenses.");
                    break;

                case 5:
                    System.out.println("Here are some investment tips:");
                    System.out.println("- Start early and invest regularly.");
                    System.out.println("- Diversify your portfolio to minimize risk.");
                    System.out.println("- Consider investing in index funds or ETFs for low-cost, broad market exposure.");
                    break;

                case 6:
                    quit = true;
                    System.out.println("Thank you for using the Budget Tracker!");
                    break;

                default:
                    System.out.println("Error: Invalid choice.");
                    break;
            }
        }
    }
}