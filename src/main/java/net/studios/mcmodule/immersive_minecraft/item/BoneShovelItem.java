
package net.studios.mcmodule.immersive_minecraft.item;

import net.studios.mcmodule.immersive_minecraft.itemgroup.IMcombotItemGroup;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@ImmersiveMinecraftModElements.ModElement.Tag
public class BoneShovelItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:bone_shovel")
	public static final Item block = null;
	public BoneShovelItem(ImmersiveMinecraftModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1951;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 1.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2f, new Item.Properties().group(IMcombotItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u9AA8\u5934\u5F88\u575A\u786C\uFF0C\u5DE5\u5177\u5F88\u8010\u7528\u3002"));
			}
		}.setRegistryName("bone_shovel"));
	}
}
