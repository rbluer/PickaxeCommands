package com.r1ckp1ckle.pickaxecommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.r1ckp1ckle.pickaxecommands.commands.PCEmpty;
import com.r1ckp1ckle.pickaxecommands.commands.PCReload;
import com.r1ckp1ckle.pickaxecommands.handlers.PickaxeEventHandler;
import com.r1ckp1ckle.pickaxecommands.utils.CommandUtils;
import com.r1ckp1ckle.pickaxecommands.utils.ConfigurationUtils;

public class PickaxeCommandsCore extends JavaPlugin {
	
    private static PickaxeCommandsCore instance;
    private ConfigurationUtils configurationUtils;
    private CommandUtils commandUtils;
    
    public PickaxeCommandsCore() {
    	super();
    	
    	instance = this;
    }

    public CommandUtils getCommandUtils() {
        return commandUtils;
    }

    @Override
    public void onEnable() {
        System.out.println("=======================================");
        
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
        getCommand("pcreload").setExecutor(new PCReload( this ));
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
