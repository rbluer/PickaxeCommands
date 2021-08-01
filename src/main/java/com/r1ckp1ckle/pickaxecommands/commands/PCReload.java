package com.r1ckp1ckle.pickaxecommands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;
import com.r1ckp1ckle.pickaxecommands.utils.CommandUtils;

public class PCReload 
	implements CommandExecutor {
	
	private PickaxeCommandsCore plugin;
	
	public PCReload( PickaxeCommandsCore plugin ) {
		super();
		
		this.plugin = plugin;
	}
	    @Override
	    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
	    	
	    	plugin.getConfigurationUtils().reloadFiles();
	    	
	    	
	    	CommandUtils commandUtils = plugin.getCommandUtils();
	    	
	    	commandUtils.getPickaxeCommands().clear();
	    	commandUtils.getPickaxePerms().clear();
	    	
	        commandUtils.registerPickaxeCommands(commandUtils.getPickaxeCommands());
	        commandUtils.registerPickaxePerms(commandUtils.getPickaxePerms());
	    	
	        return true;
	    }
}
