public class TestAccount {
    public static void main(String[] args) {
     /*    Account A1 = new Account("1", "colin", "yetman");
        System.out.println(A1); */
        Account Acc1 = new Account("2", "Annie", "Malik", 5000);
    
        Account Acc2 = new Account("3", "Noah", "Devine", 4000);
        System.out.println(Acc1 + " First Print.");
        // set methods
        Acc1.setFirstName("Colin");
        Acc1.setLastName("Yetman");
        System.out.println(Acc1 + " Second Print.");
        // get method for fullname
        String FullName = Acc1.getFullName();
        System.out.println(FullName);
        // get method for id
        String ID = Acc2.getID();
        System.out.println(ID);
        
    }
}
