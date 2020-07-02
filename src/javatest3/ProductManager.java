package javatest3;

import java.util.ArrayList;

public class ProductManager {
    private String name;
    private String pass;
    private int id;
    private String active;

    public ProductManager(String name, String pass, int id, String active) {
        this.name = name;
        this.pass = pass;
        this.id = id;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }


}
