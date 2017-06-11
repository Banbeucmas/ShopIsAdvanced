package me.banbeucmas;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShopIsAdvanced extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Plugin is enabled, enjoy");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
