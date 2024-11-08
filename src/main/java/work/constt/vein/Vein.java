package work.constt.vein;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import work.constt.vein.registries.BlockRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import work.constt.vein.registries.ItemRegistry;

import static work.constt.vein.registries.ItemRegistry.V_GROUP;
import static work.constt.vein.registries.ItemRegistry.V_GROUP_KEY;

public class Vein implements ModInitializer {

    public static final String MOD_ID = "vein";

    @Override
    public void onInitialize() {
        ItemRegistry.initialize();
        BlockRegistry.initialize();

        Registry.register(Registries.ITEM_GROUP, V_GROUP_KEY, V_GROUP);

        ItemGroupEvents.modifyEntriesEvent(V_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(BlockRegistry.DEAD_LOG);
            itemGroup.add(BlockRegistry.DEAD_PLANK);
            itemGroup.add(BlockRegistry.DEAD_BUTTON);
            itemGroup.add(BlockRegistry.DEAD_STAIR);
            itemGroup.add(BlockRegistry.DEAD_SLAB);

            itemGroup.add(ItemRegistry.RAW_TURTLE_MEAT);
            itemGroup.add(ItemRegistry.COOKED_TURTLE_MEAT);

            itemGroup.add(ItemRegistry.RAW_CALAMARI);
            itemGroup.add(ItemRegistry.COOKED_CALAMARI);

            itemGroup.add(ItemRegistry.RAW_HORSE_MEAT);
            itemGroup.add(ItemRegistry.COOKED_HORSE_MEAT);

            itemGroup.add(ItemRegistry.RAW_MAHI);
            itemGroup.add(ItemRegistry.COOKED_MAHI);
            itemGroup.add(ItemRegistry.POISONED_MAHI);

            itemGroup.add(ItemRegistry.RAW_PANIKI);
            itemGroup.add(ItemRegistry.COOKED_PANIKI);

            itemGroup.add(ItemRegistry.RAW_CAT_MEAT);
            itemGroup.add(ItemRegistry.COOKED_CAT_MEAT);

            itemGroup.add(ItemRegistry.RAW_FOX_MEAT);
            itemGroup.add(ItemRegistry.COOKED_FOX_MEAT);

            itemGroup.add(ItemRegistry.RAW_DOG_MEAT);
            itemGroup.add(ItemRegistry.COOKED_DOG_MEAT);

            itemGroup.add(ItemRegistry.RAW_BEAR_MEAT);
            itemGroup.add(ItemRegistry.COOKED_BEAR_MEAT);

            itemGroup.add(ItemRegistry.RAW_PANDA_MEAT);
            itemGroup.add(ItemRegistry.COOKED_PANDA_MEAT);

            itemGroup.add(ItemRegistry.CARROT_SOUP);
            itemGroup.add(ItemRegistry.POTATO_SOUP);
        });


    }
}
