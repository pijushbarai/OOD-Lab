public class BankingSystem {
   
    private static Authorization getChainOfAuthorizer(){
        Authorization cashierAuthorized = new CashierAuthorized(10000);
        Authorization managerAuthorized = new ManagerAuthorized();
        Authorization seniorOfficerAuthorized = new SeniorOfficerAuthorized(100000);

        cashierAuthorized.setNextAuthorizer(seniorOfficerAuthorized);
        seniorOfficerAuthorized.setNextAuthorizer(managerAuthorized);

        return cashierAuthorized;
    }

    public static void main(String[] args) {
        Authorization authorizer = getChainOfAuthorizer();
        authorizer.authorizedWithdrawal("pijush", 55000);
        authorizer.authorizedWithdrawal("Abir",9999);
        authorizer.authorizedWithdrawal("Kawsar",200000);
    }

}
