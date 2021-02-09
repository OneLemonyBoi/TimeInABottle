package com.onelemonyboi.timeinabottle.item;

import com.onelemonyboi.timeinabottle.setup.ModSetup;
import com.onelemonyboi.timeinabottle.setup.Registration;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MyTutorial.MODID)
public class MyTutorial {

	public static final String MODID = "mytutorial";

	private static final Logger LOGGER = LogManager.getLogger();

	public MyTutorial() {
		Registration.init();

		// Register the setup method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
	}
}