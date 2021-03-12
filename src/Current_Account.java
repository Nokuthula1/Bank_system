import java.math.BigInteger;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Current_Account {
    private int id;
    private BigDecimal balance;
    private Date dateCreated;
    private String accountNo;
    private BigDecimal overDraft = -100 000;;


    public Current_Account()
    {
        id = 0;
        balance = 0;
        accountNo = "";
        annualInterestRate = 0;
    }

    public Current_Account(int iD, BigDecimal balancE, String accNo,BigDecimal overdraft)
    {
        id = iD;
        accountNo = accNo;
        balance = balancE;
        overDraft = overdraft;
    }
    public void setID(int iD)
    {
        id = iD;
    }
    public int getID()
    {
        return(id);
    }
    public void setAccountNo(String accNo)
    {
        accountNo = accNo;
    }
    public String getAccountNo()
    {
        return(accountNo);
    }
    public void setOverDraft(BigDecimal overDraft1)
    {
        overDraft = overDraft1;
    }
    public BigDecimal getoverDraft(BigDecimal overDraft1)
    {
        return(overDraft);
    }
    public void setBalance(BigDecimal balancE)
    {
        balance = balancE;
    }
    public double getBalance()
    {
        return(balance);
    }
    public void setDateCreated(Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }

    public void withdraw(String accountNo,BigDecimal amount)
    {
        balance = (balance - amount);
        setBalance(balance);
    }
    public void deposit(BigDecimal amount) {
        balance = balance + amount;
        setBalance(balance);
    }
    public void setBeginningBalance( BigDecimal begBalance )
    {
        if(begBalance >=1000){
            beginningBalance = begBalance;
        }else{
            System.out.println("Initial Deposit to open an account is R1000");
        }

    }
}
