package com.infweap.common;

import java.util.ArrayList;
import java.util.List;

import com.infweap.common.blocks.FuturiumOre;
import com.infweap.common.blocks.OreBlock;
import net.minecraft.block.Block;

public class InfinityBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block oreoverworlduranium = new OreBlock("oreoverworlduranium");
	public static final Block oreoverworldtitanium = new OreBlock("oreoverworldtitanium");
	public static final Block oreoverworldfuturium = new FuturiumOre();
	public static final Block oreoverworldmercury = new OreBlock("oreoverworldmercury");
	

	
}
