public class SeniorOfficerAuthorized extends Authorization{
    
    public SeniorOfficerAuthorized(int amount){
        this.amount = amount;
    }

    @Override
    protected void withdraw(String accName, int amount) {
        // TODO Auto-generated method stub
        System.out.println("Account Authorized by Cashier and senior officer");
        System.out.println("Withdraw taka "+amount + " from "+accName);
        
    }
    
}
