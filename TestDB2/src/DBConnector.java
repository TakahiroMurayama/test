import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



/**
 * <p>MYSQLに接続する為のユーティリティクラスです。<br>
 *ルートアカウントにてDBに接続されます。</p>
 */
public class DBConnector {

/**
 * JDBCドライバー名
 */
	private static String driverName= "com.mysql.jdbc.Driver";
/**
 * データベース接続URL
 */
private static String url= "jdbc:mysql://loclhost/testdb?autoReconnect=true$useSSL=false";

/**
 * データベース接続ユーザー名
 */
private static String user= "root";
/**
 * データベース接続パスワード
 */
private static String password= "mysql";

public Connection getConnection(){
Connection con= null;
try{
Class.forName()
}
}
}
