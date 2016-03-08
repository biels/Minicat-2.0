package com.biel.mgc;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import com.biel.mgc.game.Game;

/**
 * Common functionality access point
 * @author Biel
 * 
 */
public final class Com {
	static public MinicatGameController getPlugin(){
		Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("MinicatGameController");
		if (plugin == null || !(plugin instanceof MinicatGameController)) {
			return null; // Maybe you want throw an exception instead
		}
		return (MinicatGameController) plugin;
	}
	/**
	 * @return The running Game instance
	 */
	static public Game getGame(){
		return getPlugin().game;
	}
}
