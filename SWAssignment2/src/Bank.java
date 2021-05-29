import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Abdel-Rahman Sameh Abdel-Kader
 * @author Youssef Mohamed Sayed
 * @since 1.0
 */
public class Bank {
    /**
     * String variable to store the name of the Bank
     */
    private String name;
    /**
     * String variable to store the address of the Bank
     */
    private String address;
    /**
     * String variable to store the phone number of the Bank
     */
    private String phone;
    /**
     * An ArrayList of Account type to store all the created accounts
     */
    private ArrayList<Account> accArr;
    /**
     * An ArrayList of Client type to store all the created clients
     */
    private ArrayList<Client> clientArr;

    /**
     * Default constructor that gives initial value to the name,address and the phone number
     * and declare the two ArrayLists that will store the accounts and the clients
     */
    public Bank(){
        name = null; address = null; phone = null;
        accArr = new ArrayList<>();
        clientArr = new ArrayList<>();
    }

    /**
     * Parametrized constructor that take the name,address and the phone number of the Bank
     * and declare the two ArrayLists that will store the accounts and the clients
     * @param name
     * @param address
     * @param phone
     */
    public Bank(String name, String address, String phone){
        this.name = name; this.address = address;
        this.phone = phone;
        accArr = new ArrayList<>();
        clientArr = new ArrayList<>();
    }
    //Setters and Getters

    /**
     * Setter for the Bank's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for the Bank's name
     * @return Bank's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the Bank's address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Getter for the Bank's address
     * @return Bank's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for the Bank's phone number
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Getter for the Bank's phone number
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Method that store the Client's info and the Client ArrayList
     * store the client's account in the Account ArrayList
     * @param client
     */
    public void addClient(Client client){
        accArr.add(client.getAccount());
        clientArr.add(client);
    }

    /**
     * Method that displays all the Clients and their accounts with all the stored details
     */
    public void displayClients(){
        for(int i = 0; i< Account.accountCount;i++){
            System.out.println(clientArr.get(i));
        }
    }
    /**
     * Method that search for an account using his National/Commercial ID
     * @param id
     */
    public void findAccount(String id){
        boolean found = false;
        int accountIndex = 0;

        for (int i = 0; i< Account.accountCount;i++){
            if(clientArr.get(i).getId().equals(id)){
                found = true;
                accountIndex = i;
                break;
            }
        }
        if(!found){
            System.out.println("Please enter a valid ID.");
        }else{
            manageAccount(clientArr.get(accountIndex).getAccount());
        }
    }

    /**
     * Method that allows the user to Deposit/Withdraw to/from his account
     * @param account
     */
    private void manageAccount(Account account){

        Scanner input = new Scanner(System.in);
        System.out.println("1- Deposit");
        System.out.println("2- Withdraw");

        switch (input.nextInt()) {
            case 1:
                System.out.println("Enter the value that you want to deposit");
                account.deposit(input.nextDouble());
                break;
            case 2:
                System.out.println("Enter the value that you want to withdraw");
                account.withdraw(input.nextDouble());
                break;
            default:
                System.out.println("Please enter a valid choice");
        }
    }

}