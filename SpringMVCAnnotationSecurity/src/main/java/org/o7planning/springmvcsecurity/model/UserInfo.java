package org.o7planning.springmvcsecurity.model;
 
public class UserInfo {
 
    private String userName;
    private String password;
    private String user_role;
     
    public UserInfo()  {
         
    }
 
    public UserInfo(String userName, String password, String user_role) {
        this.userName = userName;
        this.password = password;
        this.user_role = user_role;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUser_role() {
        return user_role;
    }
 
    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
 
}