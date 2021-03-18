package fr.mathieu;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Equipe implements CommandExecutor{
	
	public static boolean testLoc(Player p,String kit)
	{
		Location zp = p.getLocation();
		Location el1 = Main.liste.get(0).getL1();
		Location el2 = Main.liste.get(0).getL2();
		
		if(Zone.betweenX( zp , el1, el2) && (Zone.betweenZ( zp , el1, el2)))
		{
			CommandKit.kit(p,kit);
		}
		else
		{
			p.sendMessage("§4Vous n'êtes pas dans une zone de kit : "+zp);
		}
		return true;
	}
	
	

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) 
	{
		if(sender instanceof Player)
		{
			if(arg3[1].equals("join"))
			{
				Player p = (Player) sender;
				if(arg3[0].equals("rouge"))
				{
					Main.rouge.addPlayer(p);
					p.sendMessage("§4Equipe rouge rejointe");
				}
				else if(arg3[0].equals("bleu"))
				{
					Main.bleue.addPlayer(p);
					p.sendMessage("§4Equipe bleue rejointe");
				}
				else
				{
					p.sendMessage("§4La commande est mauvaise");
				}
			}
		}
		return true;
	}

}
