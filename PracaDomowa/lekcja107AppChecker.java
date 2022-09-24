public class lekcja107AppChecker {
    public static void main(String[] args) {
        lekcja107AndroidApp androidApp = new lekcja107AndroidApp("Samsung S11");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        lekcja107iPhoneApp iPhoneApp = new lekcja107iPhoneApp("iPhone 12");
        iPhoneApp.appInfo();
        iPhoneApp.runiPhoneApp();
    }
}
