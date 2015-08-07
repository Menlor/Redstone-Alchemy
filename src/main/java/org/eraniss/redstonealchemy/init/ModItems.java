package org.eraniss.redstonealchemy.init;

import cpw.mods.fml.common.registry.GameRegistry;
import org.eraniss.redstonealchemy.item.ItemMortarPestle;
import org.eraniss.redstonealchemy.item.ItemPulvisSolaris;

public class ModItems {
    public static final ItemMortarPestle mortarPestle = new ItemMortarPestle();
    public static final ItemPulvisSolaris pulvisSolaris = new ItemPulvisSolaris();

    public static void init()  {
        GameRegistry.registerItem(mortarPestle, "MortarPestle");
        GameRegistry.registerItem(pulvisSolaris, "PulvisSolaris");
    }
}
