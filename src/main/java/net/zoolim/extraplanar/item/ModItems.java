package net.zoolim.extraplanar.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.zoolim.extraplanar.ExtraplanarEntities;

public class ModItems {

    public static final Item PRINCELY_SHARD = registerItem("princely_shard", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ExtraplanarEntities.MOD_ID,"princely_shard")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExtraplanarEntities.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraplanarEntities.LOGGER.info("Registering Mod Items for " + ExtraplanarEntities.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PRINCELY_SHARD);
        });
    }
}
