package fr.djesus.fight;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;



public class CmdKit implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			Inventory inv = p.getInventory();
			ItemStack arc = new ItemStack(Material.BOW, 1);
			ItemStack fleches = new ItemStack(Material.ARROW, 64);
			ItemStack epee = new ItemStack(Material.BOW, 1);
			ItemStack pelle = new ItemStack(Material.BOW, 1);
			ItemStack pommes = new ItemStack(Material.BOW, 1);
			
			ItemStack blocs = new ItemStack(Material.SAND, 20);
			ItemStack casque = new ItemStack(Material.BOW, 1);
			ItemStack plastron = new ItemStack(Material.BOW, 1);
			ItemStack jambes = new ItemStack(Material.BOW, 1);
			ItemStack pieds = new ItemStack(Material.BOW, 1);
			
			p.getInventory().setItem(0, epee);
			p.getInventory().setItem(1, arc);
			p.getInventory().setItem(2, pelle);
			p.getInventory().setItem(3, pommes);
			p.getInventory().setItem(4, blocs);
			
			p.getInventory().setItem(5, casque);
			p.getInventory().setItem(6, plastron);
			p.getInventory().setItem(7, jambes);
			p.getInventory().setItem(8, pieds);
			p.getInventory().setItem(9, fleches);
			
			p.sendMessage("§aVoici ton délicieux steak-frites !");
			
		}
		return true;
	}
}
