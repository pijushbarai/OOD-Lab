public abstract class Authorization{

    protected Authorization nextAuthorizer;
    protected int amount;

    public void setNextAuthorizer(Authorization nextauthorizer){
        this.nextAuthorizer = nextauthorizer;
    }

    public void authorizedWithdrawal(String accName,int amount){
        if(this.amount >= amount){
            withdraw(accName,amount);
        }else if(nextAuthorizer == null){
            withdraw(accName,amount);
        }
        else{
            nextAuthorizer.authorizedWithdrawal(accName, amount);
        }
    }

    abstract protected void withdraw(String accName, int amount);

}