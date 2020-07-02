package javatest3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javatest3.Javatest3.managerPage2;
import static javatest3.Javatest3.categoryPage;
import static javatest3.Javatest3.cataloguePage;

public class managerPage1 extends JFrame implements ActionListener {
    private Button b1,b2,b3,b4,b5,b6;
    public managerPage1(){
        setSize(300,200);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1= new Button("Edit Profile");
        b2= new Button("Edit Product");
        b3= new Button("Logout");
        b4= new Button("View Product");
        b5=new Button ("Category");
        b6= new Button("Catalogue");
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        add(b1);
        add(b2);
        add(b5);
        add(b6);
        add(b4);
        add(b3);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            System.out.println("lala");
        }else if (ae.getSource()==b2){
            managerPage2 = new managerPage2();
            Javatest3.managerPage2.f1.setVisible(true);
            Javatest3.managerPage1.setVisible(false);  
        }else if(ae.getSource()==b5){
            categoryPage = new CategoryPage();
            Javatest3.categoryPage.Fr.setVisible(true);
            Javatest3.managerPage1.setVisible(false);
        } else if(ae.getSource()==b6){
            cataloguePage = new cataloguePage();
            Javatest3.cataloguePage.For.setVisible(true);
            Javatest3.managerPage1.setVisible(false);
        } else if(ae.getSource()==b3){
            Javatest3.loginPage.setVisible(true);
            Javatest3.managerPage1.setVisible(false);
        }
            
    }
}
