package com.r1ckp1ckle.pickaxecommands.handlers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.cryptomorin.xseries.XMaterial;
import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class PickaxeEventHandler implements Listener {

	private HashMap<XMaterial, String> pCmds;
	private HashMap<XMaterial, String> pPerms;
	
	
	public PickaxeEventHandler() {
		super();
		
		// Set local references to the two HashMaps to help ensure better performance 
		// when evaluating of this event should be handled or not
		pCmds = PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxeCommands();
		pPerms = PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxePerms();
		
	}
	
    @EventHandler
    void OnPickaxeInteract(PlayerInteractEvent event) {
    	
        if( event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK ) {
        	
        	XMaterial xMat = XMaterial.matchXMaterial( event.getMaterial() );
        	String cmd = pCmds.get( xMat );
        	
        	// Need to exit as quickly as possible if there is no material match in the configs.
        	// Process if there are no perms, or the player has the required perms:
        	if ( cmd != null && !cmd.trim().isEmpty() && !"pcempty".equalsIgnoreCase( cmd ) &&
        			( pPerms.get( xMat ).equals("") || event.getPlayer().hasPermission( pPerms.get( xMat ) ) )) {
        		
        		String playerName = event.getPlayer().getName();
        		
        		// Replace any use of {player} placeholder in the command, with the player's name. 
        		cmd = replacePlaceholder( "player", playerName, cmd );
        		
        		List<String> cmds = Arrays.asList( cmd.split( ";" ) );
        		
        		for ( String command : cmds ) {
					
        			if ( command != null && !command.trim().isEmpty() ) {
        				
        				CommandSender cmdRunner = Bukkit.getConsoleSender();
        				
        				// Checks to see if the command should be ran as the player, or as console:
        				if ( containsPlaceholder( "runAsPlayer", command ) ) {
        					command = replacePlaceholder( "runAsPlayer", "", command );
        					cmdRunner = event.getPlayer();
        				}
        				
        				Bukkit.dispatchCommand( cmdRunner, command );
        			}
				}
        	}
        	
        }
    }
    
    /**
     * <p>This takes a placeholder name, and replaces the placeholder with the targetValue.
     * Either { } or % % can be used.  This allows for the flexibility within configs.
     * </p>
     * 
     * @param placeholder
     * @param targetValue
     * @param command
     * @return
     */
    private String replacePlaceholder( String placeholder, String targetValue, String command ) {
    	return command
    				.replace( "{" + placeholder + "}", targetValue )
    				.replace( "%" + placeholder + "%", targetValue );
    }
    
    /**
     * <p>This uses a placeholder name, and checks if the placeholder exists within the
     * command. Either { } or % % can be used.  This allows for the flexibility within configs.
     * </p>
     * 
     * @param placeholder
     * @param command
     * @return
     */
    private boolean containsPlaceholder( String placeholder, String command ) {
    	return command.contains( "{" + placeholder + "}" ) || 
    		   command.contains( "%" + placeholder + "%" );
    }
}
