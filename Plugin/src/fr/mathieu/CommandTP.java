package fr.mathieu;





import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;




public class CommandTP implements CommandExecutor {

	private Location setsp=null;
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		
		if(sender instanceof Player && label.equals("spawn"))
		{
			Player p = (Player) sender;
			if(setsp==null)
			{
				Location spawn = new Location(p.getWorld(),0, 80, 0);
				p.teleport(spawn);
			}
			else
			{
				Location spawn = new Location(p.getWorld(),setsp.getX(), setsp.getY(), setsp.getZ());
				p.teleport(spawn);
			}
			p.sendMessage("Vous avez été téléporté au spawn");
			
		}
		if(sender instanceof Player && label.equals("setspawn"))
		{
			Player p = (Player) sender;
			Location locp = p.getLocation();
			double px = locp.getX();
			double py = locp.getY();
			double pz = locp.getZ();
			this.setsp = new Location(p.getWorld(),px,py,pz);
			p.sendMessage("Vous avez enregistré le setspawn");
		}
		if(sender instanceof Player && label.equals("drapeau"))
		{
			if(arg3[0].equals("rouge"))
			{
				Player p = (Player) sender;
				ItemStack banner = new ItemStack(Material.RED_BANNER,1);			
				p.getInventory().addItem(banner);
			}
			else if(arg3[0].equals("bleu"))
			{
				Player p = (Player) sender;
				ItemStack banner = new ItemStack(Material.BLUE_BANNER,1);			
				p.getInventory().addItem(banner);
			}
			else if(arg3[0].equals("rendre"))
			{
				Player p = (Player) sender;
				
			}
			else
			{
				Player p = (Player) sender;
				p.sendMessage("Vous devez renseigner une couleur !");
			}
			
		}
		
		
		return false;
	}

}
