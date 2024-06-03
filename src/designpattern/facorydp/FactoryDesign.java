package designpattern.facorydp;


// this is the demo of factory design pattern in java.
public class FactoryDesign {
    
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        System.out.println("WE ARE CALLING SAVING ACCOUNT FACTORY");
        Account savingAccount = accountFactory.geAccountFactory("SAVING_ACCOUNT");
        savingAccount.accountType();

        System.out.println("=======================CALLING CURRENT ACCOUNT FACTORY====================================");
        Account currentAccount = accountFactory.geAccountFactory("CURRENT_ACCOUNT");
        currentAccount.accountType();
    }
}
