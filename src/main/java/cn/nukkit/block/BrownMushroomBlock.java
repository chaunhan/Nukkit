package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.Tool;
import cn.nukkit.math.NukkitRandom;

/**
 * Created by Pub4Game on 28.01.2016.
 */
public class BrownMushroomBlock extends Solid {

    public BrownMushroomBlock() {
        this(0);
    }

    public BrownMushroomBlock(int meta) {
        super(meta);
    }

    @Override
    public String getName() {
        return "Brown Mushroom Block";
    }

    @Override
    public int getId() {
        return Block.BROWN_MUSHROOM_BLOCK;
    }

    @Override
    public int getToolType() {
        return Tool.TYPE_AXE;
    }

    @Override
    public double getHardness() {
        return 0.2;
    }

    @Override
    public double getResistance() {
        return 1;
    }

    @Override
    public int[][] getDrops(Item item) {
        if (new NukkitRandom().nextRange(1, 20) == 0) {
            return new int[][]{{Item.BROWN_MUSHROOM, this.meta & 0x03, 1}};
        }
        return new int[][]{};
    }
}
