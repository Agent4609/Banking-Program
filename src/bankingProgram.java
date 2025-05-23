import java.util.Scanner;
import java.util.Random;

public class bankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int accountNum = random.nextInt(5000, 10000);
        String accountName = "";
        double balance = 0;
        double deposit ;
        double withdraw;
        int function;
        boolean accountActive = false;


        //Basic Banking Program
        // Welcome message
        System.out.println("Welcome to the Java Bank!");


        while (!accountActive){
        System.out.println("Would you like to open an account?");
        String confirm = scanner.nextLine().toUpperCase();




        if (confirm.equals("YES")) {
            // Opening an account under an alias
            System.out.println("What name is the account under?");
            accountName = scanner.nextLine();
            System.out.println("Thank you for creating an account with us!");
            accountActive = true;
        }

        else if (confirm.equals("NO")) {
                System.out.println("We wish to see you again if you ever change your mind. :)");
                return;
        } else {
                System.out.println("A simple yes or no question requires a simple yes or no answer");

        }


        }


        System.out.println(accDetails(accountNum, accountName));


        // User is able to perform various banking related functions until they leave the program
        // Depositing money
        // Withdrawing money
        // Check account balance
        // Exit the program

        System.out.println("What would you like to do?");
        System.out.println("1. View Account Balance");
        System.out.println("2. Deposit funds");
        System.out.println("3. Withdraw funds");
        System.out.println("4. View account details");
        System.out.println("5. Exit interface");
        function = scanner.nextInt();

        while(function != 5){
            switch (function){
                case 1 ->
                    System.out.printf("Your balance is $%.2f\n", balance );
                case 2 -> {
                    System.out.println("How much would you like to deposit?");
                    deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.printf("Your balance is now $%.2f\n", balance);
                }
                case 3 -> {
                    System.out.println("How much would you like to withdraw?");
                    withdraw = scanner.nextDouble();
                    if(withdraw > balance){
                        System.out.println("You do not have the required funds for that withdrawal");
                    }
                    else if(withdraw <= 0){
                        System.out.println("Invalid amount. Please enter a positive number");
                    }
                    else {


                        balance -= withdraw;
                        System.out.printf("Your balance is now $%.2f\n", balance);
                    }
                }
                case 4 ->
                    System.out.println(accDetails(accountNum, accountName));

                default ->
                    System.out.println("That is not a valid option. Please select again");

            }
            System.out.println("What would you like to do next?");
            System.out.println("1. View Account Balance");
            System.out.println("2. Deposit funds");
            System.out.println("3. Withdraw funds");
            System.out.println("4. View account details");
            System.out.println("5. Exit interface");
            function = scanner.nextInt();
        }
        System.out.println("Thank you for using the Java Bank! :");




    }
    static String accDetails(int accountNum, String accountName){
        return "Account number: " + accountNum + "\nAccount name: " + accountName;
    }

}








