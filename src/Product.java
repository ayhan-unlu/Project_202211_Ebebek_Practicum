import java.util.Scanner;

/**
 * Product
 */
public class Product extends MenuPanel {

    public static int productId = 1;
    public static String productGroup;
    public int unitPrice;
    public int disocuntRate;
    public int stockAmount;
    public String nameOfProduct;
    public String brandInfo;

    // Product.productMenu();
    Product() {

    }

    Product(int productId, String productGroup, int unitPrice, int disocuntRate, int stockAmount, String nameOfProduct,
            String brandInfo) {
        super();
        this.productId = productId + 1;
        this.productGroup = productGroup;
        this.unitPrice = unitPrice;
        this.disocuntRate = disocuntRate;
        this.stockAmount = stockAmount;
        this.nameOfProduct = nameOfProduct;
        this.brandInfo = brandInfo;
    }

    public int getProductId() {
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

    public void setProductId(int productId) {
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
                
        System.out.println(Product.productGroup);

        Scanner scan = new Scanner(System.in);
        productId++;

        System.out.println("product group:");
        
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