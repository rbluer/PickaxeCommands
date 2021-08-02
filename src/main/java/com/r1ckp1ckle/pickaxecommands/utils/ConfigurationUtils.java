package com.r1ckp1ckle.pickaxecommands.utils;

import java.io.File;
import java.util.logging.Level;

import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class ConfigurationUtils {
    private PickaxeCommandsCore pickaxeCommandsCore;

    private File configFile;
//    private FileConfiguration config;
    
    public ConfigurationUtils(PickaxeCommandsCore pickaxeCommandsCore) {
        this.pickaxeCommandsCore = pickaxeCommandsCore;
        initConfig();
    }

    private void initConfig() {
        if (!pickaxeCommandsCore.getDataFolder().exists()) {
            pickaxeCommandsCore.getDataFolder().mkdirs();
        }
        configFile = new File(pickaxeCommandsCore.getDataFolder(), "config.yml");
        
        if (!configFile.exists()) {
        	pickaxeCommandsCore.saveResource("config.yml", false);
        }
        
//        config = new YamlConfiguration();
        	
        try {
        	pickaxeCommandsCore.getConfig().load(configFile);
        } catch (Exception e) {
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Failed to load plugin files.");
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Error: " + e.getMessage());
        }
    }

    public void reloadFiles() {
        try {
        	pickaxeCommandsCore.getConfig().load(configFile);
        } catch (Exception e) {
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Failed to reload plugin files.");
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Error: " + e.getMessage());
        }
    }

    public void saveFiles() {
        try {
        	pickaxeCommandsCore.getConfig().save(configFile);
        } catch (Exception e) {
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Failed to save plugin files.");
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Error: " + e.getMessage());
        }
    }

//    public FileConfiguration getConfig() {
//        return config;
//    }
}