package javatest3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static javatest3.Javatest3.AddManager;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class managerRegis extends JFrame implements ActionListener, KeyListener {
    public JFrame F;
    private JPanel p1,p2;
    private JButton b1,b2,b3,b4;
    private JLabel l1;
    private JTextField t1;
    private DefaultTableModel D;
    private JTable T;
    
    public managerRegis(){
        F = new JFrame();
        F.setSize(900,500);
        F.setLocation(300,100);
        F.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1 = new JPanel();
        l1 = new JLabel("Search:");
        t1 = new JTextField("                          ");
        p1.add(l1);
        p1.add(t1);
        F.add(p1, BorderLayout.NORTH);
        
        
        int j = Javatest3.manager.size();
        String [][] u = new String[j][6];
        for(int i=0;i<Javatest3.manager.size();i++){
            Manager m = Javatest3.manager.get(i);
            u[i][0]=""+m.getId();
            u[i][1]=m.getName();
            u[i][2]=""+m.getPass();
            u[i][3]=m.getAdress();
            u[i][4]=""+m.getTelephone();
            u[i][5]=m.getEmail();
            
        }
        String[]columnNames = {"ID","Name","Password","Adress","Telephone","Email"};
        D = new DefaultTableModel(u,columnNames);
        T =new JTable(D);
        JScrollPane sc = new JScrollPane(T);
        F.add(sc);
        
        p2 = new JPanel();
        b1 = new JButton("Add");
        b2 = new JButton("Modify");
        b3 = new JButton("Remove");
        b4 = new JButton("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        F.add(p2, BorderLayout.SOUTH);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            AddManager = new AddManager();
            Javatest3.AddManager.F.setVisible(true);
            Javatest3.managerRegis.F.setVisible(false);
        }
    }
    @Override
    public void keyReleased(KeyEvent ke) {
        DefaultTableModel D = (DefaultTableModel)T.getModel();
        String search = t1.getText().trim();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(D);
        T.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search)); 
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }
    
    
}
