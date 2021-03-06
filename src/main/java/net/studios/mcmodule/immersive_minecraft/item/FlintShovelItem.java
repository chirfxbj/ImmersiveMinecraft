
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
public class FlintShovelItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:flint_shovel")
	public static final Item block = null;
	public FlintShovelItem(ImmersiveMinecraftModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 71;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -0.4f;
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
		}, 1, -3f, new Item.Properties().group(IMcombotItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(
						new StringTextComponent("\u00A77\u71E7\u77F3\u505A\u7684\u94F2\uFF0C\u9002\u5408\u8352\u5C9B\u751F\u5B58\u4F7F\u7528\u3002"));
			}
		}.setRegistryName("flint_shovel"));
	}
}
