package dev.igao.seasonpassplugin;

import dev.igao.seasonpassplugin.managers.LevelManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class SeasonPassPlugin extends JavaPlugin {

    private LevelManager levelManager;

    @Override
    public void onEnable() {
        this.levelManager = new LevelManager();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SeasonPassPlugin getInstance() {
        return getPlugin(SeasonPassPlugin.class);
    }
}
