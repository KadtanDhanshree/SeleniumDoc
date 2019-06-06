package ej.mm.generic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

import com.mkyong.rest.Conn;
import com.mysql.cj.jdbc.MysqlDataSource;

public class DBOperations {

	
	public static java.sql.Connection GetDBConnectionObject() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException
	{
		//if(Conn.conn!=null) return Conn.conn;
		//System.out.println("1 inside GetDBConnection object");
		//----first read all the config.properties data in order to connect to Database
		String MachineName=PropertiesFileReader.GetParameterValue("dbserver");
		String DBName=PropertiesFileReader.GetParameterValue("dbname");
		String DBUser=PropertiesFileReader.GetParameterValue("dbuser");
		String DBPassword=PropertiesFileReader.GetParameterValue("dbpassword");
		String DBPortNumber=PropertiesFileReader.GetParameterValue("dbport");
		//System.out.println("before creating a new istance of mysql db class");
		 Conn.ds = new MysqlDataSource();
		 Conn.ds.setUrl("jdbc:mysql://"+MachineName+":"+DBPortNumber+"/"+DBName+"?autoReconnect=true&wait_timeout=10000");
		 Conn.ds.setUser(DBUser);
		 Conn.ds.setPassword(DBPassword);
		 Conn.ds.setLoginTimeout(1000);
	
		return Conn.ds.getConnection();
		/*	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//System.out.println("#############################aaa");
			try
			{
				System.out.println("Connection String Used:jdbc:mysql://"+MachineName+":"+DBPortNumber+"/"+DBName+"?autoReconnect=true");
				Conn.conn= DriverManager.getConnection("jdbc:mysql://"+MachineName+":"+DBPortNumber+"/"+DBName+"?autoReconnect=true",DBUser,DBPassword);
				return Conn.conn;
			}
			catch(Exception ex)
			{
				System.out.println(ex);		
				System.out.println("not able to create connection with the database");
				return null;
			}*/
	}
	public static java.sql.Connection GetDBConnectionObject(String MachineName,String DBName,String DBUser,String DBPassword,String DBPortNumber) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://"+MachineName+":"+DBPortNumber+"/"+DBName,DBUser,DBPassword);
			return conn;
		
	}
	public static ArrayList<String> GetAllTables(java.sql.Connection dbConnectionObject) throws SQLException
	{
		ResultSet rs=dbConnectionObject.getMetaData().getTables(dbConnectionObject.getCatalog(), null, "%", null);
		ArrayList<String> allTables=new ArrayList<String>();
		while (rs.next()) {
			  allTables.add(rs.getString(3));
			}
		//dbConnectionObject=null;
		return allTables;
		
	}
	public static ResultSet RunSelectSQLQuery1(java.sql.Connection dbConnectionObject,String SQLQuery) throws SQLException
	{
		Statement st = dbConnectionObject.createStatement();
		ResultSet res = st.executeQuery(SQLQuery);
	//	dbConnectionObject=null;
		return res;
	}
	public static ArrayList<String> GetPrimaryKeyColumnName(java.sql.Connection dbConnectionObject,String TableName) throws SQLException
	{
		ArrayList<String> pkcolnames=new ArrayList<String>();
		String sql="SELECT distinct(column_name) FROM key_column_usage WHERE constraint_name='primary' AND"
				+ " table_name='"+TableName+"'";
		ResultSet res=dbConnectionObject.getMetaData().getPrimaryKeys(null, null, TableName);
		 while (res.next()) {
			 pkcolnames.add(res.getString("column_name"));
		  }
	//	 dbConnectionObject=null;
		 return pkcolnames;
	}
	public static String[] GetTableColumns(java.sql.Connection dbConnectionObject,String TableName,String DBName) throws SQLException
	{
		Statement st = dbConnectionObject.createStatement();
		String colNames="";
		ResultSet res = st.executeQuery("SELECT column_name FROM information_schema.`COLUMNS` WHERE table_name='"+TableName+"' and table_schema='"+DBName+"'");
		 while (res.next()) {
		 	 colNames=colNames+","+res.getString("column_name");
		  }
		// dbConnectionObject=null;
		 if(colNames.equals(""))
		 {
			 return null;
		 }
		 else
		 {
			 return colNames.replaceFirst(",", "").split(",");
		 }
	}
	public static Hashtable<Integer,String[]> RunSelectSQLQuery(java.sql.Connection dbConnectionObject,String SQLQuery) throws SQLException
	{
		Statement st = dbConnectionObject.createStatement();
		//System.out.println("Statement object is getting created");
		ResultSet res = st.executeQuery(SQLQuery);
		//System.out.println("Query executed");
		int colCount=res.getMetaData().getColumnCount();
		//System.out.println("getting the column count");
		Hashtable<Integer,String[]> hstTable=new Hashtable<Integer, String[]>();
		//System.out.println("hash table object generated");
		int counter=0;
		 while (res.next()) {
			 String[] rowValues=new String[colCount];
		  	  for(int c=0;c<colCount;c++)
			  {
		  		rowValues[c]=res.getString(c+1);
			  }
		  	hstTable.put(counter, rowValues);
		  	counter++;
		  }
		// dbConnectionObject=null;
		return hstTable;
	}
	public static boolean RunUpdateInsertDeleteSQLQuery(java.sql.Connection dbConnectionObject,String SQLQuery) throws SQLException
	{
		boolean status=true;
		try{
		Statement st = dbConnectionObject.createStatement();
		int res = st.executeUpdate(SQLQuery);
		}
		catch(SQLException ex)
		{
			status=false;
		}
		catch(Exception ex)
		{
			status=false;
		}
		//dbConnectionObject=null;
		return status;
		
	}
	public static String RunUpdateInsertDeleteSQLQueryWithErrorMessage(java.sql.Connection dbConnectionObject,String SQLQuery) throws SQLException
	{
		String status=null;
		try{
		Statement st = dbConnectionObject.createStatement();
		int res = st.executeUpdate(SQLQuery);
		}
		catch(SQLException ex)
		{
			status=ex.getLocalizedMessage();
		}
		catch(Exception ex)
		{
			status=ex.getLocalizedMessage();
		}
		//dbConnectionObject=null;
		return status;
		
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	  java.sql.Connection oConn=GetDBConnectionObject("localhost","finsys","root","admin","3306");
	  System.out.println(oConn);
	 String[] allColumns= GetTableColumns(oConn,"cities","finsys");
	 System.out.println(allColumns[0]+" "+allColumns[1]);
	 Hashtable<Integer,String[]> hstble= RunSelectSQLQuery(oConn, "select * from cities");
	 System.out.println(hstble.get(0)[0]);
	 System.out.println(hstble.get(0)[1]);
	 boolean val= RunUpdateInsertDeleteSQLQuery(oConn, "update cities set cityname='A.THEKKUR' where citycode='101'");
	System.out.println(val);
	}

}
