package com.catadmirer.strength.Functions;

import com.catadmirer.strength.Strength;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class Functions {

    public static void Lunge(Player player, Vector direction, double forwardMultiplier, double verticalOffset) {
        Vector dir = direction.clone().normalize();
        dir.multiply(forwardMultiplier);
        dir.setY(verticalOffset);
        player.setVelocity(dir);
    }

    public static void Potion(Player player, PotionEffectType potion, int duration, int level, boolean particles) {
        player.addPotionEffect(new PotionEffect(potion, duration * 20, level - 1, false, particles));
    }

    public static void Hide(Entity entity, int duration, double radius) {
        for (Player player : entity.getWorld().getPlayers()) {
            if (player.getLocation().distance(entity.getLocation()) <= radius) {
                player.hideEntity(Strength.getInstance(), entity);
            }
        }
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : entity.getWorld().getPlayers()) {
                    if (player.getLocation().distance(entity.getLocation()) <= radius) {
                        player.showEntity(Strength.getInstance(), entity);
                    }
                }
            }
        }.runTaskLater(Strength.getInstance(), duration);
    }
}
