
package javatest3;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import static javatest3.Javatest3.logHistoryGUI;
import static javatest3.Javatest3.loginHistory;
import static javatest3.Javatest3.managerRegis;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class adminPage1 extends JFrame implements ActionListener {
    private Button b3,b4,b5,b6,b7;
    public JFrame logframe;
    private Panel p1,p2,p3;
    private Button b1,b2;
    private Label l1;
    private DefaultTableModel z;
    private JTable z1;
    public adminPage1(){
        setSize(300,200);
        setLocation(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b3 = new Button("Register New Product Manager");
        b5 = new Button("Remove Product Manager");
        b6 = new Button("Activate Product Manager");
        b4 = new Button ("Logout");
        b7 = new Button("Log History");
        setLayout(new FlowLayout());
        b3.addActionListener(this);
        b7.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b4.addActionListener(this);
        add(b3);
        add(b5);
        add(b7);
        add(b6);
        add(b4);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b3){
            managerRegis = new managerRegis();
            Javatest3.managerRegis.F.setVisible(true);
            Javatest3.adminPage1.logframe.setVisible(false);
            /*
            String name = JOptionPane.showInputDialog("Name");
            boolean find = false;
            for(int i=0;i<Javatest3.PmanagerList.size();i++){
                ProductManager a = Javatest3.PmanagerList.get(i);
                if(a.getName().equals(name)){
                    find= true;
                    Javatest3.login1 = a;
                    break;
                }
            }
            if(find){
                JOptionPane.showMessageDialog(b3,"Name Already Registered! Please register with other name");
            }else{
                String pass = JOptionPane.showInputDialog("Pass");
                int id;
                int size = Javatest3.PmanagerList.size();
                if(size==0){
                    id=10001;
                }else{
                    id=Javatest3.PmanagerList.get(size-1).getId()+1;
                }
                String active = "yes";
                ProductManager b = new ProductManager(name,pass,id,active);
                Javatest3.PmanagerList.add(b);
                for(int i=0;i<Javatest3.PmanagerList.size();i++){
                    System.out.println(Javatest3.PmanagerList.get(i));
                }
                
                try{
                    PrintWriter x = new PrintWriter("Pmanager.txt");
                    for(int i=0;i<Javatest3.PmanagerList.size();i++){
                        ProductManager c = Javatest3.PmanagerList.get(i);
                        x.println(c.getName());
                        x.println(c.getPass());
                        x.println(c.getId());
                        x.println(c.getActive());
                        x.println();
                    }
                    x.close();
                }catch(Exception e){}
                Javatest3.adminPage1.setVisible(false);
                Javatest3.loginPage.setVisible(true);
            }
         */
        }else if(ae.getSource()==b5){
            String Name = JOptionPane.showInputDialog("Name");
            boolean find = false;
            for(int i=0;i<Javatest3.PmanagerList.size();i++){
                ProductManager a = Javatest3.PmanagerList.get(i);
                if(a.getName().equals(Name)){
                    find= true;
                    Javatest3.login1 = a;
                    break;
                }
            }
            if(find){
                
                try{
                    PrintWriter m = new PrintWriter("Pmanager.txt");
                    for(int i=0;i<Javatest3.PmanagerList.size();i++){
                        ProductManager c = Javatest3.PmanagerList.get(i);
                        if(Name.equals(c.getName())){
                            Javatest3.login1=c;
                            
                            
                        }else{
                            m.println(c.getName());
                            m.println(c.getPass());
                            m.println(c.getId());
                            m.println(c.getActive());
                            m.println();
                        }
                    }
                    m.close();
                }catch(Exception e){} 
                }
                        
        }else if(ae.getSource()==b6){
            Javatest3.ActivatePmanager.a.setVisible(true);
            Javatest3.adminPage1.setVisible(false);
        }else if(ae.getSource()==b7){
            logHistoryGUI = new logGUI();
//            try{
//                
//            Scanner s = new Scanner(new File("logHistory.txt"));
//                while(s.hasNext()){
//                    String name = s.nextLine();
//                    String role = s.nextLine();
//                    String date = s.nextLine();
//                    s.nextLine();
//                    LogHistory a = new LogHistory(name,role,date);
//                    Javatest3.loginHistory.add(a);
//                }
//            }catch(Exception e){
//                System.out.println("fail");
//            }
            
            Javatest3.logHistoryGUI.logframe.setVisible(true);
            Javatest3.adminPage1.setVisible(false);
            System.out.println("test");
            
        }
        else{
            Javatest3.adminPage1.setVisible(false);
            Javatest3.loginPage.setVisible(true);
        }
    }
    
    
}
