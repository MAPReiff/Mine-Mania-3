package space.mreiff.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import space.mreiff.mod.objects.blocks.DiamondiumBlock;
import space.mreiff.mod.objects.blocks.RubyBlock;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//	public static final Block BLOCK_NAME = new BlockBase("block_NAME", Material.TYPE);

	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block DIAMONDIUM_BLOCK = new DiamondiumBlock("diamondium_block", Material.IRON);


}
