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
				Equipe.testLoc(p,"Guerrier");	
			}
			else if(args[1].equals("Archer"))
			{
				Equipe.testLoc(p,"Archer");	
			}
			else if(args[1].equals("Eclaireur"))
			{
				Equipe.testLoc(p,"Eclaireur");
			}
			else if(args[1].equals("Berserker"))
			{
				Equipe.testLoc(p,"Berserker");	
			}
			else if(args[1].equals("Guerisseur"))
			{
				Equipe.testLoc(p,"Guerisseur");	
			}
			else
			{
				p.sendMessage("§4Tu dois renseigner le nom de ton kit pour en obtenir un kit");
			}
		}
		return true;
	}
	
	public static void kit(Player p,String kit)
	{
		if(kit.equals("Guerrier"))
		{
			new Guerrier(p);	
		}
		else if(kit.equals("Archer"))
		{
			new Archer(p);			
		}
		else if(kit.equals("Eclaireur"))
		{
			new Eclaireur(p);			
		}
		else if(kit.equals("Berserker"))
		{
			new Berserker(p);	
		}
		else if(kit.equals("Guerisseur"))
		{
			new Guerisseur(p);			
		}
	}
}