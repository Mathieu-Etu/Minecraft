package fr.mathieu;

import java.util.ArrayList;

import org.bukkit.Location;

public class Zone {
	
	private Location x;
	private Location y;
	
	
	public Zone(Location x, Location y)
	{
		this.x=x;
		this.y=y;
	}
	
	public static boolean betweenX(Location p, Location x, Location y)
	{
		int x1 = x.getBlockX();
		int x2 = y.getBlockX();
		int xp = p.getBlockX();
				
		int maxX = Math.max(x1, x2);
		int minX = Math.min(x1, x2);
		
		
		if( (xp>=minX && xp<=maxX) )
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public static boolean betweenZ(Location p, Location x, Location y)
	{
		int z1 = x.getBlockZ();
		int z2 = y.getBlockZ();
		int xp = p.getBlockZ();
		
		int maxZ = Math.max(z1, z2);
		int minZ = Math.min(z1, z2);
		
		if( (xp>=minZ && xp<=maxZ) )
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public Location getL1()
	{
		return x;
	}
	
	public Location getL2()
	{
		return y;
	}

}
