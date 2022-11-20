

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

    public int getRAM_MB() {
        return RAM_MB;
    }

    public int getPhoneMemoryInformation() {
        return phoneMemoryInformation;
    }

    public double getScreenSize_Inc() {
        return screenSize_Inc;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setRAM_MB(int rAM_MB) {
        RAM_MB = rAM_MB;
    }

    public void setPhoneMemoryInformation(int phoneMemoryInformation) {
        this.phoneMemoryInformation = phoneMemoryInformation;
    }

    public void setScreenSize_Inc(double screenSize_Inc) {
        this.screenSize_Inc = screenSize_Inc;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
