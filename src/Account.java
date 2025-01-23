public class Account {
    // attributes
    private String id;
    private String firstName;
    private String lastName;
    private int balance = 0;

    // constructors

/*     public Account(String id, String firstName, String lastName) {
        this.id = "";
        this.firstName = "";
        this.lastName = "";
    }
 */

    public Account(String id, String firstName, String lastName, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    // behavior
    public String getID() {
        return id;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    //toString Method

    public String toString()
    {
        return ("ID: " + this.id +  " " + "Name: " + this.firstName + " " + this.lastName + " "+ "Balance: " + this.balance);
    }
}
