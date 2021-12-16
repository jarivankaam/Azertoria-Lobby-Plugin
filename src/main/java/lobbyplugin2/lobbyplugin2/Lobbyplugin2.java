package lobbyplugin2.lobbyplugin2;

import lobbyplugin2.lobbyplugin2.commands.invisible;
import lobbyplugin2.lobbyplugin2.commands.lobby;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lobbyplugin2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[Azerlobby] has started");
        getCommand("lobby").setExecutor(new lobby());
        getCommand("invisible").setExecutor(new invisible());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Azerlobby] has stopped");
    }
}
