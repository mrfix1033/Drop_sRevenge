package mrfix1033.Drop_sRevenge;

import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements CommandExecutor, Listener {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void a(PlayerDropItemEvent e) {
        e.getItemDrop().setPickupDelay(300);
        e.getItemDrop().addPassenger(e.getPlayer());
    }

    @EventHandler
    public void b(VehicleExitEvent e) {
        if (e.getVehicle().getType() == EntityType.DROPPED_ITEM)
            e.setCancelled(true);
    }
}
