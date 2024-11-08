package work.constt.vein.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static work.constt.vein.Vein.MOD_ID;


public class ItemRegistry {

    public static final Item RAW_TURTLE_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())),
            "raw_turtle_meat"
    );

    public static final Item COOKED_TURTLE_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build())),
            "cooked_turtle_meat"
    );

    // SQUID
    public static final Item RAW_CALAMARI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())),
            "raw_calamari"
    );

    public static final Item COOKED_CALAMARI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).build())),
            "cooked_calamari"
    );

    public static final Item RAW_HORSE_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())),
            "raw_horse_meat"
    );

    public static final Item COOKED_HORSE_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(7).build())),
            "cooked_horse_meat"
    );

    // DOLPHIN
    public static final Item RAW_MAHI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())),
            "raw_mahi"
    );

    public static final Item COOKED_MAHI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build())),
            "cooked_mahi"
    );

    public static final Item POISONED_MAHI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6 * 20, 1), 1.0f).build())),
            "poisoned_mahi"
    );

    // PARROT /  BAT
    public static final Item RAW_PANIKI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).build())),
            "raw_paniki"
    );

    public static final Item COOKED_PANIKI = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build())),
            "cooked_paniki"
    );

    public static final Item RAW_CAT_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())),
            "raw_cat_meat"
    );

    public static final Item COOKED_CAT_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).build())),
            "cooked_cat_meat"
    );

    public static final Item RAW_FOX_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).build())),
            "raw_fox_meat"
    );

    public static final Item COOKED_FOX_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build())),
            "cooked_fox_meat"
    );

    public static final Item RAW_DOG_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(3).build())),
            "raw_dog_meat"
    );

    public static final Item COOKED_DOG_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(5).build())),
            "cooked_dog_meat"
    );

    public static final Item RAW_BEAR_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).build())),
            "raw_bear_meat"
    );

    public static final Item COOKED_BEAR_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).build())),
            "cooked_bear_meat"
    );

    public static final Item RAW_PANDA_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).build())),
            "raw_panda_meat"
    );

    public static final Item COOKED_PANDA_MEAT = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(4).build())),
            "cooked_panda_meat"
    );

    public static final Item POTATO_SOUP = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).build())),
            "potato_soup"
    );

    public static final Item CARROT_SOUP = register(
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).build())),
            "carrot_soup"
    );


    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final RegistryKey<ItemGroup> V_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "item_group"));
    public static final ItemGroup V_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.DIRT))
            .displayName(Text.translatable("itemGroup.vein"))
            .build();

    public static void initialize() {}
}
