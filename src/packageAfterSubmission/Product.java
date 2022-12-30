package packageAfterSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Product
 */
public class Product {

    private static String productId;
    private static String productGroup;
    private static String unitPrice;
    private static String discountRate;
    private static String stockAmount;
    private static String nameOfProduct;
    private static String brandInfo;
    private static String screenSize_Inc = "6.1";// (Inc):double = {6.1}

    
    Product(String productGroup, String unitPrice, String disocuntRate, String stockAmount, String nameOfProduct,
    String brandInfo, String screenSize_Inc, String RAM_GB, String storage_SSDs_GB, String RAM_MB,
    String phoneMemoryInformation, String batteryPower, String color) {
        super();
        this.productId = productId;
        this.productGroup = productGroup;
        this.unitPrice = unitPrice;
        this.discountRate = disocuntRate;
        this.stockAmount = stockAmount;
        this.nameOfProduct = nameOfProduct;
        this.brandInfo = brandInfo;
        this.screenSize_Inc = screenSize_Inc;
        
        this.RAM_GB = RAM_GB;
        this.storage_SSDs_GB = storage_SSDs_GB;
        
        this.RAM_MB = RAM_MB;
        this.phoneMemoryInformation = phoneMemoryInformation;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }
    
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }
    
    public String getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(String stockAmount) {
        this.stockAmount = stockAmount;
    }
    
    public String getNameOfProduct() {
        return nameOfProduct;
    }
    
    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
    
    public String getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo;
    }

    public String getScreenSize_Inc() {
        return screenSize_Inc;
    }

    public void setScreenSize_Inc(String screenSize_Inc) {
        this.screenSize_Inc = screenSize_Inc;
    }
    
    public void createProductId() {
        productId = UUID.randomUUID().toString();
    }

    
    
    public static String RAM_GB = "8";// (GB):int = 8
    public static String storage_SSDs_GB = "512";// (SSDs):int= 512
    
    public static String RAM_MB = "6";// (MB):int = 6
    public static String phoneMemoryInformation;// (GB) :int= {128,64 }
    public static String batteryPower = "4000";// :int=4000
    public static String color;// :string = {Black, Red, Blue}

    List<Product> productList = new ArrayList<Product>();
    HashMap<String, List<Product>> productMap = new HashMap<>();
    
    public static void createProductID() {
        String productId = UUID.randomUUID().toString();
        createProductInfoArray(productId);
        System.out.println("productId : " + productId + "\n\n");
    }
    
    public static void createProductInfoArray(String productGroup) {

        if (productGroup=="Notebook"||productGroup==" Notebook"||productGroup=="Notebook "||productGroup==" Notebook "||productGroup=="Note book"||productGroup==" Note book"||productGroup=="Note book "||productGroup==" Note book "||productGroup=="notebook"||productGroup==" notebook"||productGroup=="notebook "||productGroup==" notebook "||productGroup=="note book"||productGroup==" note book"||productGroup=="note book "||productGroup==" note book "){
            String [] productInfoArray = {productId,productGroup,unitPrice,discountRate,stockAmount,nameOfProduct,brandInfo,screenSize_Inc,RAM_GB,storage_SSDs_GB};

        }
    productId = UUID.randomUUID().toString();
}
    public static void createProductHashMap(String productId) {
    }
    
    public static void addProductGroup() {
        System.out.println("addProductGroup");
    }

    public static void addProduct(String productId) {

        System.out.println(productId);

        System.out.println("addProduct");
    }

    public static void deleteProductById() {
        System.out.println("deleteProductById");
    }

    public static void ListProductById() {
        System.out.println("ListProductById");
    }

    public static void ListProductByBrand() {
        System.out.println("ListProductByBrand");
    }

}
