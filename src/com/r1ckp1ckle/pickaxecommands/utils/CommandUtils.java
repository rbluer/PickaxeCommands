package com.r1ckp1ckle.pickaxecommands.utils;

import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;
import org.bukkit.Material;

import java.util.HashMap;

public class CommandUtils {
    private HashMap<Material, String> pickaxeCommands = new HashMap<>();
    private HashMap<Material, String> pickaxePerms = new HashMap<>();

    public void registerPickaxeCommands(HashMap<Material, String> pickaxeCommands) {
        pickaxeCommands.put(Material.WOOD_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("WOOD_PICKAXE")));
        pickaxeCommands.put(Material.STONE_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("STONE_PICKAXE")));
        pickaxeCommands.put(Material.IRON_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("IRON_PICKAXE")));
        pickaxeCommands.put(Material.GOLD_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("GOLD_PICKAXE")));
        pickaxeCommands.put(Material.DIAMOND_PICKAXE, stringToCommand(PickaxeCommandsCore.getInstance().getConfig().getString("DIAMOND_PICKAXE")));
    }

    public void registerPickaxePerms(HashMap<Material, String> pickaxeCommands) {
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
