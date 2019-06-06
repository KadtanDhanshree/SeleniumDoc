package org.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashtable {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int key=0;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		java.sql.Connection con;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finsys","root", "admin");
		Statement st=con.createStatement();
		ResultSet res= st.executeQuery("select id, Firstname, Lastname from users;");
			
		ResultSetMetaData rsmd = res.getMetaData();
		
		ArrayList<String> columns = new ArrayList<String>(rsmd.getColumnCount());
		for(int i = 1; i <= rsmd.getColumnCount(); i++)
		{
			columns.add(rsmd.getColumnName(i));
			//System.out.println(rsmd.getColumnName(i));
		}
		
		java.util.Hashtable<Integer, Map<String, String>> Table = new java.util.Hashtable<Integer, Map<String, String>>();
		while(res.next()){
			Map<String, String> row= new HashMap<String, String>(columns.size());
			for(String col : columns) {
				row.put(col, res.getString(col));
			}
			Table.put(key++, row);	
		}
		System.out.println(Table);
}
}