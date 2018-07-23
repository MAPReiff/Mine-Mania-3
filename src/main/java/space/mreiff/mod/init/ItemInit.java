package space.mreiff.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import space.mreiff.mod.objects.armor.ArmorBase;
import space.mreiff.mod.objects.items.ItemBase;
import space.mreiff.mod.objects.tools.ToolAxe;
import space.mreiff.mod.objects.tools.ToolHoe;
import space.mreiff.mod.objects.tools.ToolPickaxe;
import space.mreiff.mod.objects.tools.ToolShovel;
import space.mreiff.mod.objects.tools.ToolSword;
import space.mreiff.mod.util.Reference;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	// public static final Item NAME = new ItemBase("name");
	// public static final Item INGOT_RED = new ItemBase("ingot_red");

	// ruby
	public static final Item RUBY = new ItemBase("ruby");

	public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 3, 1561, 8.0f, 3.0f, 18);
	public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Reference.MOD_ID + ":ruby",
			33, new int[] { 3, 4, 8, 3 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);

	public static final Item RUBY_AXE = new ToolAxe("ruby_axe", RUBY_TOOL);
	public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", RUBY_TOOL);
	public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", RUBY_TOOL);
	public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", RUBY_TOOL);
	public static final Item RUBY_SWORD = new ToolSword("ruby_sword", RUBY_TOOL);

	public static final Item RUBY_HELMMET = new ArmorBase("ruby_helmet", RUBY_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", RUBY_ARMOR, 1,
			EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGSS = new ArmorBase("ruby_leggings", RUBY_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", RUBY_ARMOR, 1, EntityEquipmentSlot.FEET);

	// emerald
	public static final ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("emerald_armor",
			Reference.MOD_ID + ":emerald", 33, new int[] { 3, 4, 8, 3 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			2.0f);

	public static final Item EMERALD_AXE = new ToolAxe("emerald_axe", RUBY_TOOL);
	public static final Item EMERALD_HOE = new ToolHoe("emerald_hoe", RUBY_TOOL);
	public static final Item EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", RUBY_TOOL);
	public static final Item EMERALD_SHOVEL = new ToolShovel("emerald_shovel", RUBY_TOOL);
	public static final Item EMERALD_SWORD = new ToolSword("emerald_sword", RUBY_TOOL);

	public static final Item EMERALD_HELMMET = new ArmorBase("emerald_helmet", EMERALD_ARMOR, 1,
			EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", EMERALD_ARMOR, 1,
			EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGSS = new ArmorBase("emerald_leggings", EMERALD_ARMOR, 2,
			EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", EMERALD_ARMOR, 1, EntityEquipmentSlot.FEET);

	// diamondium
	public static final ToolMaterial DIAMONDIUM_TOOL = EnumHelper.addToolMaterial("diamondium_tool", 6, 1999,
			7.5F, 4.6F, 18);
	public static final ArmorMaterial DIAMONDIUM_ARMOR = EnumHelper.addArmorMaterial("diamondium_armor", Reference.MOD_ID + "diamondium", 50,
			new int[] { 4, 9, 7, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);

	
	public static final Item DIAMONDIUM = new ItemBase("diamondium");
//	public static final Item DIAMONDIUM_NUGGET = new ItemBase("diamondium_nugget");
	
	
	
	

//	public static final ToolMaterial dirtMaterial = EnumHelper.addToolMaterial("dirtMaterial", 0, 15, 1.0F, 0.0F,
//			2);
//	public static final ToolMaterial glassMaterial = EnumHelper.addToolMaterial("dirtMaterial", 3, 1, 5.0F, 2.5F,
//			30);
//	public static final ToolMaterial potMaterial = EnumHelper.addToolMaterial("potMaterial", 0, 49, 1.5F, 0.0F,
//			10);
//	public static final ArmorMaterial potMaterialA = EnumHelper.addArmorMaterial("potMaterialA", 15,
//			new int[] { 1, 3, 2, 1 }, 10);
//	public static final ToolMaterial rsMaterial = EnumHelper.addToolMaterial("rsMaterial", 2, 399, 6.0F, 1.6F, 15);
//	
//	public static final ArmorMaterial CHA = EnumHelper.addArmorMaterial("CHA", 20, new int[] { 3, 6, 5, 2 },
//			18);
//	public static final ToolMaterial NRT = EnumHelper.addToolMaterial("NRT", 1, 149, 5.0F, 1.5F, 5);
//	public static final ArmorMaterial UltimatiumA = EnumHelper.addArmorMaterial("UltimatiumA", 40,
//			new int[] { 5, 9, 5, 5 }, 18);
//	public static final ToolMaterial UltimatiumT = EnumHelper.addToolMaterial("UltimatiumT", 6, 4999, 14.0F, 5.5F,
//			18);

}

//default tool materials
//WOOD(0, 59, 2.0F, 0.0F, 15),
//STONE(1, 131, 4.0F, 1.0F, 5),
//IRON(2, 250, 6.0F, 2.0F, 14),
//DIAMOND(3, 1561, 8.0F, 3.0F, 10),
//GOLD(0, 32, 12.0F, 0.0F, 22);

//default armor materials
//LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
//CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
//IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
//GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
//DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
