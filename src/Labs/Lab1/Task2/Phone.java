package Labs.Lab1.Task2;

public class Phone {
    static int totalPhones;

    private final int phoneId;

    private String color;

    private final PhoneType phoneType;

    {
        totalPhones++;
    }

    public Phone() {
        this("White", PhoneType.PIXEL);
    }

    public Phone(String color) {
        this(color, PhoneType.PIXEL);
    }

    public Phone(String color, PhoneType phoneType) {
        this.phoneId = totalPhones;
        this.color = color;
        this.phoneType = phoneType;
    }

    public void paintPhone(String color) {
        this.color = color;
    }

    public void showPhoneInfo() {
        System.out.println("Phone's id: " + phoneId + ", Phone's color: " + color + ", Phone's mark: " + phoneType);
    }

    public void showPhoneInfo(boolean showTotalPhones) {
        showPhoneInfo();
        if(showTotalPhones) {
            System.out.println("total manufactured Phones: " + totalPhones);
        }
    }

    public static int getTotalPhone() {
        return totalPhones;
    }
}
