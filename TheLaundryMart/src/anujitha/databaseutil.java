package anujitha;

import java.util.List;
//import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;


public class databaseutil {
	
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet rs = null;
	
    
    public static List <Admin> validate (String userName, String passWord){
        
        ArrayList <Admin> cus = new ArrayList<>();
    
    //validate
    try {
        Class.forName("com.mysql.jdbc.Driver");
           	
    	con = DBConnect.getConnection();
    	stat = con.createStatement();
    	String sql = "select * from admindetails where username = '"+userName+"' and  password = '"+passWord+"'";
    	rs = stat.executeQuery(sql);
        
        if (rs.next()) {
            String userA = rs.getString(1);
            String passwordA = rs.getString(2);

        Admin a = new Admin (userA, passwordA);
        cus.add(a);
        }
    }
    
    catch(Exception e) {
        e.printStackTrace();
    }
    
    return cus;
    }

    //insert function
    
    public static boolean insertResponses(String name, String email, String sub, String message) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DBConnect.getConnection();
        	stat = con.createStatement();
        	String sql = "insert into contact_responses values ('"+name+"', '"+email+"', '"+sub+"', '"+message+"')";
        	int rs = stat.executeUpdate(sql);
        

        	if(rs > 0) {
        	isSuccess = true;
        	}
        	else {
        	isSuccess = false;
        	}
        	}
        	catch(Exception e) {
        	e.printStackTrace();
        	}

        	return isSuccess;
    	}
    
    //retrieve 
    
    /*public static List<contact> getCustomercontact(String name, String email, String sub, String message){
    	
    	ArrayList<contact> cus = new ArrayList<>();
    	
    	try {
    		
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DBConnect.getConnection();
        	stat = con.createStatement();
        	String sql = "select Name, Email, Subject, Message from contact_responses where email = '"+email+"'";
    		rs = stat.executeQuery(sql);
    		
    		while (rs.next()) {
    			String nameR = rs.getString(1);
    			String emailR = rs.getString(2);
    			String subjectR = rs.getString(3);
    			String messageR = rs.getString(4);
    			
    			contact c = new contact(nameR,emailR,subjectR,messageR);
    			
    			cus.add(c);
    		}
    	}
    		
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    	
    return cus;
    }*/
    

    //Update function
    
    
    public static boolean updateContact(String name, String email, String sub, String message) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stat = con.createStatement();
    		String sql = "update contact_responses set Name='"+name+"', Email='"+email+"',Subject='"+sub+"',Message='"+message+"'" + "where Email='"+email+"'";
    		int rs = stat.executeUpdate(sql);
    	
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    	}
    	
    		catch(Exception e) {
    			e.printStackTrace();
    	}
    	
    	return isSuccess;
    	}
    
    
    public static List<contact> getContactDetails(String email){
        
        ArrayList<contact> lev = new ArrayList<>();
        
        try {
            
            con = DBConnect.getConnection();
            stat= con.createStatement();
            String sql = "select* from contact_responses where Email='"+email+"'";
            rs = stat.executeQuery(sql);
            
            while (rs.next()) {
            	String nameR = rs.getString(1);
    			String emailR = rs.getString(2);
    			String subjectR = rs.getString(3);
    			String messageR = rs.getString(4);
                
                
    			contact e = new contact (nameR, emailR, subjectR, messageR);
    			
                lev.add(e);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return lev;
    }
    
    //Retrieve
    
    public static List<contact> getConDetails(){
    	
    	List <contact> details = new ArrayList<contact>();
    	
    	try {
    		con = DBConnect.getConnection();
    		stat = con.createStatement();
    		String sql = "select * from contact_responses";
    		rs = stat.executeQuery(sql);
    	
    		while (rs.next()) {
    			String nameD = rs.getString(1);
    			String emailD = rs.getString(2);
    			String subjectD = rs.getString(3);
    			String messageD = rs.getString(4);
    			
    			contact c1 = new contact(nameD, emailD, subjectD, messageD);
    			
    			details.add(c1);
    		}
    	}
    		catch(Exception e) {
    			e.printStackTrace();
    	}
    	
    	
    	return details;
    }
    
    
    //Delete
    
    public static boolean deleteContact(String email) {
    	
    	boolean isSuccess = false;
    	
    	try	{
    		
    	con = DBConnect.getConnection();
    	stat= con.createStatement();
    	String sql = "delete from contact_responses where Email='"+email+"'";
    	int rs = stat.executeUpdate(sql);
    	
    	if(rs > 0) {
    	isSuccess = true;
    	}
    	
    	else {
    	isSuccess = false;
    	}
    	
    }
    	catch(Exception e) {
    	e.printStackTrace();
    }
    	return isSuccess;
    	}
    
}
