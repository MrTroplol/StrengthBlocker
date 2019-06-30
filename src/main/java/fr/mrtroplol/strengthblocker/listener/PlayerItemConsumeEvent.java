package fr.mrtroplol.strengthblocker.listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class PlayerItemConsumeEvent implements Listener {

    @EventHandler
    public void onConsumeEvent(org.bukkit.event.player.PlayerItemConsumeEvent e)
    {
        if(e.getItem().equals(new ItemStack(Material.POTION, 1, (short) 8233)))
        {
            e.setCancelled(true);
        }
    }
}
