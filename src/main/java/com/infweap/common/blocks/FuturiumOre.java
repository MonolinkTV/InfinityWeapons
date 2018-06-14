package com.infweap.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FuturiumOre extends BlockInfinity {

	public FuturiumOre() {
		super("oreoverworldfuturium", Material.ROCK);
		setSoundType(SoundType.STONE);
		setResistance(40);
		setHardness(2);
	}

}
