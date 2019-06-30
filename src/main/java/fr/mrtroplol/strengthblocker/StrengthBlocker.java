package fr.mrtroplol.strengthblocker;

import fr.mrtroplol.strengthblocker.commands.StrengthBlockerCommand;
import fr.mrtroplol.strengthblocker.listener.BrewingStandEvent;
import fr.mrtroplol.strengthblocker.listener.DispenseEvent;
import fr.mrtroplol.strengthblocker.listener.PlayerInteractEvent;
import fr.mrtroplol.strengthblocker.listener.PlayerItemConsumeEvent;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class StrengthBlocker extends JavaPlugin {

    private static StrengthBlocker plugin;

    public static StrengthBlocker getPlugin()
    {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("[StrengthBlocker] Plugin ON");

        getServer().getPluginManager().registerEvents(new BrewingStandEvent(), this);
        getServer().getPluginManager().registerEvents(new DispenseEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerItemConsumeEvent(), this);

        getCommand("strengthblocker").setExecutor(new StrengthBlockerCommand());

        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        System.out.println("[StrengthBlocker] Plugin OFF");
    }

    public static List<ItemStack> getStrengthPotion()
    {
        List<ItemStack> listItem = new ArrayList<>();

        listItem.add(new ItemStack(Material.POTION, 1, (short) 16457));
        listItem.add(new ItemStack(Material.POTION, 1, (short) 16393));
        listItem.add(new ItemStack(Material.POTION, 1, (short) 8265));
        listItem.add(new ItemStack(Material.POTION, 1, (short) 8201));

        return listItem;
    }

    public static List<ItemStack> getStrength2Potions()
    {
        List<ItemStack> listItem = new ArrayList<>();

        listItem.add(new ItemStack(Material.POTION, 1, (short) 16425));
        listItem.add(new ItemStack(Material.POTION, 1, (short) 8233));


        return listItem;
    }

}


