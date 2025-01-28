public class Account {
    // attributes
    private static int idCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private double balance = 0;
    private double lastAddedCredit;

    // constructors

    public Account() {
        this.id = ++idCounter;
        this.firstName = "no name";
        this.lastName = "no name";
    }
    
    
    public Account( String firstName, String lastName, double balance ) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        
    }
    // behavior


    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public double getBalance() {
        return balance;
    }

    public void addCredit(double amount) {
        this.balance += amount; // updates balance
        this.lastAddedCredit = amount; // saves added value
    }

    public double getLastAdd() {
        return lastAddedCredit; // displays last saved value
    }
    // transfer method
    public boolean transferFunds(Account recipient, double amount) {
        // checks if the sender has more then transfer ammount
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount; // takes from sender
            recipient.addCredit(amount); // adds to recipient
            return true;
        } else {
            return false;
        }
    }
    //toString Method
    @Override // always overrride your default toString() constructor
    public String toString()
    {
        return ("ID: " + this.id +  " " + "Name: " + this.firstName + " " + this.lastName + " "+ "Balance: " + this.balance);
    }
}
