package dev.igao.seasonpassplugin.managers;

import dev.igao.seasonpassplugin.data.Level;

import java.util.HashMap;
import java.util.UUID;

public class LevelManager {
    private HashMap<UUID, Level> playerLevel = new HashMap<>();

    public void createPlayerLevel(UUID playerId) {
        playerLevel.put(playerId, new Level());
    }

    public Level getLevel(UUID playerId) {
        return playerLevel.get(playerId);
    }
}
