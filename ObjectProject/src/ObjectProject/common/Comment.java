package ObjectProject.common;

import java.sql.DriverManager;
import java.sql.ResultSet;

import ObjectProject.views.Select_Page;

public class Comment {

    java.sql.Connection con = null;
    ResultSet rs = null;
    java.sql.PreparedStatement ps = null;
	
	private String st1,st2,st3;
	    public ResultSet find(String s) {
	    	
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false","root","ad01b926");
	    ps = con.prepareStatement("SELECT * FROM comment WHERE id = ?");
	    ps.setString(1, s);
	    rs = ps.executeQuery();}
	    catch(Exception ex) {
	        System.out.print(ex);
	        }
	    return rs;
	    }

	    public String Take(String i) {
	    	String select=i;
	    	Comment edit = new Comment();
	        String rate = "rate";
	        String starres = "starres";
	        String commentar = "commentar";
	        rs = edit.find(select);
	        
	        try {
	        
	        
	            if(rs.next()) {
	                st1 = rs.getString("rate");  
	                st2 = rs.getString("starres");  
	                st3 = rs.getString("commentar");  
	                return "Comment: "  + st1 + " Star: " + st2 + " Star Reason: " + st3;
	                
	            }
	        }catch(Exception ex){
	            System.out.println(ex);
	        }
	        return "Comment: "  + st1 + " Star: " + st2 + " Star Reason: " + st3;	                
	  
	    }	
}
