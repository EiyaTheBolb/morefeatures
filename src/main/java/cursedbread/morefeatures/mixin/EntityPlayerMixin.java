package cursedbread.morefeatures.mixin;

import cursedbread.morefeatures.item.FeaturesItems;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EntityPlayer.class, remap = false)
public class EntityPlayerMixin {
	@Shadow
	protected float baseSpeed;

	@Inject(method = "onLivingUpdate()V", at = @At("TAIL"))
	private void armor_effects(CallbackInfo ci) {
		if (FeaturesItems.olivineArmorEnabled == 1){
		    EntityPlayer self = (EntityPlayer) (Object) this;
			ItemStack helmet_item = self.inventory.armorItemInSlot(3);
			ItemStack chest_item = self.inventory.armorItemInSlot(2);
			ItemStack leggings_item = self.inventory.armorItemInSlot(1);
			ItemStack boots_item = self.inventory.armorItemInSlot(0);

		    this.baseSpeed = 0.1f;
			if (chest_item != null && chest_item.getItem().equals(FeaturesItems.olivineChestplate)) {
				this.baseSpeed += 0.06f;
		    }
		    if (leggings_item != null && leggings_item.getItem().equals(FeaturesItems.olivineLeggings)) {
				this.baseSpeed += 0.04f;
			}
			if (helmet_item != null && FeaturesItems.regularCrownEnabled == 1 && helmet_item.getItem().equals(FeaturesItems.olivineCrown)) {
				this.baseSpeed += 0.02f;
			}
			if (helmet_item != null && helmet_item.getItem().equals(FeaturesItems.olivineHelmet)) {
				this.baseSpeed += 0.02f;
			}
			if (boots_item != null && boots_item.getItem().equals(FeaturesItems.olivineBoots)) {
				this.baseSpeed += 0.02f;
			}
		}
	}
}
