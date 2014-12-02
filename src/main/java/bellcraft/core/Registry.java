package bellcraft.core;

import bellcraft.blocks.Blocks;
import bellcraft.items.ItemIngots;
import bellcraft.items.ItemRandomBox;
import bellcraft.items.Items;
import bellcraft.recipes.FurnaceRecipe;
import bellcraft.recipes.ItemRecipe;
import bellcraft.world.OreGeneration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {
	
	public static void register(FMLPreInitializationEvent event)
	{
		Config.Initialize(event); // 설정값 로드
	}
	
	public static void register(FMLInitializationEvent event)
	{
		Events.registerEvents(); // 이벤트 등록
		Items.registerItems(); // 아이템 등록
		Blocks.registerBlocks(); // 블럭 등록
		OreGeneration.registerOre(); // 광물 등록
		ItemRecipe.registerRecipe(); // 아이템 조합법 등록
		FurnaceRecipe.registerRecipe(); // 화로 조합법 등록
	}
}