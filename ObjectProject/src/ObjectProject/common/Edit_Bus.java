package ObjectProject.common;
import ObjectProject.views.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



public class Edit_Bus {
	
	
    java.sql.Connection con = null;
    ResultSet rs = null;
    java.sql.PreparedStatement ps = null;
	
	private String st1,st4,st5,st6,st7,st8,st9,st10,problem;
	public String st2=Select_Page.Secim1;
	public String st3=Select_Page.Secim2;
	    public ResultSet find(String s) {
	    	
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDatabase?autoReconnect=true&useSSL=false","root","ad01b926");
	    ps = con.prepareStatement("SELECT * FROM bus WHERE id = ?");
	    ps.setString(1, s);
	    rs = ps.executeQuery();}
	    catch(Exception ex) {
	        System.out.print(ex);
	        }
	    return rs;
	    }

	    public String Take(String i) {
	    	String select=i;
	    	Edit_Bus edit = new Edit_Bus();
	        String name = "busname";

	        String sa = "saat";
	        String dk = "dakika";
	        String gn = "gün";
	        String ay = "ay";
	        String yýl = "yl";
	        String price = "price";
	       String id= "id";
	        rs = edit.find(select);
	        try {
	        
	        
	            if(rs.next()) {
	            	st10 = rs.getString("id");
	                st1 = rs.getString("busname");
	                st4 = rs.getString("saat");
	                st5 = rs.getString("dakika");
	                st6 = rs.getString("gün");
	                st7 = rs.getString("ay");
	                st8 = rs.getString("yýl");
	                st9 = rs.getString("price");	                
	                return "Bus Name: " + st1 + " Destination: " + st2 +" to "+st3+ " Time: " + st4 + ":" + st5 + " " + st6 + "." + st7 + "." + st8 + " Price: " + st9;
	                
	            }
	        }catch(Exception ex){
	            System.out.println(ex);
	        }
	        return "Bus Name: " + st1 + " Destination: " + st2 +" to " +st3+ " Time: " + st4 + ":" + st5 + " " + st6 + "." + st7 + "." + st8 + " Price: " + st9;	                
	  
	    }	

	    
	    
	
}
