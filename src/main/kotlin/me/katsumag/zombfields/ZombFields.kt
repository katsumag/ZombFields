package me.katsumag.zombfields

import me.mattstudios.mf.base.CommandManager
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class ZombFields : JavaPlugin() {

    lateinit var commandManager: CommandManager

    override fun onEnable() {

        dataFolder.mkdirs()
        saveResource("config.yml", false)

    }

    override fun onDisable() {

    }
}