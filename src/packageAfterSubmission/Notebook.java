package packageAfterSubmission;

public class Notebook extends Product{
    private static String RAM_GB = "8";
    private static String storageSSD_GB= "512";
    
    
    public Notebook(String productId, String productGroup, String unitPrice, String discountRate, String stockAmount,
    String nameOfProduct, String brandInfo, String screenSizeInc,String RAM_GB, String storageSSD_GB){
        super(productId, productGroup, unitPrice, discountRate, stockAmount, nameOfProduct, brandInfo, screenSizeInc);
        this.RAM_GB = RAM_GB;
        this.storageSSD_GB = storageSSD_GB;      
    }

    public String getRAM_GB(){
        return this.RAM_GB;
    }

    public void setRAM_GB(String RAM_GB){
        this.RAM_GB=RAM_GB;
    }

    public String getStorageSSD_GB(){
        return this.storageSSD_GB;
    }

    public void setStorageSSD_GB(String storageSSD_GB){
        this.storageSSD_GB=storageSSD_GB;
    }
    
}
