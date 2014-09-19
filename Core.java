package net.shitbow.hcf;

import net.shitbow.hcf.brewing.BrewingEvent;
import net.shitbow.hcf.deathban.DeathLightning;
import net.shitbow.hcf.maxenchant.AnvilCancel;
import net.shitbow.hcf.maxenchant.MaxBows;
import net.shitbow.hcf.maxenchant.MaxProtection;
import net.shitbow.hcf.maxenchant.MaxSwords;
import net.shitbow.hcf.utils.DeathMessages;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Core extends JavaPlugin 
{
	public static transient Core instance;
	
	public void onEnable() { 
		instance = this;
		Bukkit.getPluginManager().registerEvents(new BrewingEvent(this), this);
		Bukkit.getPluginManager().registerEvents(new DeathLightning(this), this);
		Bukkit.getPluginManager().registerEvents(new AnvilCancel(this), this);
		Bukkit.getPluginManager().registerEvents(new MaxBows(this), this);
		Bukkit.getPluginManager().registerEvents(new MaxProtection(this), this);
		Bukkit.getPluginManager().registerEvents(new MaxSwords(this), this);
		Bukkit.getPluginManager().registerEvents(new DeathMessages(this), this);
	}
	public void onDisable() {
		
	}
	
}
