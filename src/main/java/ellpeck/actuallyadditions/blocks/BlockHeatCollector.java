package ellpeck.actuallyadditions.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ellpeck.actuallyadditions.tile.TileEntityHeatCollector;
import ellpeck.actuallyadditions.util.IName;
import ellpeck.actuallyadditions.util.ItemUtil;
import ellpeck.actuallyadditions.util.KeyUtil;
import ellpeck.actuallyadditions.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class BlockHeatCollector extends BlockContainerBase implements IName{

    private IIcon topIcon;
    private IIcon bottomIcon;

    public BlockHeatCollector(){
        super(Material.rock);
        this.setHarvestLevel("pickaxe", 0);
        this.setHardness(1.0F);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2){
        return new TileEntityHeatCollector();
    }

    @Override
    public IIcon getIcon(int side, int metadata){
        return side == 1 ? this.topIcon : (side == 0 ? this.bottomIcon : this.blockIcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconReg){
        this.blockIcon = iconReg.registerIcon(ModUtil.MOD_ID_LOWER + ":" + this.getName() + "Side");
        this.topIcon = iconReg.registerIcon(ModUtil.MOD_ID_LOWER + ":" + this.getName() + "Top");
        this.bottomIcon = iconReg.registerIcon(ModUtil.MOD_ID_LOWER + ":" + this.getName() + "Bottom");
    }

    @Override
    public String getName(){
        return "blockHeatCollector";
    }

    public static class TheItemBlock extends ItemBlock{

        private Block theBlock;

        public TheItemBlock(Block block){
            super(block);
            this.theBlock = block;
            this.setHasSubtypes(false);
            this.setMaxDamage(0);
        }

        @Override
        public EnumRarity getRarity(ItemStack stack){
            return EnumRarity.rare;
        }

        @Override
        public String getUnlocalizedName(ItemStack stack){
            return this.getUnlocalizedName();
        }

        @Override
        @SuppressWarnings("unchecked")
        @SideOnly(Side.CLIENT)
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
            if(KeyUtil.isShiftPressed()){
                for(int i = 0; i < 3; i++){
                    list.add(StatCollector.translateToLocal("tooltip." + ModUtil.MOD_ID_LOWER + "." + ((IName)theBlock).getName() + ".desc." + (i + 1)));
                }
            }
            else list.add(ItemUtil.shiftForInfo());
        }

        @Override
        public int getMetadata(int damage){
            return damage;
        }
    }
}