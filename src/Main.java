import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Name, password, balance to create an account");
        String name= sc.nextLine();
        String password= sc.nextLine();
        double balance=sc.nextDouble();

        // creating user
        HDFCUser user1=new HDFCUser(name,balance,password);

        // add money
        System.out.println("Enter the amount to be added");
        int money=sc.nextInt();
        String msg1= user1.addMoney(money);
        System.out.println(msg1);

        //withdraw money
        System.out.println("enter the amount to be withdrawn");
        int amt= sc.nextInt();
        System.out.println("Enter the password");
        String userpass= sc.next();
        System.out.println(user1.withdrawMoney(amt,userpass));
        //System.out.println(userpass);
        //rate of interest
        System.out.println(user1.calculateInterest(10));
    }
}