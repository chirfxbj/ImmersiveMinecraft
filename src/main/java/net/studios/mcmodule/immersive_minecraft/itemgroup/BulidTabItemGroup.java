
package net.studios.mcmodule.immersive_minecraft.itemgroup;

import net.studios.mcmodule.immersive_minecraft.block.PeridotCoatedWoodBlock;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ImmersiveMinecraftModElements.ModElement.Tag
public class BulidTabItemGroup extends ImmersiveMinecraftModElements.ModElement {
	public BulidTabItemGroup(ImmersiveMinecraftModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbulid_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PeridotCoatedWoodBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
