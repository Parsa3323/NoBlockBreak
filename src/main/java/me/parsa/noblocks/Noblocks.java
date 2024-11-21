package me.parsa.noblocks;

import me.parsa.noblocks.Events.NoBlockBreak;
import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class Noblocks extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(Color.GREEN + "Plugin Enabled Succsesfully");

        getServer().getPluginManager().registerEvents(new NoBlockBreak(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
