package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public static Connection connexionBdd() throws SQLException {
        Connection maConnection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aai_todolistjx","root","");
        return maConnection;
    }


}
