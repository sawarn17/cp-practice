package designpattern.facorydp;

import java.util.Objects;

public class AccountFactory {
    
    public Account geAccountFactory(String accountType){
        if(Objects.isNull(accountType)){
            return null;
        }else{
            switch (accountType) {
                case "SAVING_ACCOUNT":
                        return new SavingAccount();
                case "CURRENT_ACCOUNT" :
                        return new CurrentAccount();
                default:
                    return null;
            }
        }
    }
}
