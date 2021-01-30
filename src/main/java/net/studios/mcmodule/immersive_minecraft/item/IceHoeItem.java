
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
import net.minecraft.item.HoeItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;

import java.util.List;

@ImmersiveMinecraftModElements.ModElement.Tag
public class IceHoeItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:ice_hoe")
	public static final Item block = null;
	public IceHoeItem(ImmersiveMinecraftModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 212;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.ICE, (int) (1)), new ItemStack(Blocks.PACKED_ICE, (int) (1)),
						new ItemStack(Blocks.FROSTED_ICE, (int) (1)), new ItemStack(Blocks.BLUE_ICE, (int) (1)));
			}
		}, 1f, new Item.Properties().group(IMcombotItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A7b\u53EA\u662F\u5DE5\u5177 = ="));
			}
		}.setRegistryName("ice_hoe"));
	}
}
