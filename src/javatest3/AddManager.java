package javatest3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javatest3.Javatest3.managerRegis;
import javax.swing.JOptionPane;

public class AddManager extends JFrame implements ActionListener {
    public JFrame F;
    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2,b3;
    
    public AddManager(){
        F = new JFrame();
        F.setSize(500,600);
        F.setLocation(300,90);
        F.setDefaultCloseOperation(EXIT_ON_CLOSE);
        F.setTitle("Manager");
        F.setLayout(null);
        
        l1 = new JLabel("Register Manager");
        l1.setSize(300,30);
        l1.setLocation(100,30);
        F.add(l1);
        
        int id;
        int size = Javatest3.manager.size();
        if(size==0){
            id=20001;
        } else{
            id=Javatest3.manager.get(size-1).getId()+1;
        }
        
        l2 = new JLabel("ID:");
        l2.setSize(100,30);
        l2.setLocation(100,100);
        F.add(l2);
        
        t1 = new JTextField(""+id);
        t1.setSize(190,30);
        t1.setLocation(200,100);
        t1.setEditable(false);
        F.add(t1);
        
        l3 = new JLabel("Name:");
        l3.setSize(100,30);
        l3.setLocation(100,150);
        F.add(l3);
        
        t2 = new JTextField();
        t2.setSize(190,30);
        t2.setLocation(200,150);
        F.add(t2);
        
        l4 = new JLabel("Password:");
        l4.setSize(100,30);
        l4.setLocation(100,200);
        F.add(l4);
        
        t3 = new JTextField();
        t3.setSize(190,30);
        t3.setLocation(200,200);
        F.add(t3);
        
        l5 = new JLabel("Address:");
        l5.setSize(100,30);
        l5.setLocation(100,250);
        F.add(l5);
        
        t4 = new JTextField();
        t4.setSize(190,30);
        t4.setLocation(200,250);
        F.add(t4);
        
        l6 = new JLabel("Telephone No:");
        l6.setSize(100,30);
        l6.setLocation(100,300);
        F.add(l6);
        
        t5 = new JTextField();
        t5.setSize(190,30);
        t5.setLocation(200,300);
        F.add(t5);
        
        l7 = new JLabel("Email:");
        l7.setSize(100,30);
        l7.setLocation(100,350);
        F.add(l7);
        
        t6 = new JTextField();
        t6.setSize(190,30);
        t6.setLocation(200,350);
        F.add(t6);
        
        b1 = new JButton("Add");
        b1.setSize(100,30);
        b1.setLocation(100,450);
        b1.addActionListener(this);
        F.add(b1);
        
        b2 = new JButton("Add +");
        b2.setSize(100,30);
        b2.setLocation(200,450);
        b2.addActionListener(this);
        F.add(b2);
        
        b3 = new JButton("Exit");
        b3.setSize(100,30);
        b3.setLocation(300,450);
        b3.addActionListener(this);
        F.add(b3);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            int id = Integer.parseInt(t1.getText());
            String name = t2.getText();
            int pass = Integer.parseInt(t3.getText());
            if (pass > 6){
                JOptionPane.showMessageDialog(b1, "Password");
            }
            String address = t4.getText();
            int telephone = Integer.parseInt(t5.getText());
            String email = t6.getText();
            Manager m = new Manager(id,name,pass,address,telephone,email);
            Javatest3.manager.add(m);
            
            try{
                PrintWriter pw = new PrintWriter("Manager.txt");
                for(int i = 0; i<Javatest3.manager.size(); i++){
                    Manager x = Javatest3.manager.get(i);
                    pw.println(x.getId());
                    pw.println(x.getName());
                    pw.println(x.getPass());
                    pw.println(x.getAdress());
                    pw.println(x.getTelephone());
                    pw.println(x.getEmail());
                } pw.close();
            } catch(Exception e){}
            
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
        } else if(ae.getSource()==b2){
            
        }else{
            managerRegis = new managerRegis();
            Javatest3.managerRegis.F.setVisible(true);
            Javatest3.AddManager.F.setVisible(false);
        }
        
        
    }
}
