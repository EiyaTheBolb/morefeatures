package cursedbread.morefeatures.blocks;

import cursedbread.morefeatures.FeaturesMain;
import cursedbread.morefeatures.blocks.paperwall.*;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class FeaturesBlocks {
	public static BlockBuilder glowstoneBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setLuminance(15)
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.5f);

	public static BlockBuilder paperwallBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setBlockSound(BlockSounds.CLOTH)
		.setHardness(0.5f);

	public static BlockBuilder fireBlock = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(3))
		.setLuminance(15)
		.setHardness(0.1f);

	public static int blockId;

	public static Block vanillaColoredGlowstone;
	public static Block nonameColoredGlowstone;
	public static int glowstoneEnabled;
	public static Block vanillaColoredPaperwall;

	public static Block nonameColoredPaperwall;

	public static int paperwallEnabled;

	private void initializeBlockDetails() {
		if (glowstoneEnabled == 1) {
			Item.itemsList[vanillaColoredGlowstone.id] = new ItemBlockPainted(vanillaColoredGlowstone, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredGlowstone, color - 1, vanillaColoredGlowstone, color);
			}
			if (FeaturesMain.nonamedyesOn == true) {
				Item.itemsList[nonameColoredGlowstone.id] = new ItemBlockPainted(nonameColoredGlowstone, false);
				for (int color = 2; color < 14; color++) {
					CreativeHelper.setParent(nonameColoredGlowstone, color - 1, nonameColoredGlowstone, color);
				}
			}
		}
		if (paperwallEnabled == 1) {
			Item.itemsList[vanillaColoredPaperwall.id] = new ItemBlockPainted(vanillaColoredPaperwall, false);
			for (int color = 2; color < 17; color++) {
				CreativeHelper.setParent(vanillaColoredPaperwall, color - 1, vanillaColoredPaperwall, 0);
			}
			if (FeaturesMain.nonamedyesOn == true) {
				Item.itemsList[nonameColoredPaperwall.id] = new ItemBlockPainted(nonameColoredPaperwall, false);
				for (int color = 2; color < 14; color++) {
					CreativeHelper.setParent(nonameColoredPaperwall, color - 1, nonameColoredPaperwall, color);
				}
			}
		}
	}

	public void initilizeBlocks() {
		if (glowstoneEnabled == 1) {
			vanillaColoredGlowstone = glowstoneBlock
				.setTextures("glowstone/black_glowstone.png").setTextures("glowstone/red_glowstone.png").setTextures("glowstone/green_glowstone.png").setTextures("glowstone/brown_glowstone.png").setTextures("glowstone/blue_glowstone.png").setTextures("glowstone/purple_glowstone.png").setTextures("glowstone/cyan_glowstone.png").setTextures("glowstone/silver_glowstone.png")
				.setTextures("glowstone/gray_glowstone.png").setTextures("glowstone/pink_glowstone.png").setTextures("glowstone/lime_glowstone.png").setTextures("glowstone/yellow_glowstone.png").setTextures("glowstone/lightblue_glowstone.png").setTextures("glowstone/magenta_glowstone.png").setTextures("glowstone/orange_glowstone.png").setTextures("glowstone/white_glowstone.png")
				.setItemBlock(block -> new ItemBlockPainted(block, false))
				.build(new VanilaBlockColoredGlowstone("vanilla.colored.glowstone", blockId++, Material.glass));
			if (FeaturesMain.nonamedyesOn == true) {
				nonameColoredGlowstone = glowstoneBlock
					.setTextures("glowstone/crimson_glowstone.png").setTextures("glowstone/maroon_glowstone.png").setTextures("glowstone/ash_gray_glowstone.png").setTextures("glowstone/ochre_glowstone.png").setTextures("glowstone/buff_glowstone.png").setTextures("glowstone/olive_glowstone.png").setTextures("glowstone/verdigris_glowstone.png").setTextures("glowstone/light_yellow_glowstone.png")
					.setTextures("glowstone/indigo_glowstone.png").setTextures("glowstone/xanthic_glowstone.png").setTextures("glowstone/cinnamon_glowstone.png").setTextures("glowstone/navy_blue_glowstone.png").setTextures("glowstone/royal_purple_glowstone.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new NonameBlockColoredGlowstone("noname.colored.glowstone", blockId++, Material.glass));
			}
		}
		if (paperwallEnabled == 1) {
			if (FeaturesMain.paperWallAlt == 0) {
				vanillaColoredPaperwall = paperwallBlock
					.setTextures("paperwall/painted/black_paperwall.png").setTextures("paperwall/painted/red_paperwall.png").setTextures("paperwall/painted/green_paperwall.png").setTextures("paperwall/painted/brown_paperwall.png").setTextures("paperwall/painted/blue_paperwall.png").setTextures("paperwall/painted/purple_paperwall.png").setTextures("paperwall/painted/cyan_paperwall.png").setTextures("paperwall/painted/silver_paperwall.png")
					.setTextures("paperwall/painted/gray_paperwall.png").setTextures("paperwall/painted/pink_paperwall.png").setTextures("paperwall/painted/lime_paperwall.png").setTextures("paperwall/painted/yellow_paperwall.png").setTextures("paperwall/painted/lightblue_paperwall.png").setTextures("paperwall/painted/magenta_paperwall.png").setTextures("paperwall/painted/orange_paperwall.png").setTextures("paperwall/painted/white_paperwall.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new VanilaBlockPaintedPaperwall("vanilla.colored.paperwall", blockId++, Material.wood));
			} else if (FeaturesMain.paperWallAlt == 1) {
				vanillaColoredPaperwall = paperwallBlock
					.setTextures("paperwall/alt/black_paperwall.png").setTextures("paperwall/alt/red_paperwall.png").setTextures("paperwall/alt/green_paperwall.png").setTextures("paperwall/alt/brown_paperwall.png").setTextures("paperwall/alt/blue_paperwall.png").setTextures("paperwall/alt/purple_paperwall.png").setTextures("paperwall/alt/cyan_paperwall.png").setTextures("paperwall/alt/silver_paperwall.png")
					.setTextures("paperwall/alt/gray_paperwall.png").setTextures("paperwall/alt/pink_paperwall.png").setTextures("paperwall/alt/lime_paperwall.png").setTextures("paperwall/alt/yellow_paperwall.png").setTextures("paperwall/alt/lightblue_paperwall.png").setTextures("paperwall/alt/magenta_paperwall.png").setTextures("paperwall/alt/orange_paperwall.png").setTextures("paperwall/alt/white_paperwall.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new VanilaBlockAltPaperwall("vanilla.colored.paperwall", blockId++, Material.wood));
			} else {
				vanillaColoredPaperwall = paperwallBlock
					.setTextures("paperwall/colored/black_paperwall.png").setTextures("paperwall/colored/red_paperwall.png").setTextures("paperwall/colored/green_paperwall.png").setTextures("paperwall/colored/brown_paperwall.png").setTextures("paperwall/colored/blue_paperwall.png").setTextures("paperwall/colored/purple_paperwall.png").setTextures("paperwall/colored/cyan_paperwall.png").setTextures("paperwall/colored/silver_paperwall.png")
					.setTextures("paperwall/colored/gray_paperwall.png").setTextures("paperwall/colored/pink_paperwall.png").setTextures("paperwall/colored/lime_paperwall.png").setTextures("paperwall/colored/yellow_paperwall.png").setTextures("paperwall/colored/lightblue_paperwall.png").setTextures("paperwall/colored/magenta_paperwall.png").setTextures("paperwall/colored/orange_paperwall.png").setTextures("paperwall/colored/white_paperwall.png")
					.setItemBlock(block -> new ItemBlockPainted(block, false))
					.build(new VanilaBlockColoredPaperwall("vanilla.colored.paperwall", blockId++, Material.wood));
			}
			if (FeaturesMain.nonamedyesOn) {
				if (FeaturesMain.paperWallAlt == 0) {
					nonameColoredPaperwall = paperwallBlock
						.setTextures("paperwall/painted/crimson_paperwall.png").setTextures("paperwall/painted/maroon_paperwall.png").setTextures("paperwall/painted/ash_gray_paperwall.png").setTextures("paperwall/painted/ochre_paperwall.png").setTextures("paperwall/painted/buff_paperwall.png").setTextures("paperwall/painted/olive_paperwall.png").setTextures("paperwall/painted/verdigris_paperwall.png").setTextures("paperwall/painted/light_yellow_paperwall.png")
						.setTextures("paperwall/painted/indigo_paperwall.png").setTextures("paperwall/painted/xanthic_paperwall.png").setTextures("paperwall/painted/cinnamon_paperwall.png").setTextures("paperwall/painted/navy_blue_paperwall.png").setTextures("paperwall/painted/royal_purple_paperwall.png")
						.setItemBlock(block -> new ItemBlockPainted(block, false))
						.build(new NonameBlockPaintedPaperwall("noname.colored.paperwall", blockId++, Material.wood));
				} else if (FeaturesMain.paperWallAlt == 1) {
					nonameColoredPaperwall = paperwallBlock
						.setTextures("paperwall/alt/crimson_paperwall.png").setTextures("paperwall/alt/maroon_paperwall.png").setTextures("paperwall/alt/ash_gray_paperwall.png").setTextures("paperwall/alt/ochre_paperwall.png").setTextures("paperwall/alt/buff_paperwall.png").setTextures("paperwall/alt/olive_paperwall.png").setTextures("paperwall/alt/verdigris_paperwall.png").setTextures("paperwall/alt/light_yellow_paperwall.png")
						.setTextures("paperwall/alt/indigo_paperwall.png").setTextures("paperwall/alt/xanthic_paperwall.png").setTextures("paperwall/alt/cinnamon_paperwall.png").setTextures("paperwall/alt/navy_blue_paperwall.png").setTextures("paperwall/alt/royal_purple_paperwall.png")
						.setItemBlock(block -> new ItemBlockPainted(block, false))
						.build(new NonameBlockAltPaperwall("noname.colored.paperwall", blockId++, Material.wood));
				} else {
					nonameColoredPaperwall = paperwallBlock
						.setTextures("paperwall/colored/crimson_paperwall.png").setTextures("paperwall/colored/maroon_paperwall.png").setTextures("paperwall/colored/ash_gray_paperwall.png").setTextures("paperwall/colored/ochre_paperwall.png").setTextures("paperwall/colored/buff_paperwall.png").setTextures("paperwall/colored/olive_paperwall.png").setTextures("paperwall/colored/verdigris_paperwall.png").setTextures("paperwall/colored/light_yellow_paperwall.png")
						.setTextures("paperwall/colored/indigo_paperwall.png").setTextures("paperwall/colored/xanthic_paperwall.png").setTextures("paperwall/colored/cinnamon_paperwall.png").setTextures("paperwall/colored/navy_blue_paperwall.png").setTextures("paperwall/colored/royal_purple_paperwall.png")
						.setItemBlock(block -> new ItemBlockPainted(block, false))
						.build(new NonameBlockColoredPaperwall("noname.colored.paperwall", blockId++, Material.wood));
				}
			}
		}
		initializeBlockDetails();
	}
}
