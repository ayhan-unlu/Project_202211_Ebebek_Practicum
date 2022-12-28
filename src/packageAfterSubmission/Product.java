package packageAfterSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Product
 */
public class Product {
    
        private String productId;
        private String productGroup;
        private int unitPrice;
        private int discountRate;
        private int stockAmount;
        private String nameOfProduct;
        private String brandInfo;
        private double screenSize_Inc = 6.1;// (Inc):double = {6.1}
    
    Product(String productGroup, int unitPrice, int disocuntRate, int stockAmount, String nameOfProduct, String brandInfo, double screenSize_Inc, int RAM_GB, int storage_SSDs_GB, int RAM_MB, int phoneMemoryInformation, int batteryPower, String color) {
        super();
        productId = UUID.randomUUID().toString();
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

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
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

    public double getScreenSize_Inc() {
        return screenSize_Inc;
    }

    public void setScreenSize_Inc(double screenSize_Inc) {
        this.screenSize_Inc = screenSize_Inc;
    }

    public int RAM_GB = 8;// (GB):int = 8
    public int storage_SSDs_GB = 512;// (SSDs):int= 512

    public int RAM_MB = 6;// (MB):int = 6
    public int phoneMemoryInformation;// (GB) :int= {128,64 }
    public int batteryPower = 4000;// :int=4000
    public String color;// :string = {Black, Red, Blue}

    List<Product> productList = new ArrayList<Product>();
    HashMap<String, List<Product>> productMap = new HashMap<>();

    

    public static void createProductID() {
        String productId = UUID.randomUUID().toString();
        createProductHashMap(productId);
        System.out.println("productId : " + productId + "\n\n");
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
