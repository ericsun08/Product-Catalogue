package javatest3;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MeditQuantity extends JFrame implements ActionListener{
    private JFrame frame;
    private Button b1,b2,b3;
    private Label l1;
    private TextField t1;
    private Panel p1;
    private JTable j1;
    private DefaultTableModel j;
    
    public MeditQuantity(){
        frame = new JFrame();
        frame.setSize(500,300);
        frame.setLocation(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));
        p1 = new Panel();
        j1 = new JTable();
        int size = Javatest3.item.size();
        String[][] data = new String [size][5];
        for(int i=0; i<size; i++){
            System.out.println("test");
            Product c= Javatest3.item.get(i);
            data[i][0]=""+c.getId();
            data[i][1]=c.getName();
            data[i][2]=c.getSupplier();
            data[i][3]=""+c.getPrice();
            data[i][4]=""+c.getQuantity();
        }
        String[] columnNames = {"ID","Name","Supplier","Price","Quantity"};
        j = new DefaultTableModel(data,columnNames);
        j1 = new JTable(j);
        JScrollPane sc = new JScrollPane(j1);
        p1.add(sc);
        frame.add(p1);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
