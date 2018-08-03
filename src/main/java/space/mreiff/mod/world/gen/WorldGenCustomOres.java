package space.mreiff.mod.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import space.mreiff.mod.init.BlockInit;
import space.mreiff.mod.objects.blocks.BlockOres;
import space.mreiff.mod.util.handlers.EnumHandler;

public class WorldGenCustomOres implements IWorldGenerator {

	private WorldGenerator ruby_ore; // can put all dims for same ore on one line

	public WorldGenCustomOres() {
//		ore_dim_name = new WorldGenMinable(
//				BlockInit.ORE_DIM.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.name), max vien,
//				BlockMatcher.forBlock(Blocks.what block it is in));

		ruby_ore = new WorldGenMinable(BlockInit.RUBY_ORE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		switch (world.provider.getDimension()) {

		case -1: // nether
//			runGenerator(ore_nether_name, world, random, chunkX, chunkZ, chance_in_percent, minHeight, maxHeight);

			break;

		case 0: // overworld
			runGenerator(ruby_ore, world, random, chunkX, chunkZ, 3, 1, 30); 
			
			break;

		case 1: // end
//			runGenerator(ore_end_name, world, random, chunkX, chunkZ, chance_in_percent, minHeight, maxHeight);

			break;

		}

	}

	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance,
			int minHeight, int maxHeight) {

		if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256)
			throw new IllegalArgumentException("Ore gerated out of world.");

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, new BlockPos(x, y, z));

		}

	}

}
