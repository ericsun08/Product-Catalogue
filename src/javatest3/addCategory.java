package javatest3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javatest3.Javatest3.categoryPage;

public class addCategory extends JFrame implements ActionListener {
    public JFrame F;
    private JLabel l1,l2,l3,l4;
    private JPanel p1,p2,p3,p4,p5;
    private JTextField t1,t2,t3,t4;
    private JButton b1,b2;
    
    public addCategory(){
        int id;
        int size = Javatest3.category.size();
        if(size==0){
            id=40001;
        } else{
            id=Javatest3.category.get(size-1).getCategoryID()+1;
        }
        
        F = new JFrame();
        //Dimension D = getMaximumSize();
        F.setSize(500,400);
        F.setLocation(300,100);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        F.setLayout(null);
        
        //p1 = new JPanel();
        l1 = new JLabel("Register New Category");
        l1.setFont(new Font("Arial", Font.PLAIN, 18));
        l1.setSize(100,30);
        l1.setLocation(100,30);
        //p1.add(l1);
        F.add(l1);
        
        //p2 = new JPanel();
        l2 = new JLabel("ID:");
        l2.setFont(new Font("Arial", Font.PLAIN,18));
        l2.setSize(100,30);
        l2.setLocation(100,100);
        t1 = new JTextField();
        t1.setFont(new Font("Arial", Font.BOLD,15));
        t1.setSize(190,30);
        t1.setLocation(250,100);
        t1.setText(""+id);
        t1.setEditable(false);
        //p2.add(l2);
        //p2.add(t1);
        F.add(l2);
        F.add(t1);
        
        //p3 = new JPanel();
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Arial", Font.PLAIN,18));
        l3.setSize(100,30);
        l3.setLocation(100,150);
        t2 = new JTextField();
        t2.setFont(new Font("Arial", Font.BOLD,15));
        t2.setSize(190,30);
        t2.setLocation(250,150);
        //p3.add(l3);
        //p3.add(t2);
        F.add(l3);
        F.add(t2);
        
        //p4 = new JPanel();
        l4 = new JLabel("Description: ");
        l4.setFont(new Font("Arial", Font.PLAIN,18));
        l4.setSize(100,30);
        l4.setLocation(100,200);
        t3 = new JTextField();
        t3.setFont(new Font("Arial", Font.BOLD,15));
        t3.setSize(190,30);
        t3.setLocation(250,200);
        //p4.add(l4);
        //p4.add(t3);
        F.add(l4);
        F.add(t3);
        
        //p5 = new JPanel();
        b1 = new JButton("Add");
        b2 = new JButton("Exit");
        b1.setSize(100,30);
        b1.setLocation(100,300);
        b2.setSize(100,30);
        b2.setLocation(300,300);
        b1.addActionListener(this);
        b2.addActionListener(this);
        //p5.add(b1);
        //p5.add(b2);
        F.add(b1);
        F.add(b2);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            String name = t2.getText();
            String Description = t3.getText();
            boolean find = false;
            for(int i=0;i<Javatest3.category.size();i++){
                Category c = Javatest3.category.get(i);
                if(c.getCategoryName().equals(name)){
                    find = true;
                    break;
                }
            }
            t2.setText("");
            t3.setText("");
            if(find){
                JOptionPane.showMessageDialog(b1,"Category Exist");
            } else{
                int id = Integer.parseInt(t1.getText());
                Category c1 = new Category(id,name, Description);
                Javatest3.category.add(c1);
                try{
                    PrintWriter x = new PrintWriter("Category.txt");
                    for(int i=0;i<Javatest3.category.size();i++){
                        Category c2 = Javatest3.category.get(i);
                        x.println(c2.getCategoryID());
                        x.println(c2.getCategoryName());
                        x.println(c2.getCategoryDesc());
                        x.println();
                    }
                    x.close();
                } catch(Exception d){}
            }
        } else{
            categoryPage = new CategoryPage();
            Javatest3.categoryPage.Fr.setVisible(true);
            Javatest3.addCategory.F.setVisible(false);
        }
    }
    
}
