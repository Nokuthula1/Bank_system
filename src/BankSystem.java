import javax.swing.*;
import java.sql.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BankSystem extends CheckingAccount {

    Connection conn = null;
    ResultSet rs;
    PreparedStatement ps;

    public static void main(String [] args) {

        conn = ConnectData.initConnection();


        Random rand = new Random();
        int accountNo = (rand.nextInt(10000+1));

        CheckingAccount a1 = new CheckingAccount(101, 15.00,"12365", 120.3455);
        a1.withdraw(5.00);
        a1.deposit(00.00);
        a1.setAnnualInterestRate(4.5);
        Date dat = new Date();

        String sql = "insert into Savings_Account(id,accNo,balance,overdraft) values (?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, 101);
        ps.setDouble(2, 15.00);
        ps.setString(3, "12365");

        String sql1 = "insert into Current_Account(id,accNum,balance, overdraft) values (?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, 101);
        ps.setDouble(2, 15.00);
        ps.setString(3, "12365");



//        System.out.println("Balance: " + a1.getBalance() +
//                "\nAccount Number: " + a1.getAccountNo() +
//                "\nDate Created: " + dat);

}
