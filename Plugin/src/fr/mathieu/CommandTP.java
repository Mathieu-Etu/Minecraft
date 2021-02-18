package fr.mathieu;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTP implements CommandExecutor {

	private Location seth=null;
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		
		if(sender instanceof Player && label.equals("spawn"))
		{
			Player p = (Player) sender;
			Location spawn = new Location(p.getWorld(),0, 100, 0);
			p.sendMessage("Vous avez été téléporté au spawn");
			p.teleport(spawn);
		}
		
		if(sender instanceof Player && label.equals("sethome"))
		{
			Player p = (Player) sender;
			Location locp = p.getLocation();
			double px = locp.getX();
			double py = locp.getY();
			double pz = locp.getZ();
			this.seth = new Location(p.getWorld(),px,py,pz);
			p.sendMessage("Vous avez enregistré votre sethome");
		}
		if(sender instanceof Player && label.equals("home"))
		{
			Player p = (Player) sender;
			if(this.seth!=null)
			{
				p.teleport(seth);
			}
			else
			{
				p.sendMessage("Pas de sethome enregistré");
			}
			
		}
		return false;
	}

}
