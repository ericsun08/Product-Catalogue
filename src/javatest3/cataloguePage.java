package javatest3;


import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class cataloguePage extends JFrame implements ActionListener,KeyListener {
    public JFrame For;
    private Panel p0,p1,p2,p3,p4,p5;
    private JButton b1,b2,b3,b4,b5;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    private JTextField t1,t2,t3,t4;
    private DefaultTableModel D,d;
    private JComboBox cb,cb1,cb2,cb3,cb4,cb5;
    private JTable T,t;
    boolean created = false;
    
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30"}; 
    private String months[] 
        = { "01", "02", "03", "04", 
            "05", "06", "07", "08", 
            "09", "10", "11", "12" }; 
     private String years[] 
        = { "2019", "2020", "2021", "2022", 
            "2023", "2024", "2025", "2026", 
            "2027", "2028", "2029", "2030"}; 
            
    public cataloguePage(){
        
        For = new JFrame();
        For.setSize(1140,850);
        For.setLocation(300,100);
        For.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Catalogue");
        
        For.setLayout(null);
        
        l1 = new JLabel("Product Details");
        l1.setSize(200,20);
        l1.setLocation(200,30);
        For.add(l1);
        
        l2 = new JLabel("Catalogue Preview");
        l2.setSize(200,20);
        l2.setLocation(800,30);
        For.add(l2);
        
        int c = Javatest3.item.size();
            String [][] Item = new String[c][8];
            for(int i=0;i<Javatest3.item.size();i++){
                Product m = Javatest3.item.get(i);
                Item[i][0]=""+m.getId();
                Item[i][1]=m.getName();
                Item[i][2]=m.getBrand();
                Item[i][3]=""+m.getQuantity();
                Item[i][4]=""+m.getPrice();
                Item[i][5]=m.getDescription();
                Item[i][6]=m.getSupplier();
                Item[i][7]=m.getCategory();
            }
        String[]columnNames = {"ID","Name","Brand","Quantity","Price","Description","Supplier","Category"};
        D = new DefaultTableModel(Item,columnNames);
        T = new JTable(D);
        JScrollPane sc = new JScrollPane(T);
        sc.setSize(500,400);
        sc.setLocation(20,60);
        For.add(sc);
        /*
        int k = Javatest3.cat.size();
            String [][] cat = new String[k][8];
            for(int i=0;i<Javatest3.cat.size();i++){
                Catalogue m = Javatest3.cat.get(i);
                Item[i][0]=""+m.getItemid();
                Item[i][1]=m.getItemname();
                Item[i][2]=m.getItembrand();
                Item[i][3]=""+m.getItemquantity();
                Item[i][4]=""+m.getItemprice();
                Item[i][5]=m.getItemdescription();
                Item[i][6]=m.getItemsupplier();
                Item[i][7]=m.getItemcategory();
            }
        */
        String[]columnName = {"ID","Name","Brand","Quantity","Price","Description","Supplier","Category"};
        d = new DefaultTableModel();
        d.setColumnIdentifiers(columnName);
        t = new JTable(d);
        JScrollPane sc1 = new JScrollPane(t);
        sc1.setSize(500,400);
        sc1.setLocation(600,60);
        For.add(sc1);
        
        l3 = new JLabel("Search:");
        l3.setSize(200,20);
        l3.setLocation(20,480);
        For.add(l3);
        
        t1 = new JTextField();
        t1.setSize(100,30);
        t1.setLocation(20,500);
        t1.addKeyListener(this);
        For.add(t1);
        
        l5 = new JLabel("Catalogue Ref No: ");
        l5.setSize(200,20);
        l5.setLocation(600,480);
        For.add(l5);  
        
        int RefNo;
        int size = Javatest3.Cat.size();
        System.out.println(size);
        if(size==0){
            RefNo=30001;
        } else{
            RefNo = Javatest3.Cat.get(size-1).getCatalogueRefNo()+1;
        }
        
        t2 = new JTextField();
        t2.setSize(100,30);
        t2.setLocation(600,500);
        t2.setText(""+RefNo);
        t2.setEditable(false);
        For.add(t2);
        
        l4 = new JLabel("Catalogue Title:");
        l4.setSize(200,20);
        l4.setLocation(725,480);
        For.add(l4);    
        
        t3 = new JTextField();
        t3.setSize(100,30);
        t3.setLocation(725,500);
        For.add(t3);
        
        l6 = new JLabel("Description:");
        l6.setSize(200,20);
        l6.setLocation(850,480);
        For.add(l6);
        
        t4 = new JTextField();
        t4.setSize(100,30);
        t4.setLocation(850,500);
        For.add(t4);
        
        l7 = new JLabel("Start Date:");
        l7.setSize(200,20);
        l7.setLocation(600,550);
        For.add(l7);
        
        cb = new JComboBox(dates);
        cb.setSize(50,30);
        cb.setLocation(600,570);
        For.add(cb);
        
        cb1 = new JComboBox(months);
        cb1.setSize(50,30);
        cb1.setLocation(655,570);
        For.add(cb1);
        
        cb2 = new JComboBox(years);
        cb2.setSize(70,30);
        cb2.setLocation(710,570);
        For.add(cb2);
        
        l8 = new JLabel("End Date:");
        l8.setSize(200,20);
        l8.setLocation(600, 630);
        For.add(l8);
        
        cb3 = new JComboBox(dates);
        cb3.setSize(50,30);
        cb3.setLocation(600,650);
        For.add(cb3);
        
        cb4 = new JComboBox(months);
        cb4.setSize(50,30);
        cb4.setLocation(655,650);
        For.add(cb4);
        
        cb5 = new JComboBox(years);
        cb5.setSize(70,30);
        cb5.setLocation(710,650);
        For.add(cb5);
        
        b2 = new JButton("Add");
        b2.addActionListener(this);
        b2.setSize(100,30);
        b2.setLocation(600,750);
        For.add(b2);
        
        b3 = new JButton("Create");
        b3.addActionListener(this);
        b3.setSize(100,30);
        b3.setLocation(710,750);
        For.add(b3);
        
        b4 = new JButton("Remove");
        b4.addActionListener(this);
        b4.setSize(100,30);
        b4.setLocation(820,750);
        For.add(b4);
        
        b5 = new JButton("Exit");
        b5.addActionListener(this);
        b5.setSize(100,30);
        b5.setLocation(930,750);
        For.add(b5);
        For.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b2){
            int h = T.getSelectedRow();
            int festid = Integer.parseInt(t2.getText().trim());
            if (h>=0){
                int itid = Integer.parseInt((D.getValueAt(h, 0)).toString());
                String itname= D.getValueAt(h, 1).toString();
                String itbrand= D.getValueAt(h, 2).toString();
                int itquan = Integer.parseInt((D.getValueAt(h, 3)).toString());
                int itprice = Integer.parseInt((D.getValueAt(h, 4)).toString());
                String itdesc= D.getValueAt(h, 5).toString();
                String itsupp= D.getValueAt(h, 6).toString();
                String itcate= D.getValueAt(h, 7).toString();
                
                boolean find = false;
                for(int i=0;i<Javatest3.Cat.size();i++){
                    Catalogue a = Javatest3.Cat.get(i);
                    if((festid==a.getCatalogueRefNo())&&(itname.equals(a.getItemname()))&&(itbrand.equals(a.getItembrand()))){
                        find = true;
                        break;
                    }
                }
                if(find){
                    JOptionPane.showMessageDialog(b1,"Item already exist in catalogue!");
                    return;
                }else{
                    if((t3.getText().trim().equals(""))||(t4.getText().trim().equals(""))){
                        JOptionPane.showMessageDialog(b1, "Please fill all the blank text field first!");
                        return;
                    }else{
                        String enddate;
                        String sdate = (String)cb.getSelectedItem();
                        String smonth = (String)cb1.getSelectedItem();
                        String syear = (String)cb2.getSelectedItem();
                        String startdate = sdate+"/"+smonth+"/"+syear;
                        String edate = (String)cb3.getSelectedItem();
                        String emonth = (String)cb4.getSelectedItem();
                        String eyear = (String)cb5.getSelectedItem();
                        if(Integer.parseInt(eyear)>Integer.parseInt(syear)){
                            enddate = edate+"/"+emonth+"/"+eyear;
                            String festname= t3.getText().trim();
                            String festdesc= t4.getText().trim();
                            String feststart= startdate;
                            String festend= enddate;
                            Catalogue b = new Catalogue(festid,festname,festdesc,feststart,festend,itid,itname,itbrand,itquan,itprice,itdesc,itsupp,itcate);
                            Javatest3.Cat.add(b);
                            DefaultTableModel model = (DefaultTableModel) t.getModel();
                            model.addRow(new Object[]{itid,itname,itbrand,itquan,itprice,itdesc,itsupp,itcate});
                        }else if(Integer.parseInt(eyear)==Integer.parseInt(syear)){
                            if(Integer.parseInt(emonth)>Integer.parseInt(smonth)){
                                enddate = edate+"/"+emonth+"/"+eyear;
                                    String festname= t3.getText().trim();
                                    String festdesc= t4.getText().trim();
                                    String feststart= startdate;
                                    String festend= enddate;
                                    Catalogue b = new Catalogue(festid,festname,festdesc,feststart,festend,itid,itname,itbrand,itquan,itprice,itdesc,itsupp,itcate);
                                    Javatest3.Cat.add(b);
                                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                                    model.addRow(new Object[]{itid,itname,itbrand,itquan,itprice,itdesc,itsupp,itcate});
                            }else if(Integer.parseInt(emonth)==Integer.parseInt(smonth)){
                                if(Integer.parseInt(edate)>Integer.parseInt(sdate)){
                                    enddate = edate+"/"+emonth+"/"+eyear;
                                    String festname= t3.getText().trim();
                                    String festdesc= t4.getText().trim();
                                    String feststart= startdate;
                                    String festend= enddate;
                                    Catalogue b = new Catalogue(festid,festname,festdesc,feststart,festend,itid,itname,itbrand,itquan,itprice,itdesc,itsupp,itcate);
                                    Javatest3.Cat.add(b);
                                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                                    model.addRow(new Object[]{itid,itname,itbrand,itquan,itprice,itdesc,itsupp,itcate});
                                }else{
                                    JOptionPane.showMessageDialog(b1,"End Date is too early");
                                    return;
                                }
                            }else{
                                JOptionPane.showMessageDialog(b1,"End Month is too early");
                                return;
                            }
                        }else{
                            JOptionPane.showMessageDialog(b1,"End Year is too early");
                            return;
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(b1, "Please select item to add!");
                return;
            }
        }else if(ae.getSource()==b3){
            int fesid = Integer.parseInt(t2.getText().trim());
            boolean kol = false;
            for(int i=0;i<Javatest3.Cat.size();i++){
                Catalogue c = Javatest3.Cat.get(i);
                if(created){
                    kol=true;
                    break;
                }
            }
            if(kol){
                JOptionPane.showMessageDialog(b1,"Catalogue already exist!");
            }else{
                try{
                    PrintWriter w1 = new PrintWriter("Catalogue.txt");
                    for(int i=0;i<Javatest3.Cat.size();i++){
                        Catalogue n = Javatest3.Cat.get(i);
                        w1.println(n.getCatalogueRefNo());
                        w1.println(n.getCatalogueTitle());
                        w1.println(n.getCatalogueDesc());
                        w1.println(n.getCataloguestart());
                        w1.println(n.getCatalogueend());
                        w1.println(n.getItemid());
                        w1.println(n.getItemname());
                        w1.println(n.getItembrand());
                        w1.println(n.getItemquantity());
                        w1.println(n.getItemprice());
                        w1.println(n.getItemdescription());
                        w1.println(n.getItemsupplier());
                        w1.println(n.getItemcategory());
                        w1.println();
                    }
                    
                    w1.close();
                    created = true;
                    JOptionPane.showMessageDialog(b1,"Catalogue Successfully created!");
                }catch(Exception e){}
            }
        }else if(ae.getSource()==b4){
            int g = t.getSelectedRow();
            boolean kal = false;
            int iid;
            if(g>=0){
                iid = Integer.parseInt((d.getValueAt(g, 0)).toString());
            }else{
                JOptionPane.showMessageDialog(b1,"Please select a product in the catalogue first!");
                return;
            }
            int i=0;
            for(i=0;i<Javatest3.Cat.size();i++){
                Catalogue j = Javatest3.Cat.get(i);
                if(iid==j.getItemid()){
                    kal = true;
                    Javatest3.Cat.remove(j);
                    break;
                }
            }
            if(kal){
                DefaultTableModel model = (DefaultTableModel) t.getModel();
                model.removeRow(i);
                JOptionPane.showMessageDialog(b1, "Successfully Removed!");
            }
        }else if(ae.getSource()==b5){
            Javatest3.managerPage1.setVisible(true);
            Javatest3.cataloguePage.For.setVisible(false);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent ke) {
        DefaultTableModel table = (DefaultTableModel)T.getModel();
        String search = t1.getText().trim();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        T.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search)); 
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        System.out.println("lolo");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println("lala");
    }
}

