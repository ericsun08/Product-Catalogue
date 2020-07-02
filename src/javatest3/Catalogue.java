package javatest3;
public class Catalogue {
    private int catalogueRefNo;
    private String catalogueTitle;
    private String catalogueDesc;
    private String cataloguestart;
    private String catalogueend;
    private int itemid;
    private String itemname;
    private String itembrand;
    private int itemquantity;
    private int itemprice;
    private String itemdescription;
    private String itemcategory;
    private String itemsupplier;

    public Catalogue(int catalogueRefNo, String catalogueTitle, String catalogueDesc,String cataloguestart,String catalogueend, int itemid, String itemname, String itembrand, int itemquantity, int itemprice, String itemdescription, String itemsupplier,String itemcategory) {
        this.catalogueRefNo = catalogueRefNo;
        this.catalogueTitle = catalogueTitle;
        this.catalogueDesc = catalogueDesc;
        this.cataloguestart = cataloguestart;
        this.catalogueend = catalogueend;
        this.itemid = itemid;
        this.itemname = itemname;
        this.itembrand = itembrand;
        this.itemquantity = itemquantity;
        this.itemprice = itemprice;
        this.itemdescription = itemdescription;
        this.itemsupplier = itemsupplier;
        this.itemcategory = itemcategory;
    }

    public int getCatalogueRefNo() {
        return catalogueRefNo;
    }

    public void setCatalogueRefNo(int catalogueRefNo) {
        this.catalogueRefNo = catalogueRefNo;
    }

    public String getCatalogueTitle() {
        return catalogueTitle;
    }

    public void setCatalogueTitle(String catalogueTitle) {
        this.catalogueTitle = catalogueTitle;
    }

    public String getCatalogueDesc() {
        return catalogueDesc;
    }

    public void setCatalogueDesc(String catalogueDesc) {
        this.catalogueDesc = catalogueDesc;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItembrand() {
        return itembrand;
    }

    public void setItembrand(String itembrand) {
        this.itembrand = itembrand;
    }

    public int getItemquantity() {
        return itemquantity;
    }

    public void setItemquantity(int itemquantity) {
        this.itemquantity = itemquantity;
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public String getItemcategory() {
        return itemcategory;
    }

    public void setItemcategory(String itemcategory) {
        this.itemcategory = itemcategory;
    }

    public String getItemsupplier() {
        return itemsupplier;
    }

    public void setItemsupplier(String itemsupplier) {
        this.itemsupplier = itemsupplier;
    }

    public String getCataloguestart() {
        return cataloguestart;
    }

    public void setCataloguestart(String cataloguestart) {
        this.cataloguestart = cataloguestart;
    }

    public String getCatalogueend() {
        return catalogueend;
    }

    public void setCatalogueend(String catalogueend) {
        this.catalogueend = catalogueend;
    }

    
    
}
   