package fr.djesus.fight;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import net.minecraft.server.v1_8_R3.ItemStack;
import net.minecraft.server.v1_8_R3.Material;

public class CmdKit implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			Inventory inv = p.getInventory();
			ItemStack steak = new ItemStack(Material.AR, 32);
		}
		return true;
	}
}
