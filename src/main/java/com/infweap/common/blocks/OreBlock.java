package com.infweap.common.blocks;

import com.infweap.common.InfinityBlocks;
import com.infweap.common.InfinityItems;
import com.infweap.common.InfinityWeapons;
import com.infweap.common.utilities.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OreBlock extends Block implements IHasModel {

	public OreBlock(String name) 
	{
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setResistance(40);
		setHardness(2);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(InfinityWeapons.infinityweaponstab);

		InfinityBlocks.BLOCKS.add(this);
		InfinityItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		InfinityWeapons.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}
}

