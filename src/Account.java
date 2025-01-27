public class Account {
    // attributes
    private static int idCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private int balance = 0;

    // constructors

    public Account() {
        this.firstName = "no name";
        this.lastName = "no name";
    }
    
    
    public Account( String firstName, String lastName, int balance) {
        
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        
    }
    // behavior

    public int getID() {
        return id;
    }
    public int setID() {
        return ++this.id ;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public int getBalance() {
        return balance;
    }

    public int addCredit(int amount) {
        this.balance += amount;
        return balance; 
    }
    //toString Method
    @Override
    public String toString()
    {
        return ("ID: " + this.id +  " " + "Name: " + this.firstName + " " + this.lastName + " "+ "Balance: " + this.balance);
    }
}
