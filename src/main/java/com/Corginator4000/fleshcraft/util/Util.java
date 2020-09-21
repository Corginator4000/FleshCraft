package com.Corginator4000.fleshcraft.util;

import com.Corginator4000.fleshcraft.FleshCraft;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

public class Util {

    public static final String RESOURCE = FleshCraft.MOD_ID.toLowerCase(Locale.US);

    public static Logger getLogger(String type) {
        String log = FleshCraft.MOD_ID;

        return LogManager.getLogger(log + "-" + type);
    }

    /**
     * Returns the given Resource prefixed with FleshCraft resource location. Use this function instead of hardcoding
     * resource locations.
     */
    public static String resource(String res) {
        return String.format("%s:%s", RESOURCE, res);
    }

    public static ResourceLocation getResource(String res) {
        return new ResourceLocation(RESOURCE, res);
    }

    public static ModelResourceLocation getModelResource(String res, String variant) {
        return new ModelResourceLocation(resource(res), variant);
    }

    public static ResourceLocation getModifierResource(String res) {
        return getResource("models/item/modifiers/" + res);
    }

}
