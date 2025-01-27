public class TestAccount {
    public static void main(String[] args) {
        Account A1 = new Account();
        Account Acc1 = new Account( "Noah", "Devine", 4000);
        Account Acc2 = new Account( "Annie", "Malik", 5000);
        System.out.println(A1);
        System.out.println(Acc1 + " First Print.");
        // set methods
        System.out.println(Acc2 + " Second Print.");
        // get method for fullname
        Acc1.addCredit(2000);
        System.out.println(Acc1);;
        System.out.println(A1);        
    }
}
