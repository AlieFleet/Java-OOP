package Classes;

public class Account {
    
    private String id;
    private String name;
    private int balance = 0;

    //constructor
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //getter method
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <= balance){
            this.balance = balance - amount; 
        }
        else{
            System.out.println("Amount exceed balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <= balance){
            this.balance -= amount;
        }
        else{
            System.err.println("Amount exceed balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id = %s, name = %s, balance = %d]".formatted(id, name, balance);
    }

}
