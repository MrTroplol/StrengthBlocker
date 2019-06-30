package fr.mrtroplol.strengthblocker.listener;

import fr.mrtroplol.strengthblocker.StrengthBlocker;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.inventory.BrewerInventory;
import org.bukkit.inventory.ItemStack;

public class BrewingStandEvent implements Listener {

    @EventHandler
    public void onBrewingStand(BrewEvent e)
    {
        BrewerInventory inv = e.getContents();

        boolean containGlow = e.getContents().contains(Material.GLOWSTONE_DUST) ? true : false;
        boolean containForcePotion = false;

        for(ItemStack stack : inv.getContents())
        {
            if(StrengthBlocker.getStrengthPotion().contains(stack))
            {
                containForcePotion=true;
            }
        }

        if(containGlow && containForcePotion)
        {
            e.setCancelled(true);
        }
    }
}
