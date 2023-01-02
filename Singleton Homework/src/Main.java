public class Main {
    public static void main(String[] args) {
        ConfigManager configManager1 = ConfigManager.getInstance();
        ConfigManager configManager2 = ConfigManager.getInstance();

        configManager2.update("pass","aaaaaa");
        System.out.println(configManager1.get("pass"));
        System.out.println(configManager2 == configManager1);
    }
}