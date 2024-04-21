package cursedbread.morefeatures;

import cursedbread.morefeatures.blocks.FeaturesBlocks;
import cursedbread.morefeatures.blocks.VanilaBlockColoredGlowstone;
import cursedbread.morefeatures.blocks.paperwall.VanilaBlockAltPaperwall;
import cursedbread.morefeatures.blocks.paperwall.VanilaBlockColoredPaperwall;
import cursedbread.morefeatures.blocks.paperwall.VanilaBlockPaintedPaperwall;
import cursedbread.morefeatures.item.FeaturesItems;
import cursedbread.morefeatures.item.ItemBombQuiver;
import cursedbread.morefeatures.item.ItemBombQuiverEndless;
import cursedbread.morefeatures.item.StickWorkbench;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

import java.util.Properties;


public class FeaturesMain implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "morefeatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static boolean nonamedyesOn = ModVersionHelper.isModPresent("nonamedyes");
	public static int paperWallAlt;

	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2000");
		prop.setProperty("starting_item_id","17000");
		prop.setProperty("painted_or_alt_or_colored_paper_walls_texture_(0_or_1_or_2)","0");

		prop.setProperty("Add_colored_glowstone_blocks", "1");
		prop.setProperty("Add_colored_paper_wall_blocks", "1");

		prop.setProperty("Comment", "yes_is_1|no_is_0");
		prop.setProperty("Add_flower_crowns", "1");
		prop.setProperty("Add_regular_crowns", "1");
		prop.setProperty("Add_bedrock_armor", "1");
		prop.setProperty("Add_plate_armor", "1");
		prop.setProperty("Add_studded_armor", "1");
		prop.setProperty("Add_stone_armor", "1");
		prop.setProperty("Add_bomb_quivers", "1");
		prop.setProperty("Add_workbench_on_a_stick", "1");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);


		//Meta
		FeaturesBlocks.blockId = config.getInt("starting_block_id");
		FeaturesItems.itemId = config.getInt("starting_item_id");
		paperWallAlt = config.getInt("painted_or_alt_or_colored_paper_walls_texture_(0_or_1_or_2)");

		//Blocks
		FeaturesBlocks.glowstaniEnabled = config.getInt("Add_colored_glowstone_blocks");
		FeaturesBlocks.paperwallEnabled = config.getInt("Add_colored_paper_wall_blocks");
		//Items
		FeaturesItems.flowerCrownEnabled = config.getInt("Add_flower_crowns");
		FeaturesItems.regularCrownEnabled = config.getInt("Add_regular_crowns");
		FeaturesItems.bedrockArmorEnabled = config.getInt("Add_bedrock_armor");
		FeaturesItems.plateArmorEnabled = config.getInt("Add_plate_armor");
		FeaturesItems.leatherchainArmorEnabled = config.getInt("Add_studded_armor");
		FeaturesItems.stoneArmorEnabled = config.getInt("Add_stone_armor");
		FeaturesItems.bombQuibersEnabled = config.getInt("Add_bomb_quivers");
		FeaturesItems.workbenchonstickEnabled = config.getInt("Add_workbench_on_a_stick");
	}
    @Override
    public void onInitialize() {
        LOGGER.info("Adding some stuff");
		new FeaturesBlocks().initilizeBlocks();
		new FeaturesItems().initilizeItems();
    }



	@Override
	public void beforeGameStart() {
	}

	@Override
	public void afterGameStart() {
	}
}
