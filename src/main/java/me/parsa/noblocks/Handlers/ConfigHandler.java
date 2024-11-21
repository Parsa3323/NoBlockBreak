package me.parsa.noblocks.Handlers;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigHandler {
//sd
    private FileConfiguration config;

    // Constructor to accept the config
    public ConfigHandler(FileConfiguration config) {
        this.config = config;
    }

    // Example method to get a value from config
    public String getSomeValue() {
        return config.getString("someKey");
    }

    // You can add more methods to get different types of values from the config
    public int getSomeIntValue() {
        return config.getInt("someIntKey", 0); // Default value of 0 if key doesn't exist
    }

    // Similarly for booleans, lists, etc.
    public boolean isFeatureEnabled() {
        return config.getBoolean("featureEnabled", false); // Default is false
    }
}
