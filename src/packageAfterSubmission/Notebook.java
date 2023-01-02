package packageAfterSubmission;

public class Notebook extends Product {
    private static String RAM_GB = "8";
    private static String storageSSD_GB = "512";

    public Notebook(String productId, String productGroup, String unitPrice, String discountRate, String stockAmount,
            String nameOfProduct, String brandInfo, String screenSizeInc, String RAM_GB, String storageSSD_GB) {
        super(productId, productGroup, unitPrice, discountRate, stockAmount, nameOfProduct, brandInfo, screenSizeInc);
        Notebook.RAM_GB = RAM_GB;
        Notebook.storageSSD_GB = storageSSD_GB;
    }

    public String getRAM_GB() {
        return Notebook.RAM_GB;
    }

    public void setRAM_GB(String RAM_GB) {
        Notebook.RAM_GB = RAM_GB;
    }

    public String getStorageSSD_GB() {
        return Notebook.storageSSD_GB;
    }

    public void setStorageSSD_GB(String storageSSD_GB) {
        Notebook.storageSSD_GB = storageSSD_GB;
    }

    public static void createNotebook(String productId,String productGroup){

        Notebook notebook1 = new Notebook( "productId", "productGroup", "unitPrice", "discountRate", "stockAmount",
        "nameOfProduct", "brandInfo", "screenSizeInc", "RAM_GB", "storageSSD_GB");

    }

}
