package fr.mrtroplol.strengthblocker.listener;

import fr.mrtroplol.strengthblocker.StrengthBlocker;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractEvent implements Listener {

    @EventHandler
    public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent event)
    {
        if (event.getItem() == null)
        {
            return;
        }

        if(event.getMaterial() != Material.POTION)
        {
            return;
        }

        //getMaterial == potion

        if(event.getItem().equals(new ItemStack(Material.POTION, 1, (short) 8233)))
        {
            event.getPlayer().sendMessage(StrengthBlocker.getPlugin().getConfig().getString("replace.potion").replaceAll("&", "§"));
            event.setCancelled(true);
            event.getItem().setDurability((short) 8265);
        }

        if(event.getItem().equals(new ItemStack(Material.POTION, 1, (short) 16425))) {
            event.getPlayer().sendMessage(StrengthBlocker.getPlugin().getConfig().getString("replace.splash").replaceAll("&", "§"));
            event.setCancelled(true);
            event.getItem().setDurability((short) 16457);
        }
    }
}
