
package net.studios.mcmodule.immersive_minecraft.itemgroup;

import net.studios.mcmodule.immersive_minecraft.item.IceSwordItem;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ImmersiveMinecraftModElements.ModElement.Tag
public class IMcombotItemGroup extends ImmersiveMinecraftModElements.ModElement {
	public IMcombotItemGroup(ImmersiveMinecraftModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabi_mcombot") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IceSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
