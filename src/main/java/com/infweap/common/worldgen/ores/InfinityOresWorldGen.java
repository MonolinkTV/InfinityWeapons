package com.infweap.common.worldgen.ores;

import java.util.Random;

import com.infweap.common.InfinityBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class InfinityOresWorldGen implements IWorldGenerator{
	
	private WorldGenerator oreoverworlduranium;
	private WorldGenerator oreoverworldtitanium;
	private WorldGenerator oreoverworldfuturium;
	private WorldGenerator oreoverworldmercury;

	
	public InfinityOresWorldGen() 
	{
		oreoverworlduranium = new WorldGenMinable(InfinityBlocks.oreoverworlduranium.getDefaultState(), 5);
		oreoverworldtitanium = new WorldGenMinable(InfinityBlocks.oreoverworldtitanium.getDefaultState(), 7);
		oreoverworldfuturium = new WorldGenMinable(InfinityBlocks.oreoverworldfuturium.getDefaultState(), 9);
		oreoverworldmercury = new WorldGenMinable(InfinityBlocks.oreoverworldmercury.getDefaultState(), 4);

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
			case 0:
				
				runGenerator(oreoverworlduranium, world, random, chunkX, chunkZ, 10, 0, 30);
				runGenerator(oreoverworldtitanium, world, random, chunkX, chunkZ, 20, 10, 40);
				runGenerator(oreoverworldfuturium, world, random, chunkX, chunkZ, 30, 30, 60);
				runGenerator(oreoverworldmercury, world, random, chunkX, chunkZ, 10, 0, 10);

				
				break;
				
			case 1:
				
				break;
				
			case -1:
			
				break;
		}
		
	}
	private void runGenerator(WorldGenerator gen, World world, Random rand,int chunkX,int chunkZ,int chance,int minHeight,int maxHeight) 
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generation exeded bounds");
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
