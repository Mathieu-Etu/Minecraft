package fr.djesus.fight;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() 
	{
		System.out.println("Test de spigot activé");
		this.getCommand("kit").setExecutor(new CmdKit());
		getServer().getPluginManager().registerEvents(new Events(), this);
	}

	public void onDisable() 
	{
		System.out.println("Oh non le serveur s'éteiiinnnnt....");
	}	
}
