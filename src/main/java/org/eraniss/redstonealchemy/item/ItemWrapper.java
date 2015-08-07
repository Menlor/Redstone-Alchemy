package org.eraniss.redstonealchemy.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.eraniss.redstonealchemy.reference.Reference;

public class ItemWrapper extends Item  {
    public ItemWrapper()  {
        super();
    }

    @Override
    public String getUnlocalizedName()  {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", this.getBaseUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack inItemStack)  {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", this.getBaseUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getBaseUnlocalizedName(String inName)  {
        return inName.substring(inName.indexOf(".") + 1); // Strips leading "item." from this part.
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister inIconRegister)  {
        itemIcon = inIconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
