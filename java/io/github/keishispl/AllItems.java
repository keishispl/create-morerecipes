package io.github.keishispl;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AllItems {
    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(CreateMoreRecipes.ID, "unprocessed_netherrack"), new SequencedAssemblyItem(new Item.Settings()));
    }
}