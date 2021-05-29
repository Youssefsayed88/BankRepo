import java.util.Scanner;

/**
 * @author Abdel-Rahman Sameh Abdelkader
 * @author Youssef Mohamed Sayed
 * @version 1.0
 */

/**
 * User's Interface
 */
public class Menu {

    /**
     * Scanner variable to take input from the user
     */
    static Scanner input = new Scanner(System.in);

    /**
     * This method takes the client's info and return it as an array of strings
     * @return an array of strings consisting of the client's info (name address National/Commercial ID and phone number)
     */
    public static String[] clientInfo(){
        System.out.println("please enter your name, address, National ID/Commercial ID and your phone number" +
                "(Press enter after entering each)");
        input.nextLine();
        String name = input.nextLine();
        String address = input.nextLine();
        String id = input.nextLine();
        String phone = input.nextLine();
        return new String[]{name, address, id, phone};
    }
    /**
     * The main method.
     * @param args The command line arguments.
     */
    public static void main(String[] args){

        int choice;
        boolean flag = true;
        System.out.println("\n\t\t\t\t\t Welcome to the Bank System");
        System.out.println("Please enter the Bank's name,address and phone number" +
                "(Press enter after entering each)");
        String bankName = input.nextLine();
        String bankAddress = input.nextLine();
        String bankNumber = input.nextLine();
        Bank bankObj = new Bank(bankName,bankAddress,bankNumber);

        while(flag){
            System.out.println("Main menu");
            System.out.println("1- Add account/client");
            System.out.println("2- Display accounts/clients");
            System.out.println("3- Deposit/Withdraw");
            System.out.println("4- Bank information");
            System.out.println("5- Quit");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("1- Normal Account\n2- Special Account\n3- Main Menu");
                    int accountType; accountType = input.nextInt();

                    //Normal Account
                    if(accountType == 1) {
                        System.out.println("1- Normal Client\n2- Commercial Client\n");
                        int clientType;
                        clientType = input.nextInt();
                        Account accountObj = new Account();

                        //Normal Account Normal Client
                        if (clientType == 1) {
                            String[] info = clientInfo();
                            Client clientObj = new Client(info, accountObj);
                            bankObj.addClient(clientObj);

                            //Normal Account Commercial Client
                        }else if (clientType == 2) {
                            String[] info = clientInfo();
                            CommercialClient clientObj = new CommercialClient(info, accountObj);
                            bankObj.addClient(clientObj);

                        } else {
                            System.out.println("Please enter a valid choice");
                        }

                    }else if(accountType == 2){
                        System.out.println("1- Normal Client\n2- Commercial Client");
                        int clientType; clientType = input.nextInt();
                        SpecialAccount accountObj = new SpecialAccount();

                        //Special Account Normal Client
                        if(clientType == 1) {
                            String[] info = clientInfo();
                            Client clientObj = new Client(info, accountObj);
                            bankObj.addClient(clientObj);

                            //Special Account Commercial Client
                        }else if(clientType == 2) {
                            String[] info = clientInfo();
                            CommercialClient clientObj = new CommercialClient(info, accountObj);
                            bankObj.addClient(clientObj);

                        }else{
                            System.out.println("please enter a valid choice");
                        }
                    }
                    break;
                //Display accounts/clients
                case 2:
                    bankObj.displayClients();
                    break;
                // Deposit/Withdraw
                case 3:
                    System.out.println("Enter the National/Commercial ID of the account");
                    bankObj.findAccount(input.next());
                    break;

                //Bank info
                case 4:
                    System.out.println(bankObj.getName());
                    System.out.println(bankObj.getAddress());
                    System.out.println(bankObj.getPhone());
                    break;
                //Quit
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }
    }
}