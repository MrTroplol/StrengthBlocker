package fr.mrtroplol.strengthblocker.listener;

import fr.mrtroplol.strengthblocker.StrengthBlocker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

public class DispenseEvent implements Listener {

    @EventHandler
    public void onDispenseEvent(BlockDispenseEvent e)
    {
        if(StrengthBlocker.getStrength2Potions().contains(e.getItem()))
        {
            e.setCancelled(true);
        }
    }
}
