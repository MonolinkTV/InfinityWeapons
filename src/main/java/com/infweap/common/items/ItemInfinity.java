package com.infweap.common.items;

import com.infweap.common.InfinityItems;
import com.infweap.common.InfinityWeapons;
import com.infweap.common.proxy.ClientProxy;
import com.infweap.common.utilities.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemInfinity extends Item implements IHasModel
{
	public ItemInfinity(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(InfinityWeapons.infinityweaponstab);
		
		InfinityItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		InfinityWeapons.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
