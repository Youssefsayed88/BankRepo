/**
 * @author Youssef Mohamed Sayed
 * @since 1.0
 */

public class Client {

    /**
     * String to store the client's name
     */
    private String name;
    /**
     * String to store the client's address
     */
    private String address;
    /**
     * String to store the client's nationalID
     */
    private String nationalId;
    /**
     * String to store the client's phone
     */
    private String phone;
    /**
     * This attribute stores the client's account
     */
    private Account account;

    /**
     * Default Constructor
     */
    public Client(){
        name = null;
        address = null;
        phone = null;
        nationalId = null;
    }

    /**
     * Parametrized Constructor
     * @param name String to store the client's name.
     * @param address String to store the client's address.
     * @param nationalId String to store the client's nationalID.
     * @param phone String to store the client's phone.
     * @param account This attribute stores the client's account.
     */
    public Client(String name, String address, String nationalId, String phone, Account account){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nationalId = nationalId;
        this.account = account;
    }

    /**
     * Parametrized Constructor
     * @param info array of strings that stores the client's info {name,address,nationalId,phone}
     * @param account This attribute stores the client's Account.
     */
    public Client(String[] info, Account account){
        name = info[0];
        address = info[1];
        nationalId = info[2];
        phone = info[3];
        this.account = account;
    }

    /**
     * Setter for the name attribute
     * @param name String to store the client's name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for the name attribute
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the address attribute
     * @param address String to store the client's address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Getter for the address attribute
     * @return the address of the client
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for the nationalId attribute
     * @param nationalId String to store the client's nationalID.
     */
    public void setId(String nationalId) {
        this.nationalId = nationalId;
    }
    /**
     * Getter for the nationalId attribute
     * @return the nationalId of the client
     */
    public String getId() {
        return nationalId;
    }

    /**
     * Setter for the phone attribute
     * @param phone String to store the client's phone.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Getter for the phone attribute
     * @return the phone of the client
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for the account attribute
     * @param account This parameter stores the client's account.
     */
    public void setAccount(Account account) {
        this.account = account;
    }
    /**
     * Getter for the account attribute
     * @return the account of the client
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Overrides the toString() method to print a client object (name, address, nationalId, phone, account)
     * @return client object
     */
    @Override
    public String toString() {
        return "name:" + name +"\taddress:" + address +"\tnationalId:"+ nationalId +
                "\tphone:" + phone + "\taccount: " + account;
    }

}