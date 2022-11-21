
public class Brand extends MenuPanel {
    int brandId;
    String brand;

    Brand(int brandId, String brand) {
        super();
        this.brandId = brandId;
        this.brand = brand;

    }

    public static void addBrand() {
        System.out.println("addBrand");
    }

    public static void listBrand() {
        System.out.println("listBrand");
        Brand.print();
    }

    public static void print() {
        System.out.println(
                "Our Brands:\n-----------\n- Apple\n- Asus\n- Casper\n- HP\n- Huawei\n- Lenovo\n- Monster\n- Samsung\n- Xiaomi");
        

    }
}
