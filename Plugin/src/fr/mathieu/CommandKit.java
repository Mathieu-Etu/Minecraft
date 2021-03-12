package fr.mathieu;



import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;





public class CommandKit implements CommandExecutor{


	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = Bukkit.getServer().getPlayer(args[0]);
			
			if(args[1].equals("Guerrier"))
			{
				new Guerrier(p);
			}
			else if(args[1].equals("Archer"))
			{
				new Archer(p);
			}
			else if(args[1].equals("Eclaireur"))
			{
				new Eclaireur(p);
			}
			else if(args[1].equals("Berserker"))
			{
				new Berserker(p);
			}
			else if(args[1].equals("Guerisseur"))
			{
				new Guerisseur(p);
			}
			else
			{
				p.sendMessage("§4Tu dois renseigner le nom de ton kit pour en obtenir un kit");
			}

		}
		return true;
	}
}