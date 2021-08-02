package com.r1ckp1ckle.pickaxecommands.utils;

import java.util.HashMap;

import com.cryptomorin.xseries.XMaterial;
import com.r1ckp1ckle.pickaxecommands.PickaxeCommandsCore;

public class CommandUtils {
    private HashMap<XMaterial, String> pickaxeCommands = new HashMap<>();
    private HashMap<XMaterial, String> pickaxePerms = new HashMap<>();

    public void registerPickaxeCommands() {
    	
        addCommand( XMaterial.WOODEN_PICKAXE );
        addCommand( XMaterial.STONE_PICKAXE );
        addCommand( XMaterial.IRON_PICKAXE );
        addCommand( XMaterial.GOLDEN_PICKAXE );
        addCommand( XMaterial.DIAMOND_PICKAXE );
        addCommand( XMaterial.NETHERITE_PICKAXE );
        
        addCommand( XMaterial.WOODEN_SHOVEL );
        addCommand( XMaterial.STONE_SHOVEL );
        addCommand( XMaterial.IRON_SHOVEL );
        addCommand( XMaterial.GOLDEN_SHOVEL );
        addCommand( XMaterial.DIAMOND_SHOVEL );
        addCommand( XMaterial.NETHERITE_SHOVEL );

        addCommand( XMaterial.BOW );
        addCommand( XMaterial.CROSSBOW );
        addCommand( XMaterial.STICK );
        addCommand( XMaterial.TRIDENT );
        addCommand( XMaterial.BLAZE_ROD );

        addCommand( XMaterial.WOODEN_AXE );
        addCommand( XMaterial.STONE_AXE );
        addCommand( XMaterial.IRON_AXE );
        addCommand( XMaterial.GOLDEN_AXE );
        addCommand( XMaterial.DIAMOND_AXE );
        addCommand( XMaterial.NETHERITE_AXE );

        addCommand( XMaterial.WOODEN_SWORD );
        addCommand( XMaterial.STONE_SWORD );
        addCommand( XMaterial.IRON_SWORD );
        addCommand( XMaterial.GOLDEN_SWORD );
        addCommand( XMaterial.DIAMOND_SWORD );
        addCommand( XMaterial.NETHERITE_SWORD );
        
        addCommand( XMaterial.WOODEN_HOE );
        addCommand( XMaterial.STONE_HOE );
        addCommand( XMaterial.IRON_HOE );
        addCommand( XMaterial.GOLDEN_HOE );
        addCommand( XMaterial.DIAMOND_HOE );
        addCommand( XMaterial.NETHERITE_HOE );

        
        addCommand( XMaterial.LEATHER_HELMET );
        addCommand( XMaterial.CHAINMAIL_HELMET );
        addCommand( XMaterial.IRON_HELMET );
        addCommand( XMaterial.GOLDEN_HELMET );
        addCommand( XMaterial.DIAMOND_HELMET );
        addCommand( XMaterial.NETHERITE_HELMET );
        addCommand( XMaterial.TURTLE_HELMET );
        
        addCommand( XMaterial.LEATHER_CHESTPLATE );
        addCommand( XMaterial.CHAINMAIL_CHESTPLATE );
        addCommand( XMaterial.IRON_CHESTPLATE );
        addCommand( XMaterial.GOLDEN_CHESTPLATE );
        addCommand( XMaterial.DIAMOND_CHESTPLATE );
        addCommand( XMaterial.NETHERITE_CHESTPLATE );
        
        addCommand( XMaterial.LEATHER_LEGGINGS );
        addCommand( XMaterial.CHAINMAIL_LEGGINGS );
        addCommand( XMaterial.IRON_LEGGINGS );
        addCommand( XMaterial.GOLDEN_LEGGINGS );
        addCommand( XMaterial.DIAMOND_LEGGINGS );
        addCommand( XMaterial.NETHERITE_LEGGINGS );

        addCommand( XMaterial.LEATHER_BOOTS );
        addCommand( XMaterial.CHAINMAIL_BOOTS );
        addCommand( XMaterial.IRON_BOOTS );
        addCommand( XMaterial.GOLDEN_BOOTS );
        addCommand( XMaterial.DIAMOND_BOOTS );
        addCommand( XMaterial.NETHERITE_BOOTS );

    }

    public void registerPickaxePerms() {
    	
    	addPermission( XMaterial.WOODEN_PICKAXE );
    	addPermission( XMaterial.STONE_PICKAXE );
    	addPermission( XMaterial.IRON_PICKAXE );
    	addPermission( XMaterial.GOLDEN_PICKAXE );
    	addPermission( XMaterial.DIAMOND_PICKAXE );
    	addPermission( XMaterial.NETHERITE_PICKAXE );
        
        addPermission( XMaterial.WOODEN_SHOVEL );
        addPermission( XMaterial.STONE_SHOVEL );
        addPermission( XMaterial.IRON_SHOVEL );
        addPermission( XMaterial.GOLDEN_SHOVEL );
        addPermission( XMaterial.DIAMOND_SHOVEL );
        addPermission( XMaterial.NETHERITE_SHOVEL );

        addPermission( XMaterial.BOW );
        addPermission( XMaterial.CROSSBOW );
        addPermission( XMaterial.STICK );
        addPermission( XMaterial.TRIDENT );
        addPermission( XMaterial.BLAZE_ROD );

        addPermission( XMaterial.WOODEN_AXE );
        addPermission( XMaterial.STONE_AXE );
        addPermission( XMaterial.IRON_AXE );
        addPermission( XMaterial.GOLDEN_AXE );
        addPermission( XMaterial.DIAMOND_AXE );
        addPermission( XMaterial.NETHERITE_AXE );

        addPermission( XMaterial.WOODEN_SWORD );
        addPermission( XMaterial.STONE_SWORD );
        addPermission( XMaterial.IRON_SWORD );
        addPermission( XMaterial.GOLDEN_SWORD );
        addPermission( XMaterial.DIAMOND_SWORD );
        addPermission( XMaterial.NETHERITE_SWORD );
        
        addPermission( XMaterial.WOODEN_HOE );
        addPermission( XMaterial.STONE_HOE );
        addPermission( XMaterial.IRON_HOE );
        addPermission( XMaterial.GOLDEN_HOE );
        addPermission( XMaterial.DIAMOND_HOE );
        addPermission( XMaterial.NETHERITE_HOE );

        
        addPermission( XMaterial.LEATHER_HELMET );
        addPermission( XMaterial.CHAINMAIL_HELMET );
        addPermission( XMaterial.IRON_HELMET );
        addPermission( XMaterial.GOLDEN_HELMET );
        addPermission( XMaterial.DIAMOND_HELMET );
        addPermission( XMaterial.NETHERITE_HELMET );
        addPermission( XMaterial.TURTLE_HELMET );
        
        addPermission( XMaterial.LEATHER_CHESTPLATE );
        addPermission( XMaterial.CHAINMAIL_CHESTPLATE );
        addPermission( XMaterial.IRON_CHESTPLATE );
        addPermission( XMaterial.GOLDEN_CHESTPLATE );
        addPermission( XMaterial.DIAMOND_CHESTPLATE );
        addPermission( XMaterial.NETHERITE_CHESTPLATE );
        
        addPermission( XMaterial.LEATHER_LEGGINGS );
        addPermission( XMaterial.CHAINMAIL_LEGGINGS );
        addPermission( XMaterial.IRON_LEGGINGS );
        addPermission( XMaterial.GOLDEN_LEGGINGS );
        addPermission( XMaterial.DIAMOND_LEGGINGS );
        addPermission( XMaterial.NETHERITE_LEGGINGS );

        addPermission( XMaterial.LEATHER_BOOTS );
        addPermission( XMaterial.CHAINMAIL_BOOTS );
        addPermission( XMaterial.IRON_BOOTS );
        addPermission( XMaterial.GOLDEN_BOOTS );
        addPermission( XMaterial.DIAMOND_BOOTS );
        addPermission( XMaterial.NETHERITE_BOOTS );
    }

    /**
     * <p>Load the commands only if the command is not blanks or nulls.
     * </p>
     * 
     * @param xMat
     * @param pickaxeCommands
     */
    private void addCommand( XMaterial xMat ) {
    	String cmd = stringToCommand( 
    					PickaxeCommandsCore.getInstance().getConfig().getString( xMat.name() ));
    
    	
    	if ( cmd != null && !cmd.trim().isEmpty() && !"pcempty".equalsIgnoreCase( cmd ) ) {
    		
    		pickaxeCommands.put( xMat, cmd);
    	}
    }
    
    /**
     * <p>If permission is not null and not empty, and the XMaterial related to the perm does 
     * has a command, then add the perm.  
     * </p>
     * 
     * @param xMat
     * @param pickaxePerms
     */
    private void addPermission( XMaterial xMat ) {
    	String perm = PickaxeCommandsCore.getInstance().getConfig().getString( xMat.name() + "_PERMS");
    	
    	if ( perm != null && !perm.trim().isEmpty() && pickaxeCommands.containsKey( xMat ) ) {
    		
    		pickaxePerms.put( xMat, perm);
    	}
    	
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
