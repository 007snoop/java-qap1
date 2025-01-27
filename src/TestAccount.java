public class TestAccount {
    public static void main(String[] args) {
        Account A1 = new Account();
        Account Acc1 = new Account( "Noah", "Devine", 4000);
        Account Acc2 = new Account( "Annie", "Malik", 5000);
        System.out.println(Acc1);
        System.out.println(Acc2 + " First.");
        Acc1.transferFunds(Acc2, 500);
        System.out.println(Acc1);
        System.out.println(Acc2 + " Second.");

    }
}
