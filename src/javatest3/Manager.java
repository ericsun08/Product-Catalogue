package javatest3;
public class Manager {
    private int id;
    private String name;
    private int pass;
    private String adress;
    private int telephone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Manager(int id, String name, int pass, String adress, int telephone, String email) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.adress = adress;
        this.telephone = telephone;
        this.email = email;
    }
    
    
    
}
