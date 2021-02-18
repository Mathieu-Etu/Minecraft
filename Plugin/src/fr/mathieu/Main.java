package fr.mathieu;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() 
	{
		Bukkit.getConsoleSender().sendMessage("Merci d'avoir install� mon plugin.");
		getCommand("kit").setExecutor(new CommandKit());
		getCommand("spawn").setExecutor(new CommandTP());
		getServer().getPluginManager().registerEvents(new Events(), this);
	}
	
	public void onDisable() 
	{
		Bukkit.getConsoleSender().sendMessage("A la prochaine !");
	}
	
}
