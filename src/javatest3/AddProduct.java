package javatest3;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javatest3.Javatest3.managerPage2;



public class AddProduct extends JFrame implements ActionListener {
    public JFrame contl;
    private Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private TextField t1,t2,t3,t4,t5,t6,t7;
    private JComboBox c1,c2;
    private Button b1,b2,b3;
    
    public String category1[]={"chair","fridge","spoon","kasdakl"};
    
    public AddProduct(){
        contl = new JFrame();
        contl.setSize(500,700);
        contl.setLocation(300,90);
        setTitle("Add Product");
        
        contl.setLayout(null);
        
        l1= new Label("Register New Product");
        l1.setFont(new Font("Arial", Font.PLAIN, 30));
        l1.setSize(300,30);
        l1.setLocation(100,30);
        contl.add(l1);

        int id;
        int size = Javatest3.item.size();
        if(size==0){
            id=10001;
        }else{
            id=Javatest3.item.get(size-1).getId()+1;
        }
        
        l2 = new Label("ID");
        l2.setFont(new Font("Arial", Font.PLAIN,20));
        l2.setSize(100,30);
        l2.setLocation(100,100);
        contl.add(l2);
        
        t1 = new TextField();
        t1.setFont(new Font("Arial", Font.BOLD,15));
        t1.setSize(190,30);
        t1.setLocation(200,100);
        t1.setText(""+id);
        t1.setEditable(false);
        contl.add(t1);
        
        
        l3 = new Label("Name");
        l3.setFont(new Font("Arial", Font.PLAIN,20));
        l3.setSize(100,30);
        l3.setLocation(100,150);
        contl.add(l3);
        
        t2 = new TextField();
        t2.setFont(new Font("Arial", Font.PLAIN,15));
        t2.setSize(190,30);
        t2.setLocation(200,150);
        contl.add(t2);
        
        l4 = new Label("Brand");
        l4.setFont(new Font("Arial", Font.PLAIN,20));
        l4.setSize(100,30);
        l4.setLocation(100,200);
        contl.add(l4);
        
        t3 = new TextField();
        t3.setFont(new Font("Arial", Font.PLAIN,15));
        t3.setSize(190,30);
        t3.setLocation(200,200);
        contl.add(t3);
        
        l5 = new Label("Quantity");
        l5.setFont(new Font("Arial", Font.PLAIN,20));
        l5.setSize(100,30);
        l5.setLocation(100,250);
        contl.add(l5);
        
        t4 = new TextField();
        t4.setFont(new Font("Arial", Font.PLAIN,15));
        t4.setSize(190,30);
        t4.setLocation(200,250);
        contl.add(t4);
        
        l6 = new Label("Price");
        l6.setFont(new Font("Arial", Font.PLAIN,20));
        l6.setSize(100,30);
        l6.setLocation(100,300);
        contl.add(l6);
        
        t5 = new TextField();
        t5.setFont(new Font("Arial", Font.PLAIN,15));
        t5.setSize(190,30);
        t5.setLocation(200,300);
        contl.add(t5);
        
        l7 = new Label("Description");
        l7.setFont(new Font("Arial", Font.PLAIN,20));
        l7.setSize(100,30);
        l7.setLocation(100,350);
        contl.add(l7);
        
        t6 = new TextField();
        t6.setFont(new Font("Arial", Font.PLAIN,15));
        t6.setSize(190,60);
        t6.setLocation(200,350);
        contl.add(t6);
        
        l8 = new Label("Category");
        l8.setFont(new Font("Arial", Font.PLAIN,20));
        l8.setSize(100,30);
        l8.setLocation(100,470);
        contl.add(l8);
        
        c1 = new JComboBox(category1);
        c1.setFont(new Font("Arial", Font.PLAIN,15));
        c1.setSize(190,30);
        c1.setLocation(200,470);
        contl.add(c1);
        
        b1= new Button("Add");
        b1.setSize(100,30);
        b1.setLocation(100,600);
        b1.addActionListener(this);
        contl.add(b1);
        
        b2 = new Button("Clear");
        b2.setSize(100,30);
        b2.setLocation(300,600);
        b2.addActionListener(this);
        contl.add(b2);
        
        b3 = new Button("Exit");
        b3.setSize(100,30);
        b3.setLocation(200,600);
        b3.addActionListener(this);
        contl.add(b3);
        
        l9 = new Label("Supplier");
        l9.setFont(new Font("Arial", Font.PLAIN,20));
        l9.setSize(100,30);
        l9.setLocation(100,420);
        contl.add(l9);
        
        t7= new TextField();
        t7.setFont(new Font("Arial", Font.PLAIN,15));
        t7.setSize(100,30);
        t7.setLocation(200,420);
        contl.add(t7);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            System.out.println("ma");
            String name = t2.getText();
            String brand = t3.getText();
            boolean find = false;
            for(int i=0;i<Javatest3.item.size();i++){
                Product b = Javatest3.item.get(i);
                if(b.getName().equals(name)&&b.getBrand().equals(brand)){
                    find = true;
                    break;
                }
            }
            if(find){
                JOptionPane.showMessageDialog(b1,"Product already registered!");
            }else{
                System.out.println("mo");
                int id=Integer.parseInt(t1.getText());
                String quantity = t4.getText();
                String price = t5.getText();
                String desc = t6.getText();
                String supplier = t7.getText();
                String category = (String)c1.getSelectedItem();
                Product c = new Product(id,name,brand,quantity,price,desc,supplier,category);
                Javatest3.item.add(c);
                System.out.println("mi");
                try{
                    PrintWriter x = new PrintWriter("Product.txt");
                    for(int i=0;i<Javatest3.item.size();i++){
                        Product d = Javatest3.item.get(i);
                        x.println(d.getId());
                        x.println(d.getName());
                        x.println(d.getBrand());
                        x.println(d.getQuantity());
                        x.println(d.getPrice());
                        x.println(d.getDescription());
                        x.println(d.getSupplier());
                        x.println(d.getCategory());
                        x.println();
                    }
                    x.close();
                }catch(Exception e){}
            }
        }else if(ae.getSource()==b3){
            managerPage2 = new managerPage2();
            Javatest3.managerPage2.f1.setVisible(true);
            Javatest3.addProduct.contl.setVisible(false);
        }
    }
    
}
