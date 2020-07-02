package javatest3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static javatest3.Javatest3.addProduct;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class managerPage2 extends JFrame implements ActionListener {
    
    public JFrame f1;
    private Panel p1,p2,p3,p4,p5;
    private JTable z1;
    private Label l1;
    private TextField t1;
    private DefaultTableModel z;
    private Button b1,b2,b3,b4,b5;
    public managerPage2(){
        f1 = new JFrame();
        
        Dimension d = getMaximumSize();
        System.out.println(d.height);
        System.out.println(d.width);
        f1.setSize(900,500);
        
        f1.setLocation(300,100);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new Panel();
        int ukur = Javatest3.item.size();
        String [][] barang = new String[ukur][8];
        for(int i=0;i<Javatest3.item.size();i++){
            Product m = Javatest3.item.get(i);
            barang[i][0]=""+m.getId();
            barang[i][1]=m.getName();
            barang[i][2]=m.getBrand();
            barang[i][3]=m.getQuantity();
            barang[i][4]=m.getPrice();
            barang[i][5]=m.getDescription();
            barang[i][6]=m.getSupplier();
            barang[i][7]=m.getCategory();
        }
        String[]columnNames = {"ID","Names","Brand","Quantity","Price","Description","Supplier","Category"};
        z= new DefaultTableModel(barang,columnNames);
        z1=new JTable(z);
        JScrollPane sc = new JScrollPane(z1);
        //p1.add(sc);
        f1.add(sc);
        p2 = new Panel();
        b1 = new Button("Add");
        b2=new Button("Edit");
        b3=new Button("Delete");
        b4=new Button("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        f1.add(p2,BorderLayout.SOUTH);
        p4 = new Panel();
        l1 = new Label("Search:");
        t1 = new TextField();
        t1.setText("search");
        p4.add(l1);
        p4.add(t1);
        f1.add(p4,BorderLayout.NORTH);
        
        
       
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            addProduct = new AddProduct();
            Javatest3.addProduct.contl.setVisible(true);
            Javatest3.managerPage2.f1.setVisible(false);
        }else if(ae.getSource()==b4){
            Javatest3.managerPage2.f1.setVisible(false);
            Javatest3.managerPage1.setVisible(true);
        } 
        
            
    }
   
    
    
    
}

 
    
    
   