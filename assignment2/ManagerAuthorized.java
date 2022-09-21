public class ManagerAuthorized extends Authorization{

  

    @Override
    protected void withdraw(String accName, int amount) {
        // TODO Auto-generated method stub
        System.out.println("Accout athorized by Senior officer and Manager");
        System.out.println("Withdraw taka "+amount + " from "+accName);
        
    }

    
}
