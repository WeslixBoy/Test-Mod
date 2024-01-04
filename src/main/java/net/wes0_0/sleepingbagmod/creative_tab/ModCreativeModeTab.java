package net.wes0_0.sleepingbagmod.creative_tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wes0_0.sleepingbagmod.SleepingBagsMod;
import net.wes0_0.sleepingbagmod.items.ModItems;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SleepingBagsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SLEEPINGBAGS_CREATIVE_MODE_TAB = CREATIVE_MODE_TABS.register("test_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.test_mod"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUBY.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
