/**
 * @author Abdel-Rahman Sameh Abdel-Kader
 * @since 1.0
 */
public class SpecialAccount extends Account {
    /**
     * Default constructor that calls the parent class's default constructor
     */
    public SpecialAccount(){
        super();
    }

    /**
     * Parametrized constructor that calls the parent class's parametrized constructor
     * @param balance
     */
    public SpecialAccount(double balance) {
        super(balance);
    }

    /**
     * Override the withdraw() method to allow the special accounts to withdraw till the balance reach -1000 not only 0
     * @param value
     */
    @Override
    public void withdraw(double value) {
        if(getBalance()>=value || (value-getBalance())<=1000) {
            balance -= value;
        }else {
            System.out.println("Your balance is not enough. You have " + getBalance() + "EGP");
        }
    }
}