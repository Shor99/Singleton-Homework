import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map <String,String> configMap = new HashMap<>(){{
        put("host","myServer.db");
        put("port","8089");
        put("user","admin");
        put("pass","pa$$w0rd");
    }};

    private ConfigManager() {}

    private static volatile ConfigManager INSTANCE;

    public String update(String key, String value) {
        return configMap.put(key,value);
    }
    public String get(String key) {

        return configMap.get(key);
    }
    public static ConfigManager getInstance() {
        if(INSTANCE == null)
        {
            synchronized (ConfigManager.class){
                if (INSTANCE == null) {
                    INSTANCE = new ConfigManager();
                }
            }
        }
        return INSTANCE;
    }
}
