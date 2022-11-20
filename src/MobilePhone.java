

public class MobilePhone extends Product {

    public int RAM_MB = 6;// (MB):int = 6
    public int phoneMemoryInformation;// (GB) :int= {128,64 }
    public double screenSize_Inc = 6.1;// (Inc):double = {6.1}
    public int batteryPower = 4000;// :int=4000
    public String color;// :string = {Black, Red, Blue}

    MobilePhone(int productId, String productGroup, int unitPrice, int disocuntRate, int stockAmount, String nameOfProduct, String brandInfo, int RAM_MB, int phoneMemoryInformation, double screenSize_Inc, int batteryPower, String color) {

        super(productId, productGroup, unitPrice, disocuntRate, stockAmount, nameOfProduct, brandInfo);

        this.RAM_MB = RAM_MB;
        this.phoneMemoryInformation = phoneMemoryInformation;
        this.screenSize_Inc = screenSize_Inc;
        this.batteryPower = batteryPower;
        this.batteryPower = batteryPower;
        this.color = color;

    }
}
