public class TestAccount {
    public static void main(String[] args) {
        Account A1 = new Account();
        Account Acc2 = new Account(2, "Noah", "Devine", 4000);
        Account Acc1 = new Account(1, "Annie", "Malik", 5000);
        Account tesAccount = new Account();
        System.out.println(A1);
        Acc1.setID();
        Acc2.setID();
        System.out.println(Acc1 + " First Print.");
        // set methods
        System.out.println(Acc2 + " Second Print.");
        // get method for fullname
        tesAccount.setID();
        Acc1.addCredit(1000);
        System.out.println(Acc1);;
        System.out.println(tesAccount);
        
    }
}
