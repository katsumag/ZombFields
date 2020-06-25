package me.katsumag.zombfields.utils

import me.katsumag.zombfields.ZombFields
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.configuration.ConfigurationSection
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.plugin.java.JavaPlugin.getPlugin
import org.bukkit.scheduler.BukkitRunnable

fun String.colour() : String {
    return ChatColor.translateAlternateColorCodes('&', this)
}

fun String.debug() = Bukkit.broadcastMessage("&c(!) [DEBUG] (!)\n&b$this".colour())

fun bukkitRunnable(function: BukkitRunnable.() -> Unit): BukkitRunnable {
    return object: BukkitRunnable() {
        override fun run() {
            function()
        }
    }
}

fun getPluginConfig(): ConfigurationSection {
    return JavaPlugin.getPlugin(ZombFields::class.java).config
}

fun getPlugin(): ZombFields {
    return JavaPlugin.getPlugin(ZombFields::class.java)
}