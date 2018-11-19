package br.edu.ifpb.pratica.DAO.connect;

/**
 *
 * @author fernanda
 */
public class DataBase {
    
    private String url = "jdbc:postgresql://127.0.0.1:5432/database";
    private String user = "user";
    private String  password = "pass";
    private String classForName = "org.postgresql.Driver";

    public DataBase() {
    }

    
    public DataBase(String url, String user, String password, String classForName) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.classForName = classForName;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassForName() {
        return classForName;
    }

    public void setClassForName(String classForName) {
        this.classForName = classForName;
    }
    
    
    
}
