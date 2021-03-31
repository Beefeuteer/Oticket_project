package ObjectProject.common;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class Star {
	private int i=1;
    java.sql.Connection con = null;
    ResultSet rs = null;
    java.sql.PreparedStatement ps = null;
    
private int a;
    
	public void id() {
		
    try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false","root","ad01b926");
    ps = con.prepareStatement("SELECT * FROM comment");
    
    rs = ps.executeQuery();
    rs.afterLast();
   
    while(i!=0) {
    	if(rs.previous()){
    		 a=rs.getInt("id");
    		 i--;
    		}
         }
    }
     
    catch(Exception ex) {
        System.out.print(ex);
        }
    }
	public int getId(){
		id();
		return a;
	}

}