package dev.igao.seasonpassplugin.data;

import lombok.Data;

import java.util.UUID;

@Data
public class Level {
    private int level;
    private int xp;
    private int xpToNextLevel;

    public Level() {
        this.level = 0;
        this.xp = 0;
        this.xpToNextLevel = 100;
    }

    public void addXp(int xp) {
        this.xp += xp;

        if (this.xp >= xpToNextLevel) {
            this.level++;
            this.xp = 0;
            this.xpToNextLevel = (this.level * 15) * 10;
        }
    }
}
