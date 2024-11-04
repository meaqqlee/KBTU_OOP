package Labs.Lab1.Task2;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.showPhoneInfo();

        Phone iphone9 = new Phone("red", PhoneType.IPHONE);
        iphone9.showPhoneInfo();

        Phone pixel9pro = new Phone("dark");
        pixel9pro.paintPhone("white");

        pixel9pro.showPhoneInfo(true);

        int totalPhones = Phone.getTotalPhone();
        System.out.println(totalPhones);
    }
}