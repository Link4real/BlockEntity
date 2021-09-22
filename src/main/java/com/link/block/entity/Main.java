package com.link.block.entity;

import com.link.block.entity.Registry.ModBlocks;
import com.link.block.entity.Registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {




    public static final String MOD_ID = "blocktest";




    @Override
    public void onInitialize() {
     ModItems.registerItems();
     ModBlocks.registerItems();
    }
}
