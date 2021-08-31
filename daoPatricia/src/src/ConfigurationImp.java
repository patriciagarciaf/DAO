public class ConfigurationImp implements Configuration {

    private static Configuration configuration = null;

    public static Configuration getConfiguration() {
        if (configuration == null) {
            configuration = new ConfigurationImp();
        }
        return configuration;
    }

    @Override
    public String getUser() {
        return System.getenv("user");
    }

    @Override
    public String getPassword() {
        return System.getenv("password");
    }

    @Override
    public String getUrl() {
        return System.getenv("DB_URL_SB");

    }
}