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
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class Guerisseur {

	@SuppressWarnings("deprecation")
	public Guerisseur(Player p)
	{
		Inventory inventory = p.getInventory();
		
		inventory.clear();	
		
		ItemStack pelle = new ItemStack(Material.GOLDEN_SHOVEL, 1);
		ItemStack pommes = new ItemStack(Material.GOLDEN_APPLE, 10);
		ItemStack blocs = new ItemStack(Material.SAND, 20);
		
		ItemStack arc = new ItemStack(Material.BOW, 1);
		ItemStack flechesR = new ItemStack(Material.TIPPED_ARROW, 64);
		ItemStack flechesH = new ItemStack(Material.TIPPED_ARROW, 64);
		ItemStack flechesS = new ItemStack(Material.TIPPED_ARROW, 64);
		ItemStack epee = new ItemStack(Material.WOODEN_SWORD, 1);
		ItemStack potionP = new ItemStack(Material.LINGERING_POTION,10);
		ItemStack potionJ = new ItemStack(Material.SPLASH_POTION,10);
		
		ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
		ItemStack plastron = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemStack jambes = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
		
		PotionMeta pM = (PotionMeta) potionP.getItemMeta();
		pM.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL));
		
		potionP.setItemMeta(pM);
		PotionMeta pJ = (PotionMeta) potionJ.getItemMeta();
		pJ.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL));
		potionJ.setItemMeta(pJ);
		
		PotionMeta frM = (PotionMeta) flechesR.getItemMeta();
		frM.setBasePotionData(new PotionData(PotionType.REGEN));
		flechesR.setItemMeta(frM);
		
		PotionMeta frH = (PotionMeta) flechesH.getItemMeta();
		frH.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL));
		flechesH.setItemMeta(frH);
		
		PotionMeta frS = (PotionMeta) flechesS.getItemMeta();
		frS.setBasePotionData(new PotionData(PotionType.SPEED));
		flechesS.setItemMeta(frS);
		
		ItemMeta cA = arc.getItemMeta();
		cA.addEnchant(Enchantment.DURABILITY, 100, true);
		cA.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		cA.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",-100,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
		arc.setItemMeta(cA);
		ItemMeta cE = epee.getItemMeta();
		cE.addEnchant(Enchantment.DURABILITY, 100, true);
		cE.addEnchant(Enchantment.KNOCKBACK,2,true);
		epee.setItemMeta(cE);
		
		ItemMeta cC = casque.getItemMeta();
		cC.addEnchant(Enchantment.DURABILITY, 100, true);
		casque.setItemMeta(cC);
		ItemMeta cP = plastron.getItemMeta();
		cP.addEnchant(Enchantment.DURABILITY, 100, true);
		plastron.setItemMeta(cP);
		ItemMeta cJ = jambes.getItemMeta();
		cJ.addEnchant(Enchantment.DURABILITY, 100, true);
		jambes.setItemMeta(cJ);
		ItemMeta cPi = pieds.getItemMeta();
		cPi.addEnchant(Enchantment.DURABILITY, 100, true);
		cPi.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,new AttributeModifier(new UUID(1,1000), "generic.movement_speed",0.01,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.FEET));
		pieds.setItemMeta(cPi);
		
		p.setMaxHealth(14);
		p.setHealth(14);
		
		p.getInventory().setItem(0, epee);
		p.getInventory().setItem(2, pelle);
		p.getInventory().setItem(3, pommes);
		p.getInventory().setItem(4, blocs);
		
		p.getInventory().setItem(1, arc);
		p.getInventory().setItem(5, potionP);
		p.getInventory().setItem(6, potionJ);
		p.getInventory().setItem(7, jambes);
		p.getInventory().setItem(8, pieds);
		p.getInventory().addItem(casque);
		p.getInventory().addItem(plastron);
		p.getInventory().addItem(flechesH);
		p.getInventory().addItem(flechesR);
		p.getInventory().addItem(flechesS);
		
		int pos = ListeJoueur.listeJ.indexOf(p.getName());
		ListeJoueur.listeK.set(pos, 5);
		
		p.sendMessage("§1Voici ton incroyable §4kit §1de Guerisseur !");
		Bukkit.broadcastMessage("§4"+p.getName() + " §1a reçu un §4kit §1de Guerisseur");
	}
}
