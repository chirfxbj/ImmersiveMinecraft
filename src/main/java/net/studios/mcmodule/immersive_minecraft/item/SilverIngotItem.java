
package net.studios.mcmodule.immersive_minecraft.item;

import net.studios.mcmodule.immersive_minecraft.itemgroup.OreTabItemGroup;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@ImmersiveMinecraftModElements.ModElement.Tag
public class SilverIngotItem extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:silver_ingot")
	public static final Item block = null;
	public SilverIngotItem(ImmersiveMinecraftModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OreTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("silver_ingot");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u94F6\u952D\u662F\u7194\u94F8\u6210\u952D\u7684\u767D\u94F6\u3002\u51FA\u571F\u94F6\u952D\u4E2D\u5E74\u4EE3\u6700\u65E9\u7684\uFF0C\u662F\u6C49\u666F\u5E1D\u4E2D\u5143\u4E8C\u5E74 (\u516C\u5143\u524D148\u5E74) \u6240\u94F8\u3002\u6C49\u6B66\u5E1D\u5143\u72E9\u56DB\u5E74 (\u516C\u5143\u524D119\u5E74) \u4F5C\u767D\u91D1 (\u5373\u767D\u94F6) \u4E09\u54C1\u3002\u738B\u83BD\u94F8\u6709\u94F6\u8D27\u4E8C\u54C1\u3002\u5176\u540E\u5386\u4EE3\u7686\u6709\u94F8\u9020\uFF0C\u60DF\u6D41\u901A\u4E0D\u5E7F\u3002\u968B\u5510\u4EE5\u524D\u79F0\u94F6\u952D\u4E3A\u201C\u94F6\u997C\u201D\u3001\u201C\u94F6\u94E4\u201D\uFF0C\u79F0\u6241\u5E73\u5F62\u94F6\u5E01\u4E3A\u201C\u94A3\u201D\u3001\u201C\u7B0F\u201D\u3001\u201C\u7248\u201D\uFF0C\u68D2\u5F62\u7684\u79F0\u201C\u94E4\u201D\u3001\u201C\u633A\u201D\uFF0C\u5B8B\u4EE5\u540E\u6539\u79F0\u201C\u94F6\u952D\u201D\u3002\u5143\u4EE3\u4E8E\u94F6\u952D\u4E4B\u5916\u603B\u79F0\u201C\u5143\u5B9D\u201D\uFF0C\u5F62\u5F0F\u53D8\u4E3A\u9A6C\u8E44\u5F62\uFF0C\u6545\u4EA6\u79F0\u201C\u9A6C\u8E44\u94F6\u201D\u3002\u660E\u6E05\u4E24\u4EE3\u5747\u6CBF\u7528\u201C\u5143\u5B9D\u201D\u4E00\u8BCD\u3002"));
		}
	}
}
