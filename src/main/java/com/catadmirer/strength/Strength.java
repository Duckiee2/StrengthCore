package com.catadmirer.strength;

import org.bukkit.*;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

import java.util.List;

public final class Strength extends JavaPlugin {

    private static Strength instance;

    @Override
    public void onEnable() {
        if (instance != null) {
            throw new IllegalStateException("Plugin already initialized!");
        } else {
            instance = this;
            getLogger().info("hi.");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("bye.");
    }

    public static Strength getInstance() {
        return instance;
    }
}
