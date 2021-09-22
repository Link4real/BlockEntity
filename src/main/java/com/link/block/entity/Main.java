package com.link.block.entity;

import com.link.block.entity.Registry.ModBlocks;
import com.link.block.entity.Registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {




    public static final String MOD_ID = "blocktest";

    public static BlockEntityType<DemoBlockEntity> DEMO_BLOCK_ENTITY;



    @Override
    public void onInitialize() {
     ModItems.registerItems();
     ModBlocks.registerItems();
     DEMO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "blocktest:demo_block_entity", FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));

    }
}
