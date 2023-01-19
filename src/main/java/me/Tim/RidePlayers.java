package me.Tim;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;



public final class RidePlayers extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "The plugin to ride players is know enabled");
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "The plugin to ride players is now disabled");
    }

    @EventHandler
    public void onClick(PlayerInteractEntityEvent e) {
        if (!(e.getRightClicked() instanceof Player)) {return;}

        e.getRightClicked().addPassenger(e.getPlayer());

    }
}
