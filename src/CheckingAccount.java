import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckingAccount extends Current_Account {

//    final static double OVERDRAFT_LIMIT = -100 000;

    Connection conn = null;
    ResultSet rs;
    PreparedStatement ps;

    public CheckingAccount()
    {
        super();
    }
    public CheckingAccount(int iD, BigDecimal balancE, String accNo) throws SQLException {

        super(iD, balancE, accNo);

    }

}
