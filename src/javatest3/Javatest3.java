package javatest3;

import java.io.File;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

public class Javatest3 {
    public static ArrayList<Admin> adminList;
    public static ArrayList<ProductManager> PmanagerList;
    public static ArrayList<Product> item;
    public static ArrayList<LogHistory> loginHistory;
    public static ArrayList<ProductManager>PmanagerList1;
    public static ArrayList<Category>category;
    public static ArrayList<Catalogue>Cat;
    public static ArrayList<Manager> manager;
    public static LoginGUI logHistory;
    public static logGUI logHistoryGUI;
    public static logGUI logHistoryGUI2;
    public static managerPage2 managerPage2;
    public static Admin login;
    public static LogHistory loglogin;
    public static LogHistory managerlogin;
    public static ActivatePmanager ActivatePmanager;
    public static ProductManager login1; 
    public static LoginGUI loginPage;
    public static adminPage1 adminPage1;
    public static managerPage1 managerPage1;
    public static AddProduct addProduct;
    public static CategoryPage categoryPage;
    public static addCategory addCategory;
    public static cataloguePage cataloguePage;
    public static managerRegis managerRegis;
    public static AddManager AddManager;
    public static Login Login;
    public static Login2 Login2;
    
    public static void main(String[] args) {
        logHistory = new LoginGUI();
        adminPage1= new adminPage1();
        
        
        
        adminList = new ArrayList<Admin>();
        try{
            Scanner scanFile = new Scanner(new File("Admin.txt"));
            while(scanFile.hasNext()){
                int id = parseInt(scanFile.nextLine());
                String name = scanFile.nextLine();
                String pass = scanFile.nextLine();
                scanFile.nextLine();
                Admin a = new Admin(id,name,pass);
                adminList.add(a);
                System.out.println("Scan File success");
            }
        }catch (Exception e){
            System.out.println("Catch");
        }
        
        PmanagerList = new ArrayList<ProductManager>();
        try{
            Scanner scanFile = new Scanner(new File("Pmanager.txt"));
            while(scanFile.hasNext()){
                String name = scanFile.nextLine();
                String pass = scanFile.nextLine();
                int id = parseInt(scanFile.nextLine());
                String active = scanFile.nextLine();
                scanFile.nextLine();
                ProductManager b = new ProductManager(name,pass,id,active);
                PmanagerList.add(b);
                System.out.println(PmanagerList);
            }
        }catch (Exception e){
            System.out.println("Catch");
        }
        
        ActivatePmanager = new ActivatePmanager();
        managerPage1= new managerPage1();
        
        item = new ArrayList<Product>();
        try{
            Scanner scanFile = new Scanner(new File("Product.txt"));
            while(scanFile.hasNext()){
                int id = parseInt(scanFile.nextLine());
                String name = scanFile.nextLine();
                String brand = scanFile.nextLine();
                String quantity = scanFile.nextLine();
                String price = scanFile.nextLine();
                String desc = scanFile.nextLine();
                String supplier = scanFile.nextLine();
                String category = scanFile.nextLine();
                scanFile.nextLine();
                /*
                ProductManager manager = null;
                for(int i=0;i<PmanagerList.size();i++){
                    ProductManager b = PmanagerList.get(i);
                    if(name.equals(b.getName())){
                        manager = b;
                        break;
                    }
                }*/
                Product b = new Product(id,name,brand,quantity,price,desc,supplier,category);
                item.add(b);
            }
        }catch (Exception e){
        System.out.println("juan");
        }
        
        
        
        loginHistory = new ArrayList<LogHistory>();
        try{
            Scanner s = new Scanner(new File("logHistory.txt"));
            while(s.hasNext()){
                String name = s.nextLine();
                String role = s.nextLine();
                String date = s.nextLine();
                s.nextLine();
                LogHistory a = new LogHistory(name,role,date);
                loginHistory.add(a);
            }
        }catch(Exception e){
        System.out.println("fail");
        }
        
        category = new ArrayList<Category>();
        try{
            Scanner sc = new Scanner(new File("Category.txt"));
            while(sc.hasNext()){
                int ID = parseInt(sc.nextLine());
                String name = sc.nextLine();
                String Desc = sc.nextLine();
                Category c = new Category(ID,name,Desc);
                category.add(c);
            }
        }  catch (Exception d){}
        
        Cat = new ArrayList<Catalogue>();
        try{
            Scanner sc1 = new Scanner(new File("Catalogue.txt"));
            while(sc1.hasNext()){
                int RefNo = parseInt(sc1.nextLine());
                String Title = sc1.nextLine();
                String Desc = sc1.nextLine();
                String Start = sc1.nextLine();
                String End = sc1.nextLine();
                int itemid = parseInt(sc1.nextLine());
                String name = sc1.nextLine();
                String brand = sc1.nextLine();
                int qty = parseInt(sc1.nextLine());
                int price = parseInt(sc1.nextLine());
                String desc = sc1.nextLine();
                String category = sc1.nextLine();
                String supplier = sc1.nextLine();
                Catalogue c1 = new Catalogue(RefNo, Title, Desc, Start, End, itemid, name, brand, qty, price,desc, category, supplier);
                Cat.add(c1);
            }
        } catch(Exception b){}
        
        manager = new ArrayList<Manager>();
        try{
            Scanner sc2 = new Scanner(new File("Manager.txt"));
            while(sc2.hasNext()){
                int id = parseInt(sc2.nextLine());
                String name = sc2.nextLine();
                int pass = parseInt(sc2.nextLine());
                String addres = sc2.nextLine();
                int telephone = parseInt(sc2.nextLine());
                String email = sc2.nextLine();
                Manager m = new Manager(id,name,pass,addres,telephone,email);
                manager.add(m);
            }
            
        } catch (Exception m){}
    }
        
}
    

