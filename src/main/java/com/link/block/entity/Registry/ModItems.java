package com.link.block.entity.Registry;

import com.link.block.entity.Main;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static void registerItems() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "test_block"), EXAMPLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "test_block"), new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}