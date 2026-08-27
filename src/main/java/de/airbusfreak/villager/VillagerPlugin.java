package de.airbusfreak.villager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * TownsAndNations VillagerPlugin
 * Ein Spigot/Paper Plugin für Towns and Nations
 * - Villager als Bewohner zählen
 * - Tägliche Zahlungen verwalten
 */
public class VillagerPlugin extends JavaPlugin {

    private static VillagerPlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("§a================================");
        getLogger().info("§aTownsAndNations VillagerPlugin");
        getLogger().info("§aVersion: " + getDescription().getVersion());
        getLogger().info("§a================================");

        // Konfiguration laden
        saveDefaultConfig();

        // Commands registrieren
        registerCommands();

        // Listener registrieren
        registerListeners();

        getLogger().info("§aPlugin erfolgreich aktiviert!");
    }

    @Override
    public void onDisable() {
        getLogger().info("§cPlugin deaktiviert!");
    }

    private void registerCommands() {
        // Commands werden hier registriert
        // getCommand("villager").setExecutor(new VillagerCommand(this));
    }

    private void registerListeners() {
        // Listener werden hier registriert
        // Bukkit.getPluginManager().registerEvents(new VillagerListener(this), this);
    }

    public static VillagerPlugin getInstance() {
        return instance;
    }
}