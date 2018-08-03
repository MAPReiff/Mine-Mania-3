package space.mreiff.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import space.mreiff.mod.Main;
import space.mreiff.mod.init.BlockInit;
import space.mreiff.mod.init.ItemInit;
import space.mreiff.mod.util.interfaces.IHasModel;

public class BlockBase extends Block implements IHasModel {

	public BlockBase (String name, Material material) {
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}
	
}
