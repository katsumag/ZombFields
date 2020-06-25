package me.katsumag.zombfields.commands

import me.katsumag.zombfields.WarriorType
import me.katsumag.zombfields.ZombFields
import me.mattstudios.mf.annotations.Command
import me.mattstudios.mf.annotations.Default
import me.mattstudios.mf.base.CommandBase
import me.mattstudios.mfgui.gui.components.ItemBuilder
import me.mattstudios.mfgui.gui.guis.Gui
import me.mattstudios.mfgui.gui.guis.GuiItem
import org.bukkit.Material
import org.bukkit.command.CommandSender
import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.ItemStack

@Command("army")
class ArmyCommand(private var plugin: ZombFields) : CommandBase() {

    private val inventory: Gui = Gui(plugin, InventoryType.HOPPER, "Warriors")

    init {

        val pane = GuiItem(ItemBuilder(ItemStack(Material.STAINED_GLASS_PANE, 1, 1)).setName("").build())
        inventory.setItem(0, pane)
        inventory.setItem(1, GuiItem(ItemBuilder(ItemStack(Material.SKULL_ITEM,1, 0)).setName("Archers").build()))
        inventory.setItem(2, GuiItem(ItemBuilder(ItemStack(Material.SKULL_ITEM, 1, 3)).setName("Warriors").build()) { event ->
            event.isCancelled = true
        })
        inventory.setItem(3, GuiItem(ItemBuilder(ItemStack(Material.SKULL_ITEM, 1, 4)).setName("Bombers").build()))
        inventory.setItem(4, pane)

        inventory.setDefaultClickAction { event -> event.isCancelled = true}

    }

    @Default
    fun defaultCommand(sender: CommandSender) {
        
    }
    


}
