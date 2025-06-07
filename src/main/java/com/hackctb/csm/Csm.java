package com.hackctb.csm;

import com.hackctb.csm.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

import static net.minecraft.item.Items.register;

public class Csm implements ModInitializer {

    public static final String MOD_ID = "csm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
//        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();

    }
}
