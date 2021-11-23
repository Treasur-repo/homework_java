package lab_19_bankaccount;
class Customer{
    private String firstName;
    private String lastName;
    private String idCard;
    public Customer(String newfName, String newlName){
        firstName = newfName;
        lastName = newlName;
    }
    public Customer(String newfName, String newlName, String newId){
        firstName = newfName;
        lastName = newlName;
        idCard = newId;
    }
    public void setFirstName(String newFname){ firstName = newFname;}
    public void setLastName(String newLname){ lastName = newLname;}
    public String getIdCard(){return idCard;}
    public String getfirstName(){return firstName;}
    public String getlastName(){return lastName;}
    public void displayCustomer(){
        System.out.println("CUSTOMER FIRSTNAME  : "+firstName);
        System.out.println("CUSTOMER LASTNAME   : "+lastName);
        System.out.println("CUSTOMER ID         : "+idCard);
    }
}

class Account{
    private String idAcc;
    private float balance;
    private Customer cus;
    private float vet = 1.25f;
    public Account(String newId, Customer c){
        idAcc = newId;
        cus = c;
    }
    public Account(String newId, Customer c, float newBal){
        idAcc = newId;
        cus = c;
        balance = newBal;
        if(balance < 1000){
            System.out.println("Minimum amount 1000 bath. ");
        }
    }
    public void setCustomer(Customer c){cus = c;}
    public void deposit(int amount){
        float total;
        total = balance + amount;
        System.out.println("DEPOSIT          : " +amount);
        System.out.println("MONEY IN ACCOUNT : " +balance);
        System.out.println("BALANCE          : " +total);
    }
    public void withdraw(int amount){
        float sum = balance - amount;
        if (amount > balance && sum < 1000){    
            System.out.println(">>Insufficient Funds!!!");
            System.out.println("BALANCE          : " +balance);
            
        } 
        else {
            System.out.println("WITHDRAW         : " +amount);
            System.out.println("MONEY IN ACCOUNT : " +balance);
            System.out.println("BALANCE          : " +sum);
        }
    }
    public void Interest(int day){
        float interest = (int)((balance * vet/100)*day/365);
        
        System.out.println("BALANCE          : " +interest);
        System.out.println("BALANCE          : " +(balance+interest));
    }
    public void displayAccount(){
        System.out.println("ID CARD          : " +cus.getIdCard());
        System.out.println("ACCOUNT          : " +idAcc);
        System.out.println("FIRST NAME       : " +cus.getfirstName());
        System.out.println("LAST NAME        : " +cus.getlastName());
    }
}
public class Lab_19_BankAccount {
    public static void main(String[] args) {
        Customer cus = new Customer("daorueang", "wetchakama","135-2345-465");
        Customer cus1 = new Customer("somrak", "deedee", "222-3456-555");
        Customer cus2 = new Customer("ploysri", "naruk", "123-4567-890");
        
        System.out.println("----------Account_1----------");
        Account acc = new Account("1234", cus, 15000);
        acc.deposit(500);
        acc.displayAccount();
        System.out.println();
        
        System.out.println("----------Account_2----------");
        Account acc1 = new Account("555", cus1, 200000);
        acc1.withdraw(15000);
        acc1.displayAccount();
        System.out.println();
        
        System.out.println("----------Account_3----------");
        Account acc2 = new Account("5000", cus2, 234000);
        acc2.Interest(600);
        acc2.displayAccount();
        System.out.println();
    } 
}
