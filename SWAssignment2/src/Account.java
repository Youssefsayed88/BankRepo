/**
 * @author Abdel-Rahman Sameh Abdel-Kader
 * @since 1.0
 */
public class Account {
    /**
     * Double variable to store the balance of the client
     */
    protected double balance;
    /**
     * Integer variable to give each account his number
     */
    private int accountNumber;
    /**
     * Static variable to keep track of the accounts number
     */
    public static int accountCount = 0;

    /**
     * Default constructor that gives initial value to the account's balance and give the account a number
     */
    public Account(){
        balance = 0; accountNumber = ++accountCount;
    }

    /**
     * Parametrized constructor that gives the account his number and store the indicated value
     * @param balance
     */
    public Account(double balance){
        this.balance = balance; accountNumber = ++accountCount ;
    }
    //Setters and Getters

    /**
     * Setter for the account's balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Getter for the account's balance
     * @return account's balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Getter for the account number
     * @return account number
     */
    public double getAccountNumber() {
        return accountNumber;
    }

    /**
     * Override the toString() method to print an account object (account number and balance)
     * @return account object
     */
    @Override
    public String toString() {
        return "accNum= " + accountNumber + "\tbalance= " + balance;
    }

    /**
     * Method to deposit the indicated value in the parameter to the account's balance
     * @param value
     */
    public void deposit(double value){
        balance += value;
    }

    /**
     * Method to withdraw the indicated value in the parameter from the account's balance if possible
     * @param value
     */
    public void withdraw(double value){
        if (balance >= value) {
            balance -= value;
        }else {
            System.out.println("Your balance is not enough. You have " + getBalance() + "EGP");
        }
    }
}
