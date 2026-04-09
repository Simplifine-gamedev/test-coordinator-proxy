package com.orca.testcoordinatorproxy;

import net.fabricmc.api.ModInitializer;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCoordinatorProxy implements ModInitializer {
    public static final String MOD_ID = "test-coordinator-proxy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final FoodComponent DIAMOND_APPLE_FOOD = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1), 1.0f)
            .build();

    public static final Item DIAMOND_APPLE = new Item(new Item.Settings()
            .food(DIAMOND_APPLE_FOOD)
            .maxCount(64));

    @Override
    public void onInitialize() {
        LOGGER.info("Test Coordinator Proxy initialized!");

        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "diamond_apple"), DIAMOND_APPLE);
        LOGGER.info("Registered diamond_apple item!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.add(DIAMOND_APPLE);
        });
    }
}
