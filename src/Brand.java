

public class Brand extends MenuPanel {
//    static int [] brandID ;

//    static String[] brandID = { brand0, brand1, brand2, brand3, brand4, brand5, brand6, brand7, brand8 };


    static String brand0 = "Samsung";

    static String brand1 = "Lenovo";

    static String brand2 = "Apple";

    static String brand3 = "Huawei";

    static String brand4 = "Casper";

    static String brand5 = "Asus";

    static String brand6 = "HP";

    static String brand7 = "Xiaomi";

    static String brand8 = "Monster";

    static String[] brands = { brand0, brand1, brand2, brand3, brand4, brand5, brand6, brand7, brand8 };

    Brand() {
        super();


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

    }}

