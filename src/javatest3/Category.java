package javatest3;
public class Category {
    private int categoryID;
    private String categoryName;
    private String categoryDesc;

    public Category(int categoryID, String categoryName, String categoryDesc) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }
    
    
}
