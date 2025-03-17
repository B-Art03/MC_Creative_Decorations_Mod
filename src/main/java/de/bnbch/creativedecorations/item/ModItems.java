package de.bnbch.creativedecorations.item;

import de.bnbch.creativedecorations.CreativeDecorationsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreativeDecorationsMod.MOD_ID);

    public static final RegistryObject<Item> Antique_Red_Brick = ITEMS.register("Antique Red Brick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
