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

public class Berserker {

	@SuppressWarnings("deprecation")
	public Berserker(Player p)
	{
		Inventory inventory = p.getInventory();
		
		inventory.clear();
		
		ItemStack pelle = new ItemStack(Material.GOLDEN_SHOVEL, 1);
		ItemStack pommes = new ItemStack(Material.GOLDEN_APPLE, 10);
		ItemStack blocs = new ItemStack(Material.SAND, 20);
		
		ItemStack epee = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING,1);
		
		ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
		
		ItemMeta cE = epee.getItemMeta();
		cE.addEnchant(Enchantment.DURABILITY, 100,true);
		cE.addEnchant(Enchantment.DAMAGE_ALL, 2,true);
		cE.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,new AttributeModifier(new UUID(1,10000), "generic.attack_speed",100,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
		cE.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",2.5,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
		epee.setItemMeta(cE);
		
		ItemMeta cPi = pieds.getItemMeta();
		cPi.addEnchant(Enchantment.DURABILITY, 100, true);
		pieds.setItemMeta(cPi);
		
		ItemMeta cT = totem.getItemMeta();
		cT.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,new AttributeModifier(new UUID(1,1000), "generic.movement_speed",0.02,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.OFF_HAND));
		totem.setItemMeta(cT);
		
		p.setMaxHealth(20);
		p.setHealth(20);
		
		p.getInventory().setItemInOffHand(totem);
		p.getInventory().setItem(0, epee);
		p.getInventory().setItem(2, pelle);
		p.getInventory().setItem(1, pommes);
		p.getInventory().setItem(3, blocs);
		
		p.getInventory().setItem(7, pieds);
		
		int pos = ListeJoueur.listeJ.indexOf(p.getName());
		ListeJoueur.listeK.set(pos, 4);
		
		p.sendMessage("§1Voici ton incroyable §4kit §1de Berserker !");
		Bukkit.broadcastMessage("§6"+p.getName() + " §1a reçu un §4kit §1de Berserker");
	}
}
