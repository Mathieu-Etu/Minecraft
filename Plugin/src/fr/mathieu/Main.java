package fr.mathieu;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() 
	{
		Bukkit.getConsoleSender().sendMessage("Merci d'avoir installé mon plugin.");
		this.getCommand("kit").setExecutor(new Kit());
		getServer().getPluginManager().registerEvents(new Events(), this);
	}

	public void onDisable() 
	{
		Bukkit.getConsoleSender().sendMessage("A la prochaine !");
	}
	
}
