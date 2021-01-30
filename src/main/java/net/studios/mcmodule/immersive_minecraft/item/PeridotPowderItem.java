
package net.studios.mcmodule.immersive_minecraft.item;

import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@ImmersiveMinecraftModElements.ModElement.Tag
public class PeridotPowderItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:peridot_powder")
	public static final Item block = null;
	public PeridotPowderItem(ImmersiveMinecraftModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("peridot_powder");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
