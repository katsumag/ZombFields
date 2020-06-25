package me.katsumag.zombfields.utils.countdown

import me.katsumag.zombfields.utils.getPlugin
import org.bukkit.entity.Player
import java.util.*
import kotlin.collections.HashMap

class CountdownManager {

    companion object {
        val countdowns: HashMap<UUID, Countdown> = HashMap()
    }


    fun addCooldown(p: Player, duration: String) {
        countdowns.put(p.uniqueId, Countdown(getPlugin(), duration))
    }

    fun getCooldown(p: Player): Countdown? {
        return countdowns[p.uniqueId]
    }
}