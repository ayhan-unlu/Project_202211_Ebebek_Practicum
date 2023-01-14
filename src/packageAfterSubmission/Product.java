package packageAfterSubmission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * Product
 */
public abstract class Product {

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
        Product.productId = productId;
        Product.productGroup = productGroup;
        Product.unitPrice = unitPrice;
        Product.discountRate = discountRate;
        Product.stockAmount = stockAmount;
        Product.nameOfProduct = nameOfProduct;
        Product.brandInfo = brandInfo;
        Product.screenSizeInc = screenSizeInc;

        /*    
         */}

    public String getProductId() {
        return Product.productId;
    }

    public void setProductId(String productId) {
        Product.productId = productId;
    }

    public String getProductGroup() {
        return Product.productGroup;
    }

    public void setProductGroup(String productGroup) {
        Product.productGroup = productGroup;
    }

    public String getUnitPrice() {
        return Product.unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        Product.unitPrice = unitPrice;
    }

    public String getDiscountRate() {
        return Product.discountRate;
    }

    public void setDiscountRate(String discountRate) {
        Product.discountRate = discountRate;
    }

    public String getStockAmount() {
        return Product.stockAmount;
    }

    public void setStockAmount(String stockAmount) {
        Product.stockAmount = stockAmount;
    }

    public String getNameOfProduct() {
        return Product.nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        Product.nameOfProduct = nameOfProduct;
    }

    public String getBrandInfo() {
        return Product.brandInfo;
    }

    public void setBrandInfo(String brandInfo) {
        Product.brandInfo = brandInfo;
    }

    public String getScreenSizeInc() {
        return Product.screenSizeInc;
    }

    public void setScreenSizeInc(String screenSizeInc) {
        Product.screenSizeInc = screenSizeInc;
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
        String productId = Product.createProductId();
        String productGroup= decideProductGroup();
        System.out.println("productId"+productId+"productGroup"+productGroup);
    }

    public static String decideProductGroup() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Product Group: 1- Mobile Phone 2- Notebook");
        String selection = scan.nextLine();
        scan.close();
        if (selection == "1") {
            return "Mobile Phone";
        } else if (selection == "2") {
            return "Notebook";
        } else {
            return MenuPanel.getInvalidInputMessage();            
        }
    }

    public static String createProductId() {
        String productId = UUID.randomUUID().toString();
        System.out.println("Product Id Created!");

        System.out.println("productId : " + productId + "\n\n");

        return productId;
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
