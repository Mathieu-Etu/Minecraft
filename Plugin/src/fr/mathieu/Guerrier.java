package fr.mathieu;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Guerrier{
	
	@SuppressWarnings("deprecation")
	public Guerrier(Player p)
	{	
		
		Inventory inventory = p.getInventory();
		
		inventory.clear();
		
		ItemStack pelle = new ItemStack(Material.GOLDEN_SHOVEL, 1);
		ItemStack pommes = new ItemStack(Material.GOLDEN_APPLE, 10);
		ItemStack blocs = new ItemStack(Material.SAND, 20);
		

		
		ItemStack epee = new ItemStack(Material.STONE_SWORD, 1);
		ItemStack shield = new ItemStack(Material.SHIELD, 1);
		
		ItemStack casque = new ItemStack(Material.IRON_HELMET, 1);
		ItemStack plastron = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemStack jambes = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemStack pieds = new ItemStack(Material.IRON_BOOTS, 1);
		
		ItemMeta customEpee = epee.getItemMeta();
		customEpee.addEnchant(Enchantment.DURABILITY,100, true);
		customEpee.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,new AttributeModifier(new UUID(1,10000), "generic.attack_speed",100,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
		customEpee.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",3,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
		epee.setItemMeta(customEpee);
		
		ItemMeta cS = shield.getItemMeta();
		cS.addEnchant(Enchantment.DURABILITY, 100, true);
		shield.setItemMeta(cS);
		
		ItemMeta cC = casque.getItemMeta();
		cC.addEnchant(Enchantment.DURABILITY, 100, true);
		cC.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		casque.setItemMeta(cC);
		ItemMeta cP = plastron.getItemMeta();
		cP.addEnchant(Enchantment.DURABILITY, 100, true);
		cP.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		cP.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",3,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.CHEST));
		plastron.setItemMeta(cP);
		ItemMeta cJ = jambes.getItemMeta();
		cJ.addEnchant(Enchantment.DURABILITY, 100, true);
		cJ.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		jambes.setItemMeta(cJ);
		ItemMeta cPi = pieds.getItemMeta();
		cPi.addEnchant(Enchantment.DURABILITY, 100, true);
		cPi.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		pieds.setItemMeta(cPi);
		

		p.setMaxHealth(30);
		p.setHealth(30);
		
		
		p.getInventory().setItem(0, epee);
		p.getInventory().setItemInOffHand(shield);
		p.getInventory().setItem(1, pelle);
		p.getInventory().setItem(2, pommes);
		p.getInventory().setItem(3, blocs);
		
		
		p.getInventory().setItem(4, casque);
		p.getInventory().setItem(5, plastron);
		p.getInventory().setItem(6, jambes);
		p.getInventory().setItem(7, pieds);
		
		int pos = ListeJoueur.listeJ.indexOf(p.getName());
		ListeJoueur.listeK.set(pos, 1);
		
		p.sendMessage("§1Voici ton incroyable §4kit §1de Guerrier !");
		Bukkit.broadcastMessage("§6"+p.getName() + " §1a reçu un §4kit §1de Guerrier");
	}


}
