class NewUser implements User {
    // number must be unique 
    // name no need unique but not blank
    // new users default 100 balance
    private String name;
    private String number;
    private double balance;

    NewUser(String name, String number) {
        this.name = name;
        this.number = number;
        this.balance = 100.0;
    }
    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public Double getBalance() {
        return this.balance;
    }

    public String printName() {
        return " (" + this.name + ") ";
    }
    public void changeBalance(Double value) {
        this.balance += value;
    }

    @Override
    public String toString(){
        return this.number + ": " + this.name + " " + this.balance; 
    }
}
