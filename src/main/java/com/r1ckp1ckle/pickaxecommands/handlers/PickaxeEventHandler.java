package com.r1ckp1ckle.pickaxecommands.handlers;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.cryptomorin.xseries.XMaterial;
import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class PickaxeEventHandler implements Listener {

    @EventHandler
    void OnPickaxeInteract(PlayerInteractEvent event) {
        if( event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK ) {
        	
        	HashMap<XMaterial, String> pCmds = PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxeCommands();
        	HashMap<XMaterial, String> pPerms = PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxePerms();
        	
        	String playerName = event.getPlayer().getName();
        	CommandSender cmdRunner = Bukkit.getConsoleSender();
        	
        	XMaterial xMat = XMaterial.matchXMaterial( event.getMaterial() );
        	String cmd = pCmds.get( xMat );
        	
        	// Replace any use of {player} placeholder in the command, with the player's name. 
        	cmd = replacePlaceholder( "player", playerName, cmd );

        	// Checks to see if the command should be ran as the player, or as console:
        	if ( containsPlaceholder( "runAsPlayer", cmd ) ) {
        		cmd = replacePlaceholder( "runAsPlayer", "", cmd );
        		cmdRunner = event.getPlayer();
        	}
        	
        	
            if( pCmds.containsKey( xMat )) {
                if( !pPerms.get( xMat ).equals("")) {
                    if( event.getPlayer().hasPermission( pPerms.get( xMat ) )) {
                        Bukkit.dispatchCommand( cmdRunner, cmd);
                    }
                } 
                else {
                    Bukkit.dispatchCommand( cmdRunner, cmd);
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
