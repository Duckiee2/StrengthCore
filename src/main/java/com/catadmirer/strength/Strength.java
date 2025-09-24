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

    @Override
    public void onEnable() {
        getLogger().info("Strength SMP plugin test version :tm:");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
