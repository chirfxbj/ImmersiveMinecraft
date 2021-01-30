
package net.studios.mcmodule.immersive_minecraft.block;

import net.studios.mcmodule.immersive_minecraft.itemgroup.OreTabItemGroup;
import net.studios.mcmodule.immersive_minecraft.ImmersiveMinecraftModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.List;
import java.util.Collections;

@ImmersiveMinecraftModElements.ModElement.Tag
public class RhodoniteBlock extends ImmersiveMinecraftModElements.ModElement {
	@ObjectHolder("immersive_minecraft:rhodonite")
	public static final Block block = null;
	public RhodoniteBlock(ImmersiveMinecraftModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(OreTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("rhodonite");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void addInformation(ItemStack itemstack, IBlockReader world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u8537\u8587\u8F89\u77F3\u662F\u4E00\u79CD\u7845\u9178\u76D0\u77FF\u7269\uFF0C\u4EA7\u4E8E\u5404\u79CD\u9530\u77FF\u77F3\u4E2D\u3002\u5B83\u4E3B\u8981\u88AB\u7528\u4F5C\u88C5\u9970\u77F3\u6599\u6216\u9970\u54C1\u53CA\u96D5\u5851\u54C1\u3002\u8537\u8587\u8F89\u77F3\u7684\u6676\u4F53\u4E3A\u677F\u72B6\u6216\u677F\u67F1\u72B6\uFF0C\u6676\u4F53\u7684\u96C6\u5408\u4F53\u4E3A\u7C92\u72B6\u6216\u5757\u72B6\uFF0C\u6D45\u7C89\u5230\u7EA2\u8272\u6709\u73BB\u7483\u5149\u6CFD\u3002\u8537\u8587\u8F89\u77F3\u8868\u9762\u88AB\u6C27\u5316\u540E\u5E38\u51FA\u73B0\u4E00\u4E9B\u9ED1\u8272\uFF0C\u90A3\u662F\u9530\u7684\u6C27\u5316\u7269\u548C\u6C22\u6C27\u5316\u7269\u5F62\u6210\u7684\u8584\u819C\u3002"));
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;
					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;
					if (!dimensionCriteria)
						return false;
					return super.place(world, generator, rand, pos, config);
				}
			}.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("rhodonite", "rhodonite", blockAt -> {
				boolean blockCriteria = false;
				if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}), block.getDefaultState(), 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 8, 8, 65))));
		}
	}
}
