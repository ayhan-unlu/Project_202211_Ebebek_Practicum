import java.util.Scanner;
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


    // Product.productMenu();
    Product() {

    }

    Product(String productGroup, int unitPrice, int disocuntRate, int stockAmount, String nameOfProduct, String brandInfo, double screenSize_Inc, int RAM_GB, int storage_SSDs_GB, int RAM_MB, int phoneMemoryInformation, int batteryPower, String color) {
        super();
        productId =  UUID.randomUUID().toString();
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

    public String getProductId() {
        return productId;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getDisocuntRate() {
        return disocuntRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getBrandInfo() {
        return brandInfo;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDisocuntRate(int disocuntRate) {
        this.disocuntRate = disocuntRate;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo;
    }

    public static void addProductGroup() {
        System.out.println("addProductGroup");
    }

    public static void addProduct() {
        Scanner scan = new Scanner(System.in);
      //  Product p = new Product();
     /*    productGroup=productGroup;

        System.out.println("product group:");
        productGroup=scan.nextLine();
        System.out.println(productGroup);
        System.out.println(productGroup=="Notebook");


*/
        /* 
                
        System.out.println(Product.productGroup);

        Scanner scan = new Scanner(System.in);
        productId++;


        
        Product.productGroup = scan.nextLine();
        System.out.println(Product.productGroup);


        System.out.println("unitPrice:");
        int unitPrice = scan.nextInt();

        System.out.println("disocuntRate:");
        int disocuntRate = scan.nextInt();

        System.out.println("stockAmount:");
        int stockAmount = scan.nextInt();

        System.out.println("nameOfProduct:");
        String nameOfProduct = scan.nextLine();

        System.out.println("brandInfo");
        String brandInfo = scan.nextLine();
        System.out.println(Product.productGroup == "Notebook");
        if (productGroup == "Notebook") {

            System.out.println("RAM_GB");
            int RAM_GB = scan.nextInt();

            System.out.println("storage_SSDs_GB");
            int storage_SSDs_GB = scan.nextInt();

            System.out.println("screenSize_Inc");
            int screenSize_Inc = scan.nextInt();

        }
*/
        System.out.println("addProduct");
    }

    public static void deleteProductById() {
        System.out.println("deleteProductById");
    }

    /*
     * public static List<Product> ListProductByGroup(String productGroup) {
     * System.out.println("ListProductByGroup");
     * List<Product> result = new ArrayList<>();
     * if (productsByGroup.size()==0){
     * return result;
     * }
     * 
     * for( Product p: productsByGroup.values()){
     * if(p.getProductGroup().equals(productGroup)){
     * result.add(p);
     * }
     * }
     * return result;
     * 
     * }
     */ public String getProductGroup() {
        return productGroup;
    }

    public static void ListProductById() {
        System.out.println("ListProductById");
    }

    public static void ListProductByBrand() {
        System.out.println("ListProductByBrand");
    }

    /*
     * public Map<Integer, Product> productsById = new HashMap();
     * public static Map<String, Product> productsByGroup = new HashMap();
     * public Map<String, Product> productsByBrand = new HashMap();
     */
    /*
     * public void ProductDAO() {
     * Product product1 = new Product("Notebook", 1, 7_000, 5, 5, " Matebook 14",
     * "HUAWEI");
     * Product product2 = new Product("Notebook", 2, 3_699, 10, 5, " V14 IGL",
     * "LENOVO");
     * Product product3 = new Product("Notebook", 3, 8_199, 15, 5, " Tuf Gaming",
     * "ASUS");
     * 
     * Product product4 = new Product("Mobile Phone", 4, 3_199, 10, 5, "GALAXY A51",
     * "SAMSUNG");
     * Product product5 = new Product("Mobile Phone", 5, 7379, 5, 5, "11 64 GB",
     * "IPhone");
     * Product product6 = new Product("Mobile Phone", 6, 4012, 15, 5,
     * " Redmi Note 10 Pro 8 GB", "Xiaomi");
     * 
     * productsById.put(1, product1);
     * productsById.put(2, product2);
     * productsById.put(3, product3);
     * productsById.put(4, product4);
     * productsById.put(5, product5);
     * productsById.put(6, product6);
     * 
     * productsByGroup.put("Notebook", product1);
     * productsByGroup.put("Notebook", product2);
     * productsByGroup.put("Notebook", product3);
     * productsByGroup.put("Mobile Phone", product4);
     * productsByGroup.put("Mobile Phone", product5);
     * productsByGroup.put("Mobile Phone", product6);
     * 
     * productsByBrand.put("HUAWEI", product1);
     * productsByBrand.put("LENOVO", product2);
     * productsByBrand.put("ASUS", product3);
     * productsByBrand.put("SAMSUNG", product1);
     * productsByBrand.put("IPhone", product2);
     * productsByBrand.put("Xiaomi", product3);
     * }
     */
}

/*
 * 
 * 
 * 
 * Product(){
 * boolean isError = true;
 * 
 * while (isError) {
 * try {
 * Scanner scan=new Scanner(System.in);
 * int selection = scan.nextInt();
 * scan.close();
 * switch (selection) {
 * 
 * case 8:
 * break;
 * case 1:
 * addProduct();
 * System.out.println("added Product");
 * break;
 * case 2:
 * addProductGroup();
 * System.out.println("added group");
 * 
 * break;
 * case 3:
 * deleteProductById();
 * System.out.println("deleted product");
 * 
 * break;
 * case 4:
 * listTabularForm();
 * System.out.println("listed product");
 * 
 * break;
 * case 5:
 * selectProductGroup();
 * System.out.println("selected group");
 * 
 * break;
 * case 6:
 * filterProductId();
 * System.out.println("filtered product by ID");
 * 
 * break;
 * case 7:
 * filterProduct();
 * System.out.println("filtered product by Brand");
 * 
 * break;
 * 
 * default:
 * break;
 * }
 * // isError = false;
 * 
 * } catch (Exception e) {
 * System.out.println("\nSorry but You have entered an invalid number.\n");
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 */