package dev.igao.seasonpassplugin.listeners;

import dev.igao.seasonpassplugin.SeasonPassPlugin;
import dev.igao.seasonpassplugin.managers.LevelManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class TrafficListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        final UUID uniqueId = player.getUniqueId();
        final LevelManager levelManager = SeasonPassPlugin.getInstance().getLevelManager();
        levelManager.createPlayerLevel(uniqueId);
    }
}
