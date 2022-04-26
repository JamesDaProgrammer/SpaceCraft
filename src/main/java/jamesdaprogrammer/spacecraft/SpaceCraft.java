package jamesdaprogrammer.spacecraft;

import com.mojang.logging.LogUtils;
import jamesdaprogrammer.spacecraft.registry.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SpaceCraft.MOD_ID)
public class SpaceCraft {
    public static final String MOD_ID = "spacecraft";

    // directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpaceCraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("spacecraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHEESE.get());
        }
    };
}
