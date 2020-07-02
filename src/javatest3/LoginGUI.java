package javatest3;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javatest3.Javatest3.Login;
import static javatest3.Javatest3.Login2;

public class LoginGUI extends JFrame implements ActionListener{
    private Button b1,b2,b3;
    private JLabel l1;
    public LoginGUI(){
        
        setSize(300,200);
        setLocation(500,200);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        b1 = new Button("Administrator");
        b2 = new Button("Product Manager");
        b3 = new Button("Register Admin");
        l1 = new JLabel("Login As: ");
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(l1);
        add(b2);
        add(b3);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            Login = new Login();
            Javatest3.Login.F.setVisible(true);
            Javatest3.logHistory.setVisible(false);
        }else if (ae.getSource()==b2){
            Login2 = new Login2();
            Javatest3.Login2.F.setVisible(true);
            Javatest3.logHistory.setVisible(true);
        }
            /*else{
            String name = JOptionPane.showInputDialog("Name");
            String pass = JOptionPane.showInputDialog("Pass");
            int id=10001;
            Admin c = new Admin(id,name,pass);
            Javatest3.adminList.add(c);
            try{
                PrintWriter p = new PrintWriter("Admin.txt");
                for(int i=0;i<Javatest3.adminList.size();i++){
                    Admin d = Javatest3.adminList.get(i);
                    p.println(d.getId());
                    p.println(d.getName());
                    p.println(d.getPass());
                    p.println();
                }
                p.close();
            }catch (Exception e){}
        }*/
    }

}
