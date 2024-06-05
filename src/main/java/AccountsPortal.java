import java.util.HashSet;
class Account{
    String accountNumber;
    public Account(String accountNum){
        accountNumber = accountNum;
    }
}


public class AccountsPortal {
    public static void main(String[] args) {
        HashSet < Account > accounts = new HashSet<> ();
        accounts.add(new Account("23454"));
        accounts.add(new Account("43434"));
        System.out.println(accounts.contains(new Account("23454")));
    }
}
