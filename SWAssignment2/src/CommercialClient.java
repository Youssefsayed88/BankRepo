/**
 * @author Youssef Mohamed Sayed
 * @since 1.0
 */

public class CommercialClient extends Client{

    /**
     * String to store the client's commercialID
     */
    private String commercialId;

    /**
     * Default Constructor
     */
    public CommercialClient(){
        super();
    }

    /**
     * Parametrized Constructor that sets the nationalId to 00000000000000 and replace it with commercialId
     * @param name String to store the client's name.
     * @param address String to store the client's address.
     * @param commercialId String to store the client's commercialID.
     * @param phone String to store the client's phone.
     * @param account This attribute stores the client's account.
     */
    public  CommercialClient(String name, String address, String commercialId, String phone, Account account){
        super(name, address, "00000000000000", phone, account);
        this.commercialId = commercialId;
    }

    /**
     * Parametrized Constructor that sets the nationalId to 00000000000000 and replace it with commercialId
     * @param info array of strings that stores the client's info {name,address,commercialId,phone}
     * @param account This attribute stores the client's Account.
     */
    public CommercialClient(String[] info, Account account){
        super(info[0],info[1],"00000000000000",info[3],account);
        commercialId = info[2];
    }


    /**
     * Overrides the getter of the nationalId
     * @return the commercialId of the client
     */
    @Override
    public String getId(){
        return commercialId;
    }

    /**
     * Setter for the nationalId attribute
     * @param commercialId String to store the client's commercialId.
     */
    public void setCommercialID(String commercialId) {
        this.commercialId = commercialId;
    }

    /**
     * Overrides the toString() method to print a commercial client object (name, address, commercialId, phone, account)
     * @return commercial client object
     */
    @Override
    public String toString() {
        return "name:" + getName() +"\taddress:" + getAddress() +"\tcommercialId:"+ getId() +
                "\tphone:" + getPhone() + "\taccount:" + getAccount();
    }
}