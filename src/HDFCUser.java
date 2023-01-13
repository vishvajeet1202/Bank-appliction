import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankApp {
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static  double rateOfInterest;

    public HDFCUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest=6.5;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Your new balance is"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Insufficient Money";
            }else{
                balance=balance-amount;
                return "Amount withdrawn successfully";
            }
        }else{
            return "Invalid Password!!";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
