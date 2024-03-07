package rearth.oritech.block.blocks.machines.processing;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import rearth.oritech.block.base.block.MultiblockMachine;
import rearth.oritech.block.entity.machines.processing.AssemblerBlockEntity;
import rearth.oritech.block.entity.machines.processing.AtomicForgeBlockEntity;

public class AtomicForgeBlock extends MultiblockMachine implements BlockEntityProvider {
    
    public AtomicForgeBlock(Settings settings) {
        super(settings);
    }
    
    @Override
    public @NotNull Class<? extends BlockEntity> getBlockEntityType() {
        return AtomicForgeBlockEntity.class;
    }
}
