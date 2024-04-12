package dev.igao.seasonpassplugin.data;

import lombok.Data;

@Data
public class Mission {
    private String name;
    private String description;
    private int xpReward;
    private boolean completed;

    public Mission(String name, String description, int xpReward) {
        this.name = name;
        this.description = description;
        this.xpReward = xpReward;
        this.completed = false;
    }
}
