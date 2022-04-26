package jamesdaprogrammer.spacecraft.registry;

import jamesdaprogrammer.spacecraft.SpaceCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpaceCraft.MOD_ID);

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CHEESE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
