package space.mreiff.mod.objects.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import space.mreiff.mod.Main;
import space.mreiff.mod.init.BlockInit;
import space.mreiff.mod.init.ItemInit;
import space.mreiff.mod.objects.blocks.item.ItemBlockVariants;
import space.mreiff.mod.util.handlers.EnumHandler;
import space.mreiff.mod.util.handlers.EnumHandler.EnumType;
import space.mreiff.mod.util.interfaces.IHasModel;
import space.mreiff.mod.util.interfaces.IMetaName;

public class BlockOres extends Block implements IHasModel, IMetaName {

	public static final PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.<EnumHandler.EnumType>create(
			"variant", EnumHandler.EnumType.class);

	private String name, dimension;

	public BlockOres(String name, String dimension) {

		super(Material.ROCK);

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandler.EnumType.ruby));
		setHarvestLevel("pickaxe", 2);
//		setHardness(hardness)
	
		 

		this.name = name;
		this.dimension = dimension;

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public int damageDropped(IBlockState state) {
		return ((EnumHandler.EnumType) state.getValue(VARIANT)).getMeta();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumHandler.EnumType) state.getValue(VARIANT)).getMeta();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetadata(meta));
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for (EnumHandler.EnumType variant : EnumHandler.EnumType.values()) {
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { VARIANT });
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		if (state == this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.ruby)) {
			return ItemInit.RUBY;
		}
		return Item.getItemFromBlock(this);
	}

	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		if (state == this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.ruby)) {
			return 1 + random.nextInt(1 + fortune);
		}
		return fortune + 1;
	}

	@Override
	public void registerModels() {
//		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

		for (int i = 0; i < EnumHandler.EnumType.values().length; i++) {
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i,
					"ore_" + this.dimension + "_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
		}

	}

}
