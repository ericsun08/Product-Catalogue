package javatest3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javatest3.Javatest3.logHistory;
import static javatest3.Javatest3.adminPage1;

public class Login extends JFrame implements ActionListener{
    public JFrame F;
    private JLabel l1,l2;
    private JTextField t1;
    private JPasswordField p1;
    private JButton b1,b2;
    
    public Login(){
        F = new JFrame();
        F.setSize(320,200);
        F.setLocation(300,90);
        F.setDefaultCloseOperation(EXIT_ON_CLOSE);
        F.setTitle("Admin Login");
        F.setLayout(null);
        
        l1 = new JLabel("Username:");
        l1.setSize(80,50);
        l1.setLocation(20,10);
        F.add(l1);
        
        t1 = new JTextField();
        t1.setSize(155,30);
        t1.setLocation(100,20);
        F.add(t1);
        
        l2 = new JLabel("Password:");
        l2.setSize(80,50);
        l2.setLocation(20,50);
        F.add(l2);
        
        p1 = new JPasswordField();
        p1.setSize(155,30);
        p1.setLocation(100,60);
        p1.setEchoChar('*');
        F.add(p1);
        
        b1 = new JButton("Login");
        b1.setSize(75,30);
        b1.setLocation(100,100);
        b1.addActionListener(this);
        F.add(b1);
        
        b2 = new JButton("Exit");
        b2.setSize(75,30);
        b2.setLocation(180,100);
        b2.addActionListener(this);
        F.add(b2);
        
        F.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            String name = t1.getText();
            boolean find = false;
            for(int i=0;i<Javatest3.adminList.size();i++){
                Admin a = Javatest3.adminList.get(i);
                if(a.getName().equals(name)){
                    find= true;
                    Javatest3.login = a;
                    break;
                }
            }
            if(find){
                String pass = p1.getText();
                
                if(pass.equals(Javatest3.login.getPass())){
                    String Name = Javatest3.login.getName();
                    String role = "Admin";
                    DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    String datetime = date.format(now);
                    LogHistory n = new LogHistory(Name,role,datetime);
                    Javatest3.loginHistory.add(n);
                    Javatest3.loglogin=n;
                    try{
                        PrintWriter m = new PrintWriter("logHistory.txt");
                        for(int i=0;i<Javatest3.loginHistory.size();i++){
                            LogHistory c = Javatest3.loginHistory.get(i);
                                m.println(c.getName());
                                m.println(c.getRole());
                                m.println(c.getDate());
                                m.println();
                            }m.close(); 
                        }catch(Exception e){} 
                    adminPage1 = new adminPage1();
                    Javatest3.adminPage1.setVisible(true);
                    Javatest3.Login.F.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(b1,"Wrong Pin");
                    p1.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(b1,"Wrong Name");
                t1.setText("");
                p1.setText("");
            }
        } else{
            logHistory = new LoginGUI();
            Javatest3.logHistory.setVisible(true);
            Javatest3.Login.F.setVisible(false);
        }
    }
}
