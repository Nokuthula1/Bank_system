import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectData {
    Connection conn;

    public static Connection initConnection(){

        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Downloads\\JAVA-NetBeans-Banking-Management-System\\com.enviro.assessment.grad001.nokuthulakhoza\\Banking_System.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
