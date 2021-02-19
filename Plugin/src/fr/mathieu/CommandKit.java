package fr.mathieu;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_16_R3.Slot;



public class CommandKit implements CommandExecutor{

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			Inventory inventory = p.getInventory();
			
			ItemStack pelle = new ItemStack(Material.GOLDEN_SHOVEL, 1);
			ItemStack pommes = new ItemStack(Material.GOLDEN_APPLE, 10);
			ItemStack blocs = new ItemStack(Material.SAND, 20);

			
			if(args[0].equals("Guerrier"))
			{
				inventory.clear();
				
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
				
				p.sendMessage("§1Voici ton incroyable §4kit §1de Guerrier !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1de Guerrier");
			}
			else if(args[0].equals("Archer"))
			{
				inventory.clear();	
				
				ItemStack arc = new ItemStack(Material.BOW, 1);
				ItemStack fleches = new ItemStack(Material.ARROW, 64);			
				ItemStack epee = new ItemStack(Material.WOODEN_SWORD, 1);
				
				ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
				ItemStack plastron = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				ItemStack jambes = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
				
				ItemMeta cA = arc.getItemMeta();
				cA.addEnchant(Enchantment.DURABILITY, 100, true);
				cA.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
				cA.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",-4,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
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
				
				p.setMaxHealth(20);
				p.setHealth(20);
				
				p.getInventory().setItem(0, epee);
				p.getInventory().setItem(2, pelle);
				p.getInventory().setItem(3, pommes);
				p.getInventory().setItem(4, blocs);
				
				p.getInventory().setItem(1, arc);
				p.getInventory().setItem(5, casque);
				p.getInventory().setItem(6, plastron);
				p.getInventory().setItem(7, jambes);
				p.getInventory().setItem(8, pieds);
				p.getInventory().addItem(fleches);
				
				p.sendMessage("§1Voici ton incroyable §4kit §1d'Archer !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1d'Archer");
			}
			else if(args[0].equals("Eclaireur"))
			{
				inventory.clear();
				
				ItemStack arc = new ItemStack(Material.BOW, 1);
				ItemStack fleches = new ItemStack(Material.SPECTRAL_ARROW, 32);			
				ItemStack epee = new ItemStack(Material.IRON_SWORD, 1);
				
				ItemStack casque = new ItemStack(Material.LEATHER_HELMET, 1);
				ItemStack plastron = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				ItemStack jambes = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				ItemStack pieds = new ItemStack(Material.LEATHER_BOOTS, 1);
				
				ItemMeta cA = arc.getItemMeta();
				cA.addEnchant(Enchantment.DURABILITY, 100, true);
				cA.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",-4,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
				arc.setItemMeta(cA);
				ItemMeta cE = epee.getItemMeta();
				cE.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,new AttributeModifier(new UUID(1,10000), "generic.attack_speed",50,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
				cE.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,new AttributeModifier(new UUID(1,1000), "generic.attack_damage",4,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND));
				cE.addEnchant(Enchantment.DURABILITY, 100, true);
				cE.addEnchant(Enchantment.KNOCKBACK,2,true);
				epee.setItemMeta(cE);
				
				ItemMeta cC = casque.getItemMeta();
				cC.addEnchant(Enchantment.DURABILITY, 100, true);
				cC.addEnchant(Enchantment.OXYGEN, 100, true);
				cC.addEnchant(Enchantment.DEPTH_STRIDER, 100, true);
				casque.setItemMeta(cC);
				ItemMeta cP = plastron.getItemMeta();
				cP.addEnchant(Enchantment.DURABILITY, 100, true);
				plastron.setItemMeta(cP);
				ItemMeta cJ = jambes.getItemMeta();
				cJ.addEnchant(Enchantment.DURABILITY, 100, true);
				jambes.setItemMeta(cJ);
				ItemMeta cPi = pieds.getItemMeta();
				cPi.addEnchant(Enchantment.DURABILITY, 100, true);
				cPi.addEnchant(Enchantment.PROTECTION_FALL, 6, true);
				cPi.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,new AttributeModifier(new UUID(1,1000), "generic.movement_speed",0.03,AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.FEET));
				pieds.setItemMeta(cPi);
				
				p.setMaxHealth(20);
				p.setHealth(20);
				
				p.getInventory().setItem(0, epee);
				p.getInventory().setItem(2, pelle);
				p.getInventory().setItem(3, pommes);
				p.getInventory().setItem(4, blocs);
				
				p.getInventory().setItem(1, arc);
				p.getInventory().setItem(5, casque);
				p.getInventory().setItem(6, plastron);
				p.getInventory().setItem(7, jambes);
				p.getInventory().setItem(8, pieds);
				p.getInventory().addItem(fleches);
				
				p.sendMessage("§1Voici ton incroyable §4kit §1d'Eclaireur !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1d'Eclaireur");
			}
			else if(args[0].equals("Berserker"))
			{
				inventory.clear();
				
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
				
				p.sendMessage("§1Voici ton incroyable §4kit §1de Berserker !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1de Berserker");
			}
			else if(args[0].equals("Guerisseur"))
			{
				inventory.clear();	
				
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
				
				p.sendMessage("§1Voici ton incroyable §4kit §1de Guerisseur !");
				Bukkit.broadcastMessage("§4"+p.getName() + " §1a demandé un §4kit §1de Guerisseur");
			}
			else
			{
				p.sendMessage("§4Tu dois renseigner le nom de ton kit pour en obtenir un kit");
			}

		}
		return true;
	}
}