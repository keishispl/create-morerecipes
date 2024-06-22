package io.github.keishispl;

import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;

public class CreateMoreRecipes implements ModInitializer {
    public static final String ID = "createmorerecipes";

    @Override
    public void onInitialize() {
        AllItems.register();
        LoggerFactory.getLogger(ID).info("[Create MoreRecipes] Loading recipes..");
    }
}