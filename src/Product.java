import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Product
 */
public class Product extends MenuPanel {

    public String productId;
    public String productGroup;
    public int unitPrice;
    public int disocuntRate;
    public int stockAmount;
    public String nameOfProduct;
    public String brandInfo;
    public double screenSize_Inc = 6.1;// (Inc):double = {6.1}

    public int RAM_GB = 8;// (GB):int = 8
    public int storage_SSDs_GB = 512;// (SSDs):int= 512

    public int RAM_MB = 6;// (MB):int = 6
    public int phoneMemoryInformation;// (GB) :int= {128,64 }
    public int batteryPower = 4000;// :int=4000
    public String color;// :string = {Black, Red, Blue}

    List<Product> productList = new ArrayList<Product>();
    HashMap<String,List<Product>> productMap = new HashMap<>();

    // Product.productMenu();
    Product() {

    }

    Product(String productGroup, int unitPrice, int disocuntRate, int stockAmount, String nameOfProduct,
            String brandInfo, double screenSize_Inc, int RAM_GB, int storage_SSDs_GB, int RAM_MB,
            int phoneMemoryInformation, int batteryPower, String color) {
        super();
        productId = UUID.randomUUID().toString();
        this.productGroup = productGroup;
        this.unitPrice = unitPrice;
        this.disocuntRate = disocuntRate;
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

    public static void createProductID() {
        String productId = UUID.randomUUID().toString();
        createProductHashMap(productId);
        System.out.println("productId : "+productId+"\n\n");
    }

    public static void createProductHashMap(String productId) {
        List<Product> productList = new ArrayList<Product>();
        HashMap<String,List<Product>> productMap = new HashMap<>();
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
 public String getProductGroup() {
        return productGroup;
    }

    public static void ListProductById() {
        System.out.println("ListProductById");
    }

    public static void ListProductByBrand() {
        System.out.println("ListProductByBrand");
    }

 
}
