
package net.studios.mcmodule.immersive_minecraft.itemgroup;

import net.studios.mcmodule.immersive_minecraft.block.SilverOreBlock;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ImmersiveMinecraftModElements.ModElement.Tag
public class OreTabItemGroup extends ImmersiveMinecraftModElements.ModElement {
	public OreTabItemGroup(ImmersiveMinecraftModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabore_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SilverOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
