package javatest3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static javatest3.Javatest3.addCategory;

public class CategoryPage extends JFrame implements ActionListener {
    public JFrame Fr;
    private JTable T;
    private JTextField TF;
    private JLabel l1;
    private JPanel p0,p1,p2,p3,p4,p5;
    private JButton b1,b2,b3,b4,b5;
    private DefaultTableModel D;
    public  CategoryPage(){
        Fr = new JFrame();
        
        Dimension d = getMaximumSize();
        System.out.println(d.height);
        System.out.println(d.width);
        Fr.setSize(800,400);
        Fr.setLocation(500,300);
        Fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p0 = new JPanel();
        p1 = new JPanel();
        l1 = new JLabel("Category Page");
        p0.add(l1);
        Fr.add(p0, BorderLayout.NORTH);
        int c = Javatest3.category.size();
        String[][] category = new String[c][3];
        for(int i=0; i<Javatest3.category.size(); i++){
            Category x =Javatest3.category.get(i);
            category[i][0]=""+x.getCategoryID();
            category[i][1]=x.getCategoryName();
            category[i][2]=x.getCategoryDesc();
        }
        String[]columnNames = {"ID","Name","Description"};
        D = new DefaultTableModel(category, columnNames);
        T = new JTable(D);
        JScrollPane sc = new JScrollPane(T);
        p1.add(sc);
        Fr.add(p1);
        p2 = new JPanel();
        b1 = new JButton("Add");
        b2 = new JButton("Modify");
        b3 = new JButton("Remove");
        b4 = new JButton("Search");
        b5 = new JButton("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        Fr.add(p2,BorderLayout.SOUTH);
        p3 = new JPanel();
        
}
    
       
            
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            addCategory = new addCategory();
            Javatest3.addCategory.F.setVisible(true);
        } else if(ae.getSource()==b2){
            
        } else if(ae.getSource()==b3){
            
        } else if(ae.getSource()==b4){
            
        } else{
            
        }
    }
    
}

