package com.r1ckp1ckle.pickaxecommands;

import com.r1ckp1ckle.pickaxecommands.commands.PCEmpty;
import com.r1ckp1ckle.pickaxecommands.handlers.PickaxeEventHandler;
import com.r1ckp1ckle.pickaxecommands.utils.CommandUtils;
import com.r1ckp1ckle.pickaxecommands.utils.ConfigurationUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PickaxeCommandsCore extends JavaPlugin {
    private static PickaxeCommandsCore instance;
    private ConfigurationUtils configurationUtils;
    private CommandUtils commandUtils;

    public CommandUtils getCommandUtils() {
        return commandUtils;
    }

    @Override
    public void onEnable() {
        System.out.println("=======================================");
        instance = this;
        configurationUtils = new ConfigurationUtils(this);
        commandUtils = new CommandUtils();
        commandUtils.registerPickaxeCommands(commandUtils.getPickaxeCommands());
        commandUtils.registerPickaxePerms(commandUtils.getPickaxePerms());
        registerListeners();
        registerCommands();
        System.out.println("PickaxeCommands Enabled");
        System.out.println("=======================================");
    }

    private void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new PickaxeEventHandler(), this);
    }

    private void registerCommands() {
        getCommand("pcempty").setExecutor(new PCEmpty());
    }

    @Override
    public void onDisable() {
        System.out.println("=======================================");
        System.out.println("PickaxeCommands Enabled");
        System.out.println("=======================================");
    }

    public static PickaxeCommandsCore getInstance() {
        return instance;
    }

    public ConfigurationUtils getConfigurationUtils() {
        return configurationUtils;
    }
}
