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
        MobilePhone.RAM_MB = RAM_MB;
        MobilePhone.phoneMemoryInformation = phoneMemoryInformation;
        MobilePhone.batteryPower = batteryPower;
        MobilePhone.color = color;
    }

    public String getRAM_MB() {
        return MobilePhone.RAM_MB;
    }

    public void setRAM_MB(String RAM_MB) {
        MobilePhone.RAM_MB = RAM_MB;
    }

    public String getPhoneMemoryInformation() {
        return MobilePhone.phoneMemoryInformation;
    }

    public void setPhoneMemoryInformation(String phoneMemoryInformation) {
        MobilePhone.phoneMemoryInformation = phoneMemoryInformation;
    }

    public String getBatteryPower() {
        return MobilePhone.batteryPower;
    }

    public void setBatteryPower(String batterPower) {
        MobilePhone.batteryPower = batterPower;
    }

    public String getColor() {
        return MobilePhone.color;
    }

    public void setColor(String color) {
        MobilePhone.color = color;
    }
}
