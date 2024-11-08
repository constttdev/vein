package work.constt.vein.utils;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryWrapper;
import work.constt.vein.registries.BlockRegistry;
import work.constt.vein.registries.ItemRegistry;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;


public class VeinLangGenerator extends FabricLanguageProvider {

    public VeinLangGenerator(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(BlockRegistry.DEAD_BUTTON, "Dead Button");
        translationBuilder.add(BlockRegistry.DEAD_STAIR, "Dead Stair");
        translationBuilder.add(BlockRegistry.DEAD_LOG, "Dead Log");
        translationBuilder.add(BlockRegistry.DEAD_PLANK, "Dead Plank");
        translationBuilder.add(BlockRegistry.DEAD_SLAB, "Dead Slab");

        translationBuilder.add(ItemRegistry.RAW_BEAR_MEAT,"Raw Bear Meat");
        translationBuilder.add(ItemRegistry.RAW_CALAMARI,"Raw Calamari");
        translationBuilder.add(ItemRegistry.RAW_CAT_MEAT,"Raw Cat Meat");
        translationBuilder.add(ItemRegistry.RAW_DOG_MEAT,"Raw Dog Meat");
        translationBuilder.add(ItemRegistry.RAW_MAHI,"Raw Mahi");
        translationBuilder.add(ItemRegistry.RAW_PANIKI,"Raw Paniki");
        translationBuilder.add(ItemRegistry.RAW_FOX_MEAT,"Raw Fox Meat");
        translationBuilder.add(ItemRegistry.RAW_HORSE_MEAT,"Raw Horse Meat");
        translationBuilder.add(ItemRegistry.RAW_PANDA_MEAT,"Raw Panda Meat");
        translationBuilder.add(ItemRegistry.RAW_TURTLE_MEAT,"Raw Turtle Meat");

        translationBuilder.add(ItemRegistry.COOKED_BEAR_MEAT,"Cooked Bear Meat");
        translationBuilder.add(ItemRegistry.COOKED_CALAMARI,"Cooked Calamari");
        translationBuilder.add(ItemRegistry.COOKED_CAT_MEAT,"Cooked Cat Meat");
        translationBuilder.add(ItemRegistry.COOKED_DOG_MEAT,"Cooked Dog Meat");
        translationBuilder.add(ItemRegistry.COOKED_FOX_MEAT,"Cooked Fox Meat");
        translationBuilder.add(ItemRegistry.COOKED_MAHI,"Cooked Mahi");
        translationBuilder.add(ItemRegistry.COOKED_HORSE_MEAT,"Cooked Horse Meat");
        translationBuilder.add(ItemRegistry.COOKED_PANIKI,"Cooked Paniki");
        translationBuilder.add(ItemRegistry.COOKED_PANDA_MEAT,"Cooked Panda Meat");
        translationBuilder.add(ItemRegistry.COOKED_TURTLE_MEAT,"Cooked Turtle Meat");
        translationBuilder.add(ItemRegistry.POISONED_MAHI,"Poisoned Mahi");

        translationBuilder.add(ItemRegistry.CARROT_SOUP,"Carrot Soup");
        translationBuilder.add(ItemRegistry.POTATO_SOUP,"Potato Soup");

        translationBuilder.add("itemGroup.vein", "Vein");
    }
}
