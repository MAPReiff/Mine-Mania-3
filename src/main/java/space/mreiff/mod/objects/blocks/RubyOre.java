package space.mreiff.mod.objects.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import space.mreiff.mod.Main;
import space.mreiff.mod.init.BlockInit;
import space.mreiff.mod.init.ItemInit;
import space.mreiff.mod.util.interfaces.IHasModel;

public class RubyOre extends Block implements IHasModel {

	public RubyOre(String name, Material material) {

		super(material);

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		setHarvestLevel("pickaxe", 2);
		setHardness(2f);

	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return ItemInit.RUBY;

	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		System.out.println(fortune);
		return 1;
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		// TODO Auto-generated method stub
//		return super.quantityDroppedWithBonus(fortune, random);

		if (fortune > 0) {
			int i = random.nextInt(fortune + 2) - 1;

			if (i < 0) {
				i = 0;
			}

			return quantityDropped(random) * (i + 1);
		} else {
			return quantityDropped(random);
		}
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
//		return super.getExpDrop(state, world, pos, fortune);
		Random rand = world instanceof World ? ((World) world).rand : new Random();
		if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
			int i = 0;
			i = MathHelper.getInt(rand, 3, 7);
			return i;
		}
		return 0;
	}



	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}

}
