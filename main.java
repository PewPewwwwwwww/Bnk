import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        // JAVA BANKING SYSTEM
        
        //DECLARE VARIABLES
        
        double balance = 0;
        boolean run = true;
        int slection;

        //DISPLAY MENU


        while(run){
            System.out.print("----------------------");
            System.out.print("WELCOME TO BANK SYSTEM");
            System.out.print("----------------------");
    
            System.out.println(" ");
    
    
            System.out.print("\n\n----------------------");
    
            System.out.print("\n\n\nSTARTING....... " + "\n\nPRESS ENTER TO CONTINUE");
            sc.nextLine();
    
    
            System.out.println("\nShow Balance");
            System.out.println("Deposit");
            System.out.println("Withdraw");
            System.out.println("Exit");
    
            System.out.print("\n----------------------");
    
            //GET AND PROCESS USER INPUT
            System.out.print("Enter Your Choice (1-4): ");
            int choice = sc.nextInt();
    
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> run = false;
                default -> System.out.println("INVALID INPUT");
            }
    

        }


        //EXIT MESSAGE
        System.out.print("----------------------");
        System.out.print("Thank You For Banking With us");
        System.out.print("----------------------");

       
    }

    //showBlance()

    static void showBalance(double balance){
        System.out.println("\n----------------------");
        System.out.printf("$%.2f\n", balance);
        System.out.println("\n----------------------");
    }
    //deposit()
    static double deposit(){


        double amount;

        System.out.print("Enter an amount of deposited: ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("\nINVALID AMOUNT CAN'T BE NEGATIVE");
            return 0;
        }
        else{
            return amount;
        }

    }
    
    //withdraw()
    static double withdraw(double balance){

        double amount;


        System.out.print("Enter Your amount to be withdrawn: ");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.print("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.print("AMOUNT CANT BE NEGATIVE");
             return 0;
        }
        else{
            return amount;

        }
        
    }


}
