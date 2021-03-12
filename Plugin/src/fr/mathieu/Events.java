package fr.mathieu;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;



public class Events implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		player.getInventory().clear();
		event.setJoinMessage(ChatColor.GOLD+player.getName()+"§a a rejoint le serveur");
		ListeJoueur.listeJ.add(player.getName());
		ListeJoueur.listeK.add(1);
		new Guerrier(player);
	}
	
	public void onQuit(PlayerQuitEvent event)
	{
		Player player = event.getPlayer();
		player.getInventory().clear();
		event.setQuitMessage(ChatColor.GOLD+player.getName()+"§a a quitté le serveur");
		int pos = ListeJoueur.listeJ.indexOf(player.getName());
		ListeJoueur.listeK.remove(pos);
		ListeJoueur.listeJ.remove(player.getName());
	}
	

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) 
	{
		Player p = e.getEntity();
		String nom = p.getName();
		Player killer = p.getKiller();
		
		if(p.getInventory().contains(Material.RED_BANNER))
		{
			Bukkit.getServer().broadcastMessage("§aLa Bannière §4Rouge §aest tombée ! §6"+p.getName()+"§a ne l'a plus !");
			Bukkit.getServer().broadcastMessage("§6"+killer.getName()+"§a détient la bannière !");
			ItemStack banner = new ItemStack(Material.RED_BANNER,1);
			killer.getInventory().addItem(banner);
		}
		if(p.getInventory().contains(Material.BLUE_BANNER))
		{
			Bukkit.getServer().broadcastMessage("§aLa Bannière §1BLEUE §aest tombée ! §6"+p.getName()+"§a ne l'a plus !");
			Bukkit.getServer().broadcastMessage("§6"+killer.getName()+"§a détient la bannière !");
			ItemStack banner = new ItemStack(Material.BLUE_BANNER,1);
			killer.getInventory().addItem(banner);
		}
		List<ItemStack> liste = e.getDrops();
		liste.clear();
		if(p instanceof Player && killer!= null && killer instanceof Player)
		{
			String nomK = killer.getName();
			e.setDeathMessage("§6"+nom+"§a a été tué par §6"+nomK);
			
		}
		else
		{
			e.setDeathMessage("§6"+nom+"§a est Mort");
		}			
	}
	
	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent e)
	{
		Player p = e.getPlayer();
		String nom = p.getName();
		int pos = ListeJoueur.listeJ.indexOf(nom);
		int kit = ListeJoueur.listeK.get(pos);
		
		if(kit == 0)
		{
			new Guerrier(p);
		}
		else if(kit == 1)
		{
			new Guerrier(p);
		}
		else if(kit == 2)
		{
			new Archer(p);
		}
		else if(kit == 3)
		{
			new Eclaireur(p);
		}
		else if(kit == 4)
		{
			new Berserker(p);
		}
		else if(kit == 5)
		{
			new Guerisseur(p);
		}	
	}
}
