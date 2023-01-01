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
    private static String screenSizeInc = "6.1";

    Product(String productId, String productGroup, String unitPrice, String discountRate, String stockAmount,
            String nameOfProduct,
            String brandInfo, String screenSizeInc) {
        this.productId = productId;
        this.productGroup = productGroup;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.nameOfProduct = nameOfProduct;
        this.brandInfo = brandInfo;
        this.screenSizeInc = screenSizeInc;

        /*    
         */}

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductGroup() {
        return this.productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getStockAmount() {
        return this.stockAmount;
    }

    public void setStockAmount(String stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getNameOfProduct() {
        return this.nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getBrandInfo() {
        return this.brandInfo;
    }

    public void setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo;
    }

    public String getScreenSizeInc() {
        return this.screenSizeInc;
    }

    public void setScreenSizeInc(String screenSizeInc) {
        this.screenSizeInc = screenSizeInc;
    }

    public static String RAM_GB;// (GB):int = 8
    public static String storage_SSDs_GB = "512";// (SSDs):int= 512

    public static String RAM_MB;// (MB):int = 6
    public static String phoneMemoryInformation;
    public static String batteryPower;// :int=4000
    public static String color;

    List<Product> productList = new ArrayList<Product>();
    HashMap<String, List<Product>> productMap = new HashMap<>();

    public static void createProduct() {
        createProductId();
    }

    public static void createProductId() {
        String productId = UUID.randomUUID().toString();
        createProductInfoArray(productId);
        System.out.println("Product Id Created!");

        System.out.println("productId : " + productId + "\n\n");
    }

    public static void createProductInfoArray(String productGroup) {

        if (productGroup == "Notebook" || productGroup == " Notebook" || productGroup == "Notebook "
                || productGroup == " Notebook " || productGroup == "Note book" || productGroup == " Note book"
                || productGroup == "Note book " || productGroup == " Note book " || productGroup == "notebook"
                || productGroup == " notebook" || productGroup == "notebook " || productGroup == " notebook "
                || productGroup == "note book" || productGroup == " note book" || productGroup == "note book "
                || productGroup == " note book ") {
            String[] productInfoArray = { productId, productGroup, unitPrice, discountRate, stockAmount, nameOfProduct,
                    brandInfo, screenSizeInc, RAM_GB, storage_SSDs_GB };

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
        System.out.println("ListProductByBrand5");
    }

}
