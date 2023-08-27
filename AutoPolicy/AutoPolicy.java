package AutoPolicy;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    //constructor
    public AutoPolicy(int accountNumber,String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    //set the account number
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    //return AccountNumber
    public int getAccountNumber(){
        return accountNumber;
    }

    //set makeAndModel
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }

    //get MakeAndModel
    public String getMakeAndModel(){
        return makeAndModel;
    }

    //set state
    public void setState(String state){
        this.state = state;
    }

    //get State
    public String getState(){
        return state;
    }
    
    //predicate methods return whether the state has no fault insurance
    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState())
        {
            case "MA": case "NJ": case "PA":
            noFaultState = true;
            break;
            default:
            noFaultState = false;
            break;
        }
        return noFaultState;
    }
}
