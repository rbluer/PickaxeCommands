package com.r1ckp1ckle.pickaxecommands.utils;

import java.util.HashMap;

import com.cryptomorin.xseries.XMaterial;
import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class CommandUtils {
    private HashMap<XMaterial, String> pickaxeCommands = new HashMap<>();
    private HashMap<XMaterial, String> pickaxePerms = new HashMap<>();

    public void registerPickaxeCommands( HashMap<XMaterial, String> pickaxeCommands ) {
    	
        addCommand( XMaterial.WOODEN_PICKAXE, pickaxeCommands );
        addCommand( XMaterial.STONE_PICKAXE, pickaxeCommands );
        addCommand( XMaterial.IRON_PICKAXE, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_PICKAXE, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_PICKAXE, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_PICKAXE, pickaxeCommands );
        
        addCommand( XMaterial.WOODEN_SHOVEL, pickaxeCommands );
        addCommand( XMaterial.STONE_SHOVEL, pickaxeCommands );
        addCommand( XMaterial.IRON_SHOVEL, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_SHOVEL, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_SHOVEL, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_SHOVEL, pickaxeCommands );

        addCommand( XMaterial.BOW, pickaxeCommands );
        addCommand( XMaterial.CROSSBOW, pickaxeCommands );
        addCommand( XMaterial.STICK, pickaxeCommands );
        addCommand( XMaterial.TRIDENT, pickaxeCommands );
        addCommand( XMaterial.BLAZE_ROD, pickaxeCommands );

        addCommand( XMaterial.WOODEN_AXE, pickaxeCommands );
        addCommand( XMaterial.STONE_AXE, pickaxeCommands );
        addCommand( XMaterial.IRON_AXE, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_AXE, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_AXE, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_AXE, pickaxeCommands );

        addCommand( XMaterial.WOODEN_SWORD, pickaxeCommands );
        addCommand( XMaterial.STONE_SWORD, pickaxeCommands );
        addCommand( XMaterial.IRON_SWORD, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_SWORD, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_SWORD, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_SWORD, pickaxeCommands );
        
        addCommand( XMaterial.WOODEN_HOE, pickaxeCommands );
        addCommand( XMaterial.STONE_HOE, pickaxeCommands );
        addCommand( XMaterial.IRON_HOE, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_HOE, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_HOE, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_HOE, pickaxeCommands );

        
        addCommand( XMaterial.LEATHER_HELMET, pickaxeCommands );
        addCommand( XMaterial.CHAINMAIL_HELMET, pickaxeCommands );
        addCommand( XMaterial.IRON_HELMET, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_HELMET, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_HELMET, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_HELMET, pickaxeCommands );
        addCommand( XMaterial.TURTLE_HELMET, pickaxeCommands );
        
        addCommand( XMaterial.LEATHER_CHESTPLATE, pickaxeCommands );
        addCommand( XMaterial.CHAINMAIL_CHESTPLATE, pickaxeCommands );
        addCommand( XMaterial.IRON_CHESTPLATE, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_CHESTPLATE, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_CHESTPLATE, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_CHESTPLATE, pickaxeCommands );
        
        addCommand( XMaterial.LEATHER_LEGGINGS, pickaxeCommands );
        addCommand( XMaterial.CHAINMAIL_LEGGINGS, pickaxeCommands );
        addCommand( XMaterial.IRON_LEGGINGS, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_LEGGINGS, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_LEGGINGS, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_LEGGINGS, pickaxeCommands );

        addCommand( XMaterial.LEATHER_BOOTS, pickaxeCommands );
        addCommand( XMaterial.CHAINMAIL_BOOTS, pickaxeCommands );
        addCommand( XMaterial.IRON_BOOTS, pickaxeCommands );
        addCommand( XMaterial.GOLDEN_BOOTS, pickaxeCommands );
        addCommand( XMaterial.DIAMOND_BOOTS, pickaxeCommands );
        addCommand( XMaterial.NETHERITE_BOOTS, pickaxeCommands );

    }

    public void registerPickaxePerms( HashMap<XMaterial, String> pickaxePerms ) {
    	
    	addPermission( XMaterial.WOODEN_PICKAXE, pickaxePerms );
    	addPermission( XMaterial.STONE_PICKAXE, pickaxePerms );
    	addPermission( XMaterial.IRON_PICKAXE, pickaxePerms );
    	addPermission( XMaterial.GOLDEN_PICKAXE, pickaxePerms );
    	addPermission( XMaterial.DIAMOND_PICKAXE, pickaxePerms );
    	addPermission( XMaterial.NETHERITE_PICKAXE, pickaxePerms );
        
        addPermission( XMaterial.WOODEN_SHOVEL, pickaxePerms );
        addPermission( XMaterial.STONE_SHOVEL, pickaxePerms );
        addPermission( XMaterial.IRON_SHOVEL, pickaxePerms );
        addPermission( XMaterial.GOLDEN_SHOVEL, pickaxePerms );
        addPermission( XMaterial.DIAMOND_SHOVEL, pickaxePerms );
        addPermission( XMaterial.NETHERITE_SHOVEL, pickaxePerms );

        addPermission( XMaterial.BOW, pickaxePerms );
        addPermission( XMaterial.CROSSBOW, pickaxePerms );
        addPermission( XMaterial.STICK, pickaxePerms );
        addPermission( XMaterial.TRIDENT, pickaxePerms );
        addPermission( XMaterial.BLAZE_ROD, pickaxePerms );

        addPermission( XMaterial.WOODEN_AXE, pickaxePerms );
        addPermission( XMaterial.STONE_AXE, pickaxePerms );
        addPermission( XMaterial.IRON_AXE, pickaxePerms );
        addPermission( XMaterial.GOLDEN_AXE, pickaxePerms );
        addPermission( XMaterial.DIAMOND_AXE, pickaxePerms );
        addPermission( XMaterial.NETHERITE_AXE, pickaxePerms );

        addPermission( XMaterial.WOODEN_SWORD, pickaxePerms );
        addPermission( XMaterial.STONE_SWORD, pickaxePerms );
        addPermission( XMaterial.IRON_SWORD, pickaxePerms );
        addPermission( XMaterial.GOLDEN_SWORD, pickaxePerms );
        addPermission( XMaterial.DIAMOND_SWORD, pickaxePerms );
        addPermission( XMaterial.NETHERITE_SWORD, pickaxePerms );
        
        addPermission( XMaterial.WOODEN_HOE, pickaxePerms );
        addPermission( XMaterial.STONE_HOE, pickaxePerms );
        addPermission( XMaterial.IRON_HOE, pickaxePerms );
        addPermission( XMaterial.GOLDEN_HOE, pickaxePerms );
        addPermission( XMaterial.DIAMOND_HOE, pickaxePerms );
        addPermission( XMaterial.NETHERITE_HOE, pickaxePerms );

        
        addPermission( XMaterial.LEATHER_HELMET, pickaxePerms );
        addPermission( XMaterial.CHAINMAIL_HELMET, pickaxePerms );
        addPermission( XMaterial.IRON_HELMET, pickaxePerms );
        addPermission( XMaterial.GOLDEN_HELMET, pickaxePerms );
        addPermission( XMaterial.DIAMOND_HELMET, pickaxePerms );
        addPermission( XMaterial.NETHERITE_HELMET, pickaxePerms );
        addPermission( XMaterial.TURTLE_HELMET, pickaxePerms );
        
        addPermission( XMaterial.LEATHER_CHESTPLATE, pickaxePerms );
        addPermission( XMaterial.CHAINMAIL_CHESTPLATE, pickaxePerms );
        addPermission( XMaterial.IRON_CHESTPLATE, pickaxePerms );
        addPermission( XMaterial.GOLDEN_CHESTPLATE, pickaxePerms );
        addPermission( XMaterial.DIAMOND_CHESTPLATE, pickaxePerms );
        addPermission( XMaterial.NETHERITE_CHESTPLATE, pickaxePerms );
        
        addPermission( XMaterial.LEATHER_LEGGINGS, pickaxePerms );
        addPermission( XMaterial.CHAINMAIL_LEGGINGS, pickaxePerms );
        addPermission( XMaterial.IRON_LEGGINGS, pickaxePerms );
        addPermission( XMaterial.GOLDEN_LEGGINGS, pickaxePerms );
        addPermission( XMaterial.DIAMOND_LEGGINGS, pickaxePerms );
        addPermission( XMaterial.NETHERITE_LEGGINGS, pickaxePerms );

        addPermission( XMaterial.LEATHER_BOOTS, pickaxePerms );
        addPermission( XMaterial.CHAINMAIL_BOOTS, pickaxePerms );
        addPermission( XMaterial.IRON_BOOTS, pickaxePerms );
        addPermission( XMaterial.GOLDEN_BOOTS, pickaxePerms );
        addPermission( XMaterial.DIAMOND_BOOTS, pickaxePerms );
        addPermission( XMaterial.NETHERITE_BOOTS, pickaxePerms );
    }

    private void addCommand( XMaterial xMat, HashMap<XMaterial, String> pickaxeCommands ) {
    	String cmd = stringToCommand( 
    					PickaxeCommandsCore.getInstance().getConfig().getString( xMat.name() ));
    
    	pickaxeCommands.put( xMat, cmd);
    }
    private void addPermission( XMaterial xMat, HashMap<XMaterial, String> pickaxePerms ) {
    	pickaxePerms.put( xMat, stringToCommand(
    						PickaxeCommandsCore.getInstance().getConfig().getString( xMat.name() + "_PERMS") ));
    }
    
    private String stringToCommand(String cmd) {
        String newCmd = cmd;
        if( cmd != null && !cmd.isEmpty() && cmd.charAt(0) == '/') {
            newCmd = cmd.substring(1);
        }
        return newCmd;
    }

    public HashMap<XMaterial, String> getPickaxeCommands() {
        return pickaxeCommands;
    }
    public HashMap<XMaterial, String> getPickaxePerms() { 
    	return pickaxePerms; 
    }
}
