package javatest3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ActivatePmanager extends JFrame implements ActionListener{
    public JFrame a;
    private Panel p1,p2,p3,p4,p5;
    private Button b1,b2,b3;
    private Label L1;
    private TextField t1;
    private DefaultTableModel z;
    private JTable z1;
    public ActivatePmanager(){
        a = new JFrame();
        a.setSize(500,300);
        a.setLocation(300,100);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setLayout(new GridLayout(2,1));
        p1 = new Panel();
        z1 = new JTable();
        int size = Javatest3.PmanagerList.size();
        String[][] data = new String [size][3];
        for(int i=0; i<size; i++){
            System.out.println("test");
            ProductManager c= Javatest3.PmanagerList.get(i);
            data[i][0]=""+c.getId();
            data[i][1]=c.getName();
            data[i][2]=c.getActive();
        }
        String[] columnNames = {"ID","Name","Active"};
        z = new DefaultTableModel(data,columnNames);
        z1 = new JTable(z);
        JScrollPane sc = new JScrollPane(z1);
        p1.add(sc);
        a.add(p1);
        p2 = new Panel();
        p2.setLayout(new BorderLayout());
        p3 = new Panel();
        p5 = new Panel();
        p3.setLayout(new GridLayout(2,1));
        L1 = new Label("Select ID",Label.CENTER);
        t1 = new TextField(20);
        p3.add(L1);
        p5.add(t1);
        p3.add(p5);
        p2.add(p3, BorderLayout.CENTER);
        p4 = new Panel();
        b1= new Button("Activate");
        b2 = new Button("Disactivate");
        b3 = new Button("Logout");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        p4.add(b1);
        p4.add(b3);
        p4.add(b2);
        p2.add(p4,BorderLayout.SOUTH);
        a.add(p2);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            System.out.println(Javatest3.PmanagerList);
            ProductManager m = null;
            boolean find = false;
            String active = "yes";
            String id=t1.getText();
            int id1 = Integer.parseInt(id);
            int i;
            for(i = 0;i<Javatest3.PmanagerList.size();i++){
                ProductManager v = Javatest3.PmanagerList.get(i);
                if(id1==(v.getId())){
                    find = true;
                    m=v;
                    System.out.println("hula");
                    break;
                }
            }
            if(m.getActive().equals(active)){
                JOptionPane.showMessageDialog(b1,"ID already Active!");
            }else{
                System.out.println("tets");
                if(find){
                    m.setActive(active);
                    DefaultTableModel model = (DefaultTableModel) z1.getModel();
                    model.setValueAt(active, i, 2);
                    try{
                        PrintWriter writeFile = new PrintWriter("Pmanager.txt");
                        for(i=0; i<Javatest3.PmanagerList.size();i++){
                            ProductManager b = Javatest3.PmanagerList.get(i);
                            writeFile.println(b.getName());
                            writeFile.println(b.getPass());
                            writeFile.println(b.getId());
                            writeFile.println(b.getActive());
                            writeFile.println();

                        }
                        writeFile.close();
                    }catch(Exception e){}
                }else {
                    JOptionPane.showMessageDialog(b1,"ID not found!");
                }
            }
        }else if(ae.getSource()==b2){
            ProductManager m = null;
            boolean find = false;
            String active = "no";
            String id=t1.getText();
            int id1 = Integer.parseInt(id);
            int i;
            for(i = 0;i<Javatest3.PmanagerList.size();i++){
                ProductManager v = Javatest3.PmanagerList.get(i);
                if(id1==(v.getId())){
                    find = true;
                    m=v;
                    break;
                }
            }
            if(m.getActive().equals(active)){
                JOptionPane.showMessageDialog(b1,"ID already Active!");
            }else{
                if(find){
                    m.setActive(active);
                    DefaultTableModel model = (DefaultTableModel) z1.getModel();
                    model.setValueAt(active, i, 2);
                    try{
                        PrintWriter writeFile = new PrintWriter("Pmanager.txt");
                        for(i=0; i<Javatest3.PmanagerList.size();i++){
                            ProductManager b = Javatest3.PmanagerList.get(i);
                            writeFile.println(b.getName());
                            writeFile.println(b.getPass());
                            writeFile.println(b.getId());
                            writeFile.println(b.getActive());
                            writeFile.println();

                        }
                        writeFile.close();
                    }catch(Exception e){}
                }else {
                    JOptionPane.showMessageDialog(b1,"ID not found!");
                }
            }
        }else{
            Javatest3.adminPage1.setVisible(true);
            Javatest3.ActivatePmanager.a.setVisible(false);
        }
    }
}
