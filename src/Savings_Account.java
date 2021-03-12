public class Savings_Account {
    private String accountNumber;
    private int id;
    private BigDecimal beginningBalance;
    private BigDecimal endBalance;
    private BigDecimal totalWithdrawal;
    private BigDecimal totalDeposit;

    public Savings_Account(int iD, String actNumber, BigDecimal balance )
    {
        id=iD;
        accountNumber = acctNumber;
        endBalance = balance
    }

    // method to set the beginning balance
    public void setBeginningBalance( BigDecimal begBalance )
    {
        if(begBalance >=1000){
            beginningBalance = begBalance;
        }else{
            System.out.println("Initial Deposit to open an account is R1000");
        }

    }
    // method to deposit to the account balance
    public void addDeposit( BigDecimal depositAmount )
    {
        beginningBalance += depositAmount;
        totalDeposit += depositAmount;
    }

    // method to withdraw from the account balance
    public void subtractWithdrawal( BigDecimal withdrawalAmount )
    {
        beginningBalance -= withdrawalAmount;
        totalWithdrawal += withdrawalAmount
    }

    // method to display the account data and display a message
    public void printStatement
    {
        System.out.println(accountNumber);
        System.out.println(endBalance);
        System.out.println();
    }

