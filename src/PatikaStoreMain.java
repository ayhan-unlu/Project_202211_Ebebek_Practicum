public class PatikaStoreMain {
    public PatikaStoreMain() {
    }

    public static void main(String[] args) {
        PatikaStoreMain patikaStoreMain = new PatikaStoreMain();
        MenuPanel menuPanel = new MenuPanel();
        MenuPanel.mainMenu();


        System.out.println("welcome");
/*         Notebook notebook1 = new Notebook( 1, "Notebook",7000, 5, 5, "HUAWEI Matebook 14", "HUAWEI", 16, 512, 14);
        Notebook notebook2 = new Notebook(2, "Notebook", 3699, 5, 5, "LENOVO V14 IGL", "LENOVO", 8, 1024, 8);

        Notebook notebook3 = new Notebook(3, "Notebook", 8199, 5, 5, "ASUS Tuf Gaming", "ASUS", 32, 2048, 15);

        MobilePhone mobilePhone1 = new MobilePhone(4, "MobilePhone", 3199, 5, 5, "SAMSUNG GALAXY A51", "SAMSUNG", 6,
                128, 6, 4000, "Black");

        MobilePhone mobilePhone2 = new MobilePhone(5, "MobilePhone", 3199, 5, 5, "iPhone 11 64 GB", "Apple", 6, 128, 6,
                4000, "Black");

        MobilePhone mobilePhone3 = new MobilePhone(6, "MobilePhone", 3199, 5, 5, "Redmi Note 10 Pro 8GB", "Xiaomi", 6,
                128, 6, 4000, "Black");

         List<Product> productList = new ArrayList<Product>();
        productList.add(notebook1);
        productList.add(notebook2);
        productList.add(notebook3);
        productList.add(mobilePhone1);
        productList.add(mobilePhone2);
        productList.add(mobilePhone3);

        Map<String, List<Product>> productListGroupedbyProductGroup = productList.stream()
                .collect(Collectors.groupingBy(w -> w.productGroup));
        Map<String, List<Product>> productListGroupedbyBrand = productList.stream()
                .collect(Collectors.groupingBy(w -> w.brandInfo));

        System.out.println(productListGroupedbyProductGroup.keySet());
        System.out.println(productListGroupedbyProductGroup.keySet());
        System.out.println(productListGroupedbyBrand.keySet());
        System.out.println(productListGroupedbyBrand.keySet());
*/
    }
}