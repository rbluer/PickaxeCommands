package com.r1ckp1ckle.pickaxecommands.utils;

import java.io.File;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class ConfigurationUtils {
    private PickaxeCommandsCore pickaxeCommandsCore;

    private File configFile;
    private FileConfiguration config;
    public ConfigurationUtils(PickaxeCommandsCore pickaxeCommandsCore) {
        this.pickaxeCommandsCore = pickaxeCommandsCore;
        initConfig();
    }

    private void initConfig() {
        if (!pickaxeCommandsCore.getDataFolder().exists()) {
            pickaxeCommandsCore.getDataFolder().mkdirs();
        }
        configFile = new File(pickaxeCommandsCore.getDataFolder(), "config.yml");
        if (!configFile.exists()) pickaxeCommandsCore.saveResource("config.yml", false);
        config = new YamlConfiguration();
        try {
            config.load(configFile);
        } catch (Exception e) {
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Failed to load plugin files.");
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Error: " + e.getMessage());
        }
    }

    public void reloadFiles() {
        try {
            config.load(configFile);
        } catch (Exception e) {
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Failed to load plugin files.");
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Error: " + e.getMessage());
        }
    }

    public void saveFiles() {
        try {
            config.save(configFile);
        } catch (Exception e) {
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Failed to save plugin files.");
            pickaxeCommandsCore.getLogger().log(Level.SEVERE, "Error: " + e.getMessage());
        }
    }

    public FileConfiguration getConfig() {
        return config;
    }
}