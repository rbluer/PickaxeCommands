package com.r1ckp1ckle.pickaxecommands.utils;

import java.util.HashMap;

import org.bukkit.Material;

import com.cryptomorin.xseries.XMaterial;
import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class CommandUtils {
    private HashMap<XMaterial, String> pickaxeCommands = new HashMap<>();
    private HashMap<XMaterial, String> pickaxePerms = new HashMap<>();

    public void registerPickaxeCommands(HashMap<XMaterial, String> pickaxeCommands) {
    	
        pickaxeCommands.put(Material.WOOD_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("WOOD_PICKAXE")));
        pickaxeCommands.put(Material.STONE_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("STONE_PICKAXE")));
        pickaxeCommands.put(Material.IRON_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("IRON_PICKAXE")));
        pickaxeCommands.put(Material.GOLD_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("GOLD_PICKAXE")));
        pickaxeCommands.put(Material.DIAMOND_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("DIAMOND_PICKAXE")));
    }
    
    public void registerPickaxePerms(HashMap<XMaterial, String> pickaxeCommands) {
        pickaxeCommands.put(Material.WOOD_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("WOOD_PICKAXE_PERMS")));
        pickaxeCommands.put(Material.STONE_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("STONE_PICKAXE_PERMS")));
        pickaxeCommands.put(Material.IRON_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("IRON_PICKAXE_PERMS")));
        pickaxeCommands.put(Material.GOLD_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("GOLD_PICKAXE_PERMS")));
        pickaxeCommands.put(Material.DIAMOND_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("DIAMOND_PICKAXE_PERMS")));
    }

    private String stringToCommand(String cmd) {
        String newCmd = cmd;
        if(cmd.charAt(0) == '/') {
            newCmd = cmd.substring(1);
        }
        return newCmd;
    }

    public HashMap<Material, String> getPickaxeCommands() {
        return pickaxeCommands;
    }
    public HashMap<Material, String> getPickaxePerms() { return pickaxePerms; }
}
