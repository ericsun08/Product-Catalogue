package javatest3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javatest3.Javatest3.managerRegis;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

public class EditManager extends JFrame implements ActionListener {
    public JFrame F;
    private JLabel l1,l2,l3,l4,l5,l6,l7;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2,b3;
    
    public EditManager(){
        F = new JFrame();
        F.setSize(500,600);
        F.setLocation(300,90);
        F.setDefaultCloseOperation(EXIT_ON_CLOSE);
        F.setTitle("Manager");
        F.setLayout(null);
        
        l1 = new JLabel("Modify Manager Profile");
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
        
        b2 = new JButton("Exit");
        b2.setSize(100,30);
        b2.setLocation(300,450);
        b2.addActionListener(this);
        F.add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            if(ae.getSource()==b1){
            if(t2.getText().trim().equals("")||t3.getText().trim().equals("")||t4.getText().trim().equals("")||t5.getText().trim().equals("")||
                t6.getText().trim().equals("")){
                JOptionPane.showMessageDialog(b1, "Please fill up all the text field!");
                return;
            }
            int ductid = Integer.parseInt(t1.getText());
            Category b = null;
            boolean find = false;
            for(int i=0;i<Javatest3.category.size();i++){
                Category a = Javatest3.category.get(i);
                if(a.getCategoryID()==ductid){
                    find = true;
                    b=a;
                    break;
                }
            }
            if(find){
                b.setCategoryName(t2.getText());
                b.setCategoryDesc(t3.getText());
            }
        } else if(ae.getSource()==b2){
            
        }else{
            managerRegis = new managerRegis();
            Javatest3.managerRegis.F.setVisible(true);
            Javatest3.AddManager.F.setVisible(false);
        }
        
        
    }
}
}

