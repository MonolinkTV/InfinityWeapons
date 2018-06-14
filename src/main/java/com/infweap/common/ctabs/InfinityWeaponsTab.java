package com.infweap.common.ctabs;
import com.infweap.common.InfinityItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class InfinityWeaponsTab extends CreativeTabs{

	public InfinityWeaponsTab(String label) 
	{
		super("infinityweaponstab");
		this.setBackgroundImageName("infinitytab.png");
	}



	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InfinityItems.DMC);
	}
}