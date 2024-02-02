package io.github.fhrk_78.admc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Fhrk_AdvanceMC implements ModInitializer {
	// Make Item
	public static final Item TICKET = new Item(new FabricItemSettings());
	//public static final Block TICKET_VENDING_MACHINE = new Block(FabricBlockSettings.create().strength(4.0f));
	public static final Block TICKET_VENDING_MACHINE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

	// Regist
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier("fhrk_advancemc", "ticket"), TICKET);
		Registry.register(Registries.BLOCK, new Identifier("fhrk_advancemc", "ticket_vending_machine.json.json"), TICKET_VENDING_MACHINE);
		Registry.register(Registries.ITEM, new Identifier("fhrk_advancemc", "ticket_vending_machine.json.json"), new BlockItem(TICKET_VENDING_MACHINE, new FabricItemSettings()));
	}
}