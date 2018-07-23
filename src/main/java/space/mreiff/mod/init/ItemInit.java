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
	public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("ruby_armor", Reference.MOD_ID + ":ruby", 33, new int[] {3, 4, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
			
	public static final Item RUBY_AXE = new ToolAxe("ruby_axe", RUBY_TOOL);
	public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", RUBY_TOOL);
	public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", RUBY_TOOL);
	public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", RUBY_TOOL);
	public static final Item RUBY_SWORD = new ToolSword("ruby_sword", RUBY_TOOL);

	public static final Item RUBY_HELM = new ArmorBase("ruby_helm", RUBY_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHEST = new ArmorBase("ruby_chest", RUBY_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGS = new ArmorBase("ruby_legs", RUBY_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", RUBY_ARMOR, 1, EntityEquipmentSlot.FEET);
	
	
	
	

	public static final Item DIAMONDIUM = new ItemBase("diamondium");
	public static final Item DIAMONDIUM_NUGGET = new ItemBase("diamondium_nugget");

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
