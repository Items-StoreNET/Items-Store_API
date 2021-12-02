package net.items.store.minigames.api;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MiniGame extends AbstractMiniGame {

    private static ExecutorService executorService;
    private static AbstractMiniGame instance;
    private static JavaPlugin javaPlugin;

    static {
        executorService = Executors.newCachedThreadPool();

        if(instance == null){
            instance = new MiniGame();
        }
    }

    public static AbstractMiniGame getInstance() {
        return instance;
    }

    public static ExecutorService getExecutorService() {
        return executorService;
    }

    public static void setJavaPlugin(JavaPlugin javaPlugin) {
        MiniGame.javaPlugin = javaPlugin;
    }

    public static JavaPlugin getJavaPlugin() {
        return javaPlugin;
    }
}
