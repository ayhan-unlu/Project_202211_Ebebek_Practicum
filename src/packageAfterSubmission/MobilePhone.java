package packageAfterSubmission;

public class MobilePhone extends Product {
    private static String RAM_MB = "6";
    private static String phoneMemoryInformation;// (GB) :int= {128,64 }
    private static String batteryPower = "4000";
    private static String color;// :string = {Black, Red, Blue}

    MobilePhone(String productId, String productGroup, String unitPrice, String discountRate, String stockAmount,
            String nameOfProduct, String brandInfo, String screenSizeInc, String RAM_MB, String phoneMemoryInformation,
            String batteryPower, String color) {
        super(productId, productGroup, unitPrice, discountRate, stockAmount, nameOfProduct, brandInfo, screenSizeInc);
        this.RAM_MB = RAM_MB;
        this.phoneMemoryInformation = phoneMemoryInformation;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public String getRAM_MB() {
        return this.RAM_MB;
    }

    public void setRAM_MB(String RAM_MB) {
        this.RAM_MB = RAM_MB;
    }

    public String getPhoneMemoryInformation() {
        return this.phoneMemoryInformation;
    }

    public void setPhoneMemoryInformation(String phoneMemoryInformation) {
        this.phoneMemoryInformation = phoneMemoryInformation;
    }

    public String getBatteryPower() {
        return this.batteryPower;
    }

    public void setBatteryPower(String batterPower) {
        this.batteryPower = batterPower;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
