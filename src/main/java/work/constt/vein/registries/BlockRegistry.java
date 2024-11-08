package work.constt.vein.registries;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static work.constt.vein.Vein.MOD_ID;

public class BlockRegistry {

    public static final Block DEAD_LOG = register(
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .sounds(BlockSoundGroup.WOOD)
            ), "dead_log", true
    );

    public static final Block DEAD_PLANK = register(
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)),
            "dead_plank",true
    );

    public static final Block DEAD_SLAB = register(
            new SlabBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)),
            "dead_slab",true
    );

    public static final Block DEAD_STAIR = register(
            new StairsBlock(
                    DEAD_PLANK.getDefaultState(),
                    AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)),
            "dead_stair",true
    );

    public static final Block DEAD_BUTTON = register(
            new ButtonBlock(
                    BlockSetType.STONE,
                    1,
                    AbstractBlock.Settings.create()
                            .strength(0.5f)
                            .sounds(BlockSoundGroup.WOOD)
            ),
            "dead_button",
            true

    );

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}
}
