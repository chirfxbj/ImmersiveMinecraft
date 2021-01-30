
package net.studios.mcmodule.immersive_minecraft.item;

import net.studios.mcmodule.immersive_minecraft.itemgroup.IMcombotItemGroup;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;

import java.util.List;

@ImmersiveMinecraftModElements.ModElement.Tag
public class CactusAxeItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:cactus_axe")
	public static final Item block = null;
	public CactusAxeItem(ImmersiveMinecraftModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 240;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.CACTUS, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(IMcombotItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u00A72\u4ED9\u4EBA\u638C\u5F88\u8F7B\uFF0C\u8010\u4E45\u4F4E\uFF0C\u65A7\u5934\u5E2E\u4E13\u7528(doge)\u3002"));
			}
		}.setRegistryName("cactus_axe"));
	}
}
