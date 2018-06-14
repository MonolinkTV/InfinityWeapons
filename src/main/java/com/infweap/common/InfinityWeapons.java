package com.infweap.common;


import com.infweap.common.ctabs.InfinityWeaponsTab;
import com.infweap.common.proxy.CommonProxy;
import com.infweap.common.worldgen.ores.InfinityOresWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Referance.MOD_ID , name = Referance.NAME , version = Referance.VERSION)
public class InfinityWeapons {
	
	public static final CreativeTabs infinityweaponstab = new InfinityWeaponsTab("infinityweaponstab");
	
	@Instance
	public static InfinityWeapons instance;	
	
	@SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS , serverSide = Referance.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new InfinityOresWorldGen(), 0);
	}
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{

	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
