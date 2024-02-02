package io.github.fhrk_78.admc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fhrk_AdvanceMC implements ModInitializer {
	// Make Item
	public static final Item TICKET = new Item(new FabricItemSettings());

	// Regist
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier("fhrk_advancemc", "ticket"), TICKET);
	}
}