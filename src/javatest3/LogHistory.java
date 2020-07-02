package javatest3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class LogHistory {
    private String name;
    private String role;
    private String date;
    DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String datetime = date1.format(now);
    String date2 = datetime;
    
    
    public LogHistory(String name, String role, String date) {
        this.name = name;
        this.role = role;
        this.date = date;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
