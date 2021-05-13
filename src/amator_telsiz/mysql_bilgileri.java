package amator_telsiz;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1BestCsharp
 */
public class mysql_bilgileri {

    private static String servername = "mavikulubeliadam.xyz";
    private static String username = "dbamatortelsiz";
    private static String dbname  = "dbamatortelsiz";
    private static Integer portnumber  = 3306;
    private static String password = "Cu57Z79naRNregjx";
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + mysql_bilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
}
