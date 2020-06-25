package me.katsumag.zombfields.utils.countdown

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitRunnable
import sh.okx.timeapi.TimeAPI

class Countdown(var plugin: JavaPlugin, var time: String) {

    private var remaining: Long = 0
    private var isDone: Boolean = false
    private val runnable = object : BukkitRunnable() {
        override fun run() {

            if (remaining == 0L) {
                isDone = true
                cancel()
            }
            remaining--
        }
    }

    fun start() {
        remaining = TimeAPI(time).ticks

        Bukkit.getScheduler().scheduleAsyncRepeatingTask(plugin, runnable, 1, 1)

    }

    fun isExpired(): Boolean {
        return isDone
    }

    fun getRemainingTick(): Long {
        return remaining
    }

}