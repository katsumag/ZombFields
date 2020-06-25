package me.katsumag.zombfields

import me.katsumag.zombfields.utils.getPluginConfig
import org.bukkit.configuration.ConfigurationSection

enum class WarriorType(var config: ConfigurationSection) {

    ARCHERS(getPluginConfig().getConfigurationSection("Archers")),
    WARRIORS(getPluginConfig().getConfigurationSection("Warriors")),
    BOMBERS(getPluginConfig().getConfigurationSection("Bombers"));

    fun getConfigurationSection(): ConfigurationSection {
        return config
    }

    fun getCooldownTime(): Double {
        return config.getDouble("cooldown")
    }

    fun getAmount(): Int {
        return config.getInt("amount")
    }

}