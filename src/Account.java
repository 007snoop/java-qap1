public class Account {
    // attributes
    private String id;
    private String firstName;
    private String lastName;
    private int balance = 0;

    // constructors

    public Account(String id, String firstName, String lastName) {
        this.id = "";
        this.firstName = "";
        this.lastName = "";
    }


    public Account(String id, String firsName, String lastName, int balance) {
        this.id = id;
        this.firstName = firsName;
        this.lastName = lastName;
        this.balance = balance;
    }
    // behavior


    // get and set 


    //toString Method

    public String toString()
    {
        return ("ID: " + this.id +  " " + "Name: " + this.firstName + " " + this.lastName + " "+ "Balance: " + this.balance);
    }
}
