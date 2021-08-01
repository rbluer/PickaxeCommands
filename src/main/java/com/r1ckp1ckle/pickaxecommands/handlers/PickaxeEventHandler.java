package com.r1ckp1ckle.pickaxecommands.handlers;

import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class PickaxeEventHandler implements Listener {

    @EventHandler
    void OnPickaxeInteract(PlayerInteractEvent event){
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxeCommands().containsKey(event.getMaterial())) {
                if(!PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxePerms().get(event.getMaterial()).equals("")) {
                    if(event.getPlayer().hasPermission(PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxePerms().get(event.getMaterial()))) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxeCommands().get(event.getMaterial()).replace("%player%", event.getPlayer().getName()));
                    }
                } else {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), PickaxeCommandsCore.getInstance().getCommandUtils().getPickaxeCommands().get(event.getMaterial()).replace("%player%", event.getPlayer().getName()));
                }
            }
        }
    }
}
