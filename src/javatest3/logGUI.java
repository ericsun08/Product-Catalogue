package javatest3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import static javatest3.Javatest3.loginHistory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class logGUI extends JFrame implements ActionListener {
    public JFrame logframe;
    private Panel p1,p2,p3;
    private Button b1;
    private Label l1;
    private DefaultTableModel z;
    private JTable z1;
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            Javatest3.adminPage1.setVisible(true);
            Javatest3.logHistoryGUI.logframe.setVisible(false);
        }
    }
        public logGUI(){
        logframe = new JFrame();
        logframe.setSize(500,300);
        logframe.setLocation(300,100);
        logframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new Panel();
        int ukuran = Javatest3.loginHistory.size();
        System.out.println(Javatest3.loginHistory);
        
        String [][] log = new String [ukuran][3];
        for(int i=0;i<Javatest3.loginHistory.size();i++){
            LogHistory n = Javatest3.loginHistory.get(i);
            log[i][0]=n.getName();
            log[i][1]=n.getRole();
            log[i][2]=n.getDate();
        }
        String[] columnNames = {"Name", "Role", "Date and Time"};
        
        z = new DefaultTableModel(log,columnNames);
        z1= new JTable(z);
        JScrollPane sc = new JScrollPane(z1);
        p1.add(sc);
        logframe.add(p1);
        p2 = new Panel();
        b1= new Button("Exit");
        b1.addActionListener(this);
        p2.add(b1);
        logframe.add(p2,BorderLayout.SOUTH);
        p3 = new Panel();
        l1 = new Label("Login History",Label.CENTER);
        p3.add(l1);
        logframe.add(p3,BorderLayout.NORTH);
    }
    
    
}
