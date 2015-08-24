package ellpeck.actuallyadditions.gadget.cloud;

import ellpeck.actuallyadditions.blocks.InitBlocks;
import ellpeck.actuallyadditions.items.InitItems;
import ellpeck.actuallyadditions.util.AssetUtil;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class SmileyCloudEasterEggs{

    public static final ArrayList<ISmileyCloudEasterEgg> cloudStuff = new ArrayList<ISmileyCloudEasterEgg>();

    static{
        //Glenthor
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"glenthor", "glenthorlp", "twoofeight"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(true, new ItemStack(Items.dye, 1, 2));
                renderHeadBlock(InitBlocks.blockHeatCollector, 0, 5F);
            }
        });
        //Ellpeck
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"ellpeck", "ellopecko", "peck"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(false, new ItemStack(InitItems.itemPhantomConnector));
                renderHeadBlock(InitBlocks.blockPhantomLiquiface, 0, 25F);
            }
        });
        //Tyrex
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"tyrex", "lord_tobinho", "tobinho"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(false, new ItemStack(Items.fishing_rod));
                renderHoldingItem(true, new ItemStack(Items.fish));
            }
        });
        //Hose
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"dqmhose", "xdqmhose", "hose"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(false, new ItemStack(Items.reeds));
                renderHeadBlock(Blocks.torch, 0, 15F);
            }
        });
        //Tobi
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"jemx", "jemxx", "jemxxx", "spielertobi200"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(true, new ItemStack(Items.milk_bucket));
                renderHeadBlock(Blocks.lit_redstone_lamp, 0, 35F);
            }
        });
        //Vazkii
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"vazkii", "vaski", "waskie"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(true, new ItemStack(Items.dye, 1, 15));
                renderHeadBlock(Blocks.red_flower, 5, 20F);
            }
        });
        //Kitty
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"kitty", "kiddy", "kittyvancat", "kittyvancatlp"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(true, new ItemStack(Items.fish));
                renderHoldingItem(false, new ItemStack(Items.milk_bucket));
                renderHeadBlock(Blocks.wool, 10, 15F);
            }
        });
        //Canitzp
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"canitz", "canitzp", "kannnichts", "kannnichtsp"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(false, new ItemStack(Items.wooden_sword));
                renderHeadBlock(Blocks.chest, 10, 70F);
            }
        });
        //Lari
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"lari", "larixine", "xine", "laxi", "lachsirine", "lala", "lalilu"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(false, new ItemStack(Items.iron_helmet));
                renderHeadBlock(Blocks.cake, 0, 28F);
            }
        });
        //RotesDing
        register(new ISmileyCloudEasterEgg(){
            @Override
            public String[] getTriggerNames(){
                return new String[]{"rotesding", "dotesring"};
            }
            @Override
            public void renderExtra(float f){
                renderHoldingItem(false, new ItemStack(Items.milk_bucket));
                renderHoldingItem(true, new ItemStack(Items.dye, 1, 1));
                renderHeadBlock(Blocks.wool, 14, 18F);
            }
        });
    }

    private static void register(ISmileyCloudEasterEgg egg){
        cloudStuff.add(egg);
    }

    private static void renderHoldingItem(boolean leftHand, ItemStack stack){
        GL11.glPushMatrix();

        GL11.glRotatef(180F, 0F, 0F, 1F);
        GL11.glRotatef(270F, 0F, 1F, 0F);
        GL11.glTranslatef(0F, -1.5F, 0F);
        GL11.glTranslatef(-0.5F, 0.2F, leftHand ? 0.55F : -0.5F);
        GL11.glScalef(0.75F, 0.75F, 0.75F);

        AssetUtil.renderItem(stack, 0);

        GL11.glPopMatrix();
    }

    private static void renderHeadBlock(Block block, int meta, float rotation){
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glTranslatef(-0.015F, 0.6F, 0.075F);
        GL11.glScalef(0.3F, 0.3F, 0.3F);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        GL11.glRotatef(rotation, 0F, 1F, 0F);

        AssetUtil.renderBlock(block, meta);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}
