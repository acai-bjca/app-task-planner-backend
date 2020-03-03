package ieti.model;

public class User{
    private String userId;
    private String name;
    private String email;
    private String pasw;
    //private String paswConfirmation;

    public User(String userId, String name, String email, String pasw){
        this.userId=userId;
        this.name=name;
        this.email=email;
        this.pasw=pasw;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return pasw;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    } 

    public void setName(String name) {
        this.name = name;
    }    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String pasw) {
        this.pasw = pasw;
    }

} 