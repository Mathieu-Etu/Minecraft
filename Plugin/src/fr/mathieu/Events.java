package fr.mathieu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener{
	
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		Player player = e.getPlayer(); //Cr�er la variable p.
		player.sendMessage(ChatColor.DARK_GREEN + "Bienvenue � toi !"); //Envoyer un message priv� au joueur
		Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + ChatColor.DARK_RED + "a rejoint le serveur !"); //Envoyer un message public qui dit que le joueur p a rejoint le serveur
	}

}
