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
	}

	public void onDisable() 
	{
		System.out.println("Oh non le serveur s'éteiiinnnnt....");
	}
	
	public void onJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		
		event.setJoinMessage(ChatColor.DARK_GREEN + "Bonjour "+player.getName());
	}
	/*this.getCommand("manger").setExecutor(new CmdManger());*/
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(sender instanceof Player)
		{
		
		}
		return true;
	        
	}
	
}
