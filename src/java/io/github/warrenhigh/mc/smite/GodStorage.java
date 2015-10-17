package io.github.warrenhigh.mc.smite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class GodStorage {

    List<God> godList;
    SmitePlugin plugin;

    public GodStorage(SmitePlugin plugin){
        this.plugin = plugin;
        godList = new ArrayList<>();
    }

    public void registerGod(God god){
        godList.add(god);
    }
}
