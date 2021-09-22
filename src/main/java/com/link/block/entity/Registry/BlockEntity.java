package com.link.block.entity.Registry;


import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class BlockEntity extends net.minecraft.block.entity.BlockEntity {
    public BlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntity.DEMO_BLOCK_ENTITY, pos, state);
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DemoBlockEntity(pos, state);
    }
}
