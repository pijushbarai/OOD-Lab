public class CashierAuthorized extends Authorization{
    public CashierAuthorized(int amount ){
        this.amount = amount;
    }

    @Override
    protected void withdraw(String accName, int amount) {
       System.out.println("Account Authorized by Cashier");
       System.out.println("Withdraw taka "+amount + " from "+accName);
        
    }
    
}
