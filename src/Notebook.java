
public class Notebook {/* 


    // Notebook(){
    /*
     * int productId;
     * int id;
     * int unitPrice;
     * int disocuntRate;
     * int stockAmount;
     * String nameOfProduct;
     * String brandInfo;
     * int RAM_GB = 8 ;//(GB):int = 8
     * int storage_SSDs_GB = 512 ;//(SSDs):int= 512
     * int screenSize_Inc = 14;//(Inc):int=14
     

    // }

    Notebook() {

    }

    Notebook(int productId, String productGroup, int unitPrice, int disocuntRate, int stockAmount, String nameOfProduct, String brandInfo, int RAM_GB, int storage_SSDs_GB, int screenSize_Inc) {
        super(productId, productGroup, unitPrice, disocuntRate, stockAmount, nameOfProduct, brandInfo);
        this.RAM_GB = RAM_GB;
        this.storage_SSDs_GB = storage_SSDs_GB;
        this.screenSize_Inc = screenSize_Inc;
    }

    public int getRAM_GB() {
        return RAM_GB;
    }

    public int getStorage_SSDs_GB() {
        return storage_SSDs_GB;
    }

    public int getScreenSize_Inc() {
        return screenSize_Inc;
    }

    public void setRAM_GB(int rAM_GB) {
        RAM_GB = rAM_GB;
    }

    public void setStorage_SSDs_GB(int storage_SSDs_GB) {
        this.storage_SSDs_GB = storage_SSDs_GB;
    }

    public void setScreenSize_Inc(int screenSize_Inc) {
        this.screenSize_Inc = screenSize_Inc;
    }

    
     * while (isError) {
     * try {
     * System.out.println(
     * "*******************************\n*  Notebook Operations  *\n*******************************\nProduct Operations:\n1 - Add Product\n2 - Add Product Group\n3 - Delete Product\n4 - List Product(by Product Group) \n5 - Select Product Group\n6 - Filter Product(with Product ID)\n7 - Filter Product(with Brand)\n8 - Return Product Management System \nPlease Choose (1-8): "
     * );
     * 
     * Scanner scan=new Scanner(System.in);
     * int selection = scan.nextInt();
     * scan.close();
     * 
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
     * // listTabularForm();
     * System.out.println("listed product");
     * 
     * break;
     * case 5:
     * // selectProductGroup();
     * System.out.println("selected group");
     * 
     * break;
     * case 6:
     * // filterProductId();
     * System.out.println("filtered product by ID");
     * 
     * break;
     * case 7:
     * // filterProduct();
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
     * }
     * 
     */
}
