package anujitha;

public class contact {
	
	private String name;
    private String email;
    private String sub;
    private String message;
    
    public contact(String name, String email, String sub, String message) {
        super();
        this.name = name;
        this.email = email;
        this.sub = sub;
        this.message = message;
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }
    
    public String getsub() {
        return sub;
    }

    public String getmessage() {
        return message;
    }
    
}
 
