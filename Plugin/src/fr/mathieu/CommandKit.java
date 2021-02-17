package fr.mathieu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;



public class CommandKit implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			Inventory inventory = p.getInventory();
			
			ItemStack pelle = new ItemStack(Material.GOLDEN_SHOVEL, 1);
			ItemStack pommes = new ItemStack(Material.GOLDEN_APPLE, 10);
			ItemStack blocs = new ItemStack(Material.SAND, 20);

			
			if(args[0].equals("Guerrier"))
			{
				inventory.clear();
				
				ItemStack epee = new ItemStack(Material.STONE_SWORD, 1);
				ItemStack shield = new ItemStack(Material.SHIELD, 1);
				
				ItemStack casque = new ItemStack(Material.IRON_HELMET, 1);
				ItemStack plastron = new ItemStack(Material.IRON_CHESTPLATE, 1);
				ItemStack jambes = new ItemStack(Material.IRON_LEGGINGS, 1);
				ItemStack pieds = new ItemStack(Material.IRON_BOOTS, 1);
				
				
				p.getInventory().setItem(0, epee);
				p.getInventory().setItem(2, pelle);
				p.getInventory().setItem(3, pommes);
				p.getInventory().setItem(4, blocs);
				
				p.getInventory().setItem(1, shield);
				p.getInventory().setItem(5, casque);
				p.getInventory().setItem(6, plastron);
				p.getInventory().setItem(7, jambes);
				p.getInventory().setItem(8, pieds);
				
				p.sendMessage("§1Voici ton incroyable §4kit §1de Guerrier !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1de Guerrier");
			}
			else if(args[0].equals("Archer"))
			{
				inventory.clear();	
				
				ItemStack arc = new ItemStack(Material.BOW, 1);
				ItemStack fleches = new ItemStack(Material.ARROW, 128);			
				ItemStack epee = new ItemStack(Material.WOODEN_SWORD, 1);
				
				ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
				ItemStack plastron = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				ItemStack jambes = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
				
				p.getInventory().setItem(0, epee);
				p.getInventory().setItem(2, pelle);
				p.getInventory().setItem(3, pommes);
				p.getInventory().setItem(4, blocs);
				
				p.getInventory().setItem(1, arc);
				p.getInventory().setItem(5, casque);
				p.getInventory().setItem(6, plastron);
				p.getInventory().setItem(7, jambes);
				p.getInventory().setItem(8, pieds);
				p.getInventory().addItem(fleches);
				
				p.sendMessage("§1Voici ton incroyable §4kit §1d'Archer !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1d'Archer");
			}
			else if(args[0].equals("Eclaireur"))
			{
				inventory.clear();
				
				ItemStack arc = new ItemStack(Material.BOW, 1);
				ItemStack fleches = new ItemStack(Material.ARROW, 32);			
				ItemStack epee = new ItemStack(Material.IRON_SWORD, 1);
				
				ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
				ItemStack plastron = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				ItemStack jambes = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
				
				p.getInventory().setItem(0, epee);
				p.getInventory().setItem(2, pelle);
				p.getInventory().setItem(3, pommes);
				p.getInventory().setItem(4, blocs);
				
				p.getInventory().setItem(1, arc);
				p.getInventory().setItem(5, casque);
				p.getInventory().setItem(6, plastron);
				p.getInventory().setItem(7, jambes);
				p.getInventory().setItem(8, pieds);
				p.getInventory().addItem(fleches);
				
				p.sendMessage("§1Voici ton incroyable §4kit §1d'Eclaireur !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1d'Eclaireur");
			}
			else if(args[0].equals("Berserker"))
			{
				inventory.clear();
				
				ItemStack epee = new ItemStack(Material.DIAMOND_SWORD, 1);
				
				ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
				ItemStack plastron = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				ItemStack jambes = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
				
				
				p.getInventory().setItem(0, epee);
				p.getInventory().setItem(2, pelle);
				p.getInventory().setItem(1, pommes);
				p.getInventory().setItem(3, blocs);
				
				p.getInventory().setItem(4, casque);
				p.getInventory().setItem(5, plastron);
				p.getInventory().setItem(6, jambes);
				p.getInventory().setItem(7, pieds);
				
				p.sendMessage("§1Voici ton incroyable §4kit §1de Berserker !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1de Berserker");
			}
			else
			{
				p.sendMessage("§4Tu dois renseigner le nom de ton kit pour en obtenir un");
			}

		}
		return true;
	}
}