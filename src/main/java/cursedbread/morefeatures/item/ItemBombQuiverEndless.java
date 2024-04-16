package cursedbread.morefeatures.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.slot.Slot;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.morefeatures.FeaturesMain.MOD_ID;

public class ItemBombQuiverEndless extends Item {
	public ItemBombQuiverEndless(String name, int id) {
		super(name, id);
		this.setMaxStackSize(1);
	}
}

