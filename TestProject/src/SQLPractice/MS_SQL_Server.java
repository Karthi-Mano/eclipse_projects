package SQLPractice;

import java.sql.Connection;
import java.sql.DriverManager;

public class MS_SQL_Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MS_SQL_Server db = new MS_SQL_Server();
        db.dbConnect("jdbc:sqlserver:Provider=SQLNCLI10.1; Data Source=QUEBEC; Database=PolicyAdministration;Integrated Security=SSPI", "", "" );

	}

    public void dbConnect(  String db_connect_string, 
	                            String db_userid, 
	                            String db_password){
	        try{
	        Class.forName( "com.microsoft.sqlserver.jdbc.SQLServerDriver" );
	            Connection conn = DriverManager.getConnection(
	                            db_connect_string, 
	                        db_userid, 
	                        db_password);
	            System.out.println( "connected" );
	        }
	        catch( Exception e ){
	            e.printStackTrace();
	        }
	    }
}
