
package net.studios.mcmodule.immersive_minecraft.item;

import net.studios.mcmodule.immersive_minecraft.itemgroup.OreTabItemGroup;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@ImmersiveMinecraftModElements.ModElement.Tag
public class LmpureFragmentsOfHelioliteItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:lmpure_fragments_of_heliolite")
	public static final Item block = null;
	public LmpureFragmentsOfHelioliteItem(ImmersiveMinecraftModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OreTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("lmpure_fragments_of_heliolite");
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
