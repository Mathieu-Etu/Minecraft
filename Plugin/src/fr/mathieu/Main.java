package fr.mathieu;


import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Chest;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;



public class Main extends JavaPlugin{
	
	private static ScoreboardManager manager = Bukkit.getScoreboardManager();
	private static Scoreboard board = manager.getNewScoreboard();

	static Team rouge = board.registerNewTeam("Rouge");
	static Team bleue = board.registerNewTeam("Bleue");
	
	public static Location zonerouge_1;
	public static Location zonerouge_2;
	
	public static Location zonebleue_1;
	public static Location zonebleue_2;
	
	public static World world=Bukkit.getServer().getWorld("World");
	
	public static ArrayList<Zone> liste = new ArrayList<Zone>();
	
	public void onEnable() 
	{
		liste.add(new Zone(new Location(world,-66.512,64,188.695),new Location(world,-59.532,64,198.028)));
		
		Bukkit.getConsoleSender().sendMessage("Merci d'avoir installé mon plugin.");
		rouge.setAllowFriendlyFire(isNaggable());
		bleue.setAllowFriendlyFire(isNaggable());
		getCommand("kit").setExecutor(new CommandKit());
		getCommand("spawn").setExecutor(new CommandTP());
		getCommand("setspawn").setExecutor(new CommandTP());
		getCommand("drapeau").setExecutor(new CommandTP());
		getCommand("equipe").setExecutor(new Equipe());
		getServer().getPluginManager().registerEvents(new Events(), this);
	}
	
	public void onDisable() 
	{
		Bukkit.getConsoleSender().sendMessage("A la prochaine !");
	}
	
	
    
	
}
