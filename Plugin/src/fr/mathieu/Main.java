package fr.mathieu;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin{
	
	
	public void onEnable() 
	{
		Bukkit.getConsoleSender().sendMessage("Merci d'avoir installé mon plugin.");
		getCommand("kit").setExecutor(new CommandKit());
		getCommand("spawn").setExecutor(new CommandTP());
		getCommand("setspawn").setExecutor(new CommandTP());
		getCommand("drapeau").setExecutor(new CommandTP());
		getCommand("equipe").setExecutor(new CommandTP());
		getServer().getPluginManager().registerEvents(new Events(), this);
	}
	
	public void onDisable() 
	{
		Bukkit.getConsoleSender().sendMessage("A la prochaine !");
	}
	
	
    
	
}
