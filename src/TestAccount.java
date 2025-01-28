public class TestAccount {
    public static void main(String[] args) {
        
        Account Acc1 = new Account( "Noah", "Devine", 5000);
        Account Acc2 = new Account( "Annie", "Malik", 4000);
        System.out.println(Acc1);
        System.out.println(Acc2 + " First.");
        Acc1.transferFunds(Acc2, 1000);
        System.out.println(Acc1);
        System.out.println(Acc2 + " Second.");

    }
}
