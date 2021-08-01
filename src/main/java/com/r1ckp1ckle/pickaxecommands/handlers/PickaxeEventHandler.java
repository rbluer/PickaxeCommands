package com.r1ckp1ckle.pickaxecommands.handlers;

import java.util.HashMap;

import org.bukkit.Bukkit;
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
        	
        	XMaterial xMat = XMaterial.matchXMaterial( event.getMaterial() );
        	
            if( pCmds.containsKey( xMat )) {
                if( !pPerms.get( xMat ).equals("")) {
                    if( event.getPlayer().hasPermission( pPerms.get( xMat ) )) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), pCmds.get( xMat ).replace("%player%", playerName ));
                    }
                } 
                else {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), pCmds.get( xMat ).replace("%player%", playerName));
                }
            }
        }
    }
}
