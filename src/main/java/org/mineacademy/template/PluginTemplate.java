package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplate extends SimplePlugin {

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {

		System.out.println(1);
		System.out.println("knock knocks");

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {

		/*
		 * This makes all animals explode upon right clicking them!
		 * Weakest to strongest explosion:
		 * (Chicken, Pig, Cow, Sheep, Horse, Squid, MushroomCow, Ocelot, Rabbit, Bat)
		 */

		final int explosionValue = 1;

		if (event.getRightClicked().getType() == EntityType.CHICKEN)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 2 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.PIG)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 4 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.COW)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 6 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.SHEEP)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 8 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.HORSE)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 10 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.SQUID)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 12 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.MUSHROOM_COW)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 14 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.OCELOT)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 16 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.RABBIT)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 18 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.BAT)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 20 * explosionValue);

		if (event.getRightClicked().getType() == EntityType.WOLF)
			event.getPlayer().sendMessage("NOoo... :(");

		if (event.getRightClicked().getType() == EntityType.VILLAGER)
			event.getPlayer().sendMessage("Ha ha ha! I'm no DUMB animal you can't EXPLODE me!");

		/*
		 * This makes hostile mobs catch on fire when right clicked!
		 * (Zombies, Skeletons, Spiders, Creepers, Slimes, Endermen, Silverfish, Witch, Endermite, Guardian)
		 * All hostile mobs except those that fire would do no harm!
		 */
		final int howLongBeOnFire = 20 * 60;

		if (event.getRightClicked().getType() == EntityType.ZOMBIE)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.SLIME)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.GUARDIAN)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.ENDERMITE)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.WITCH)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.SILVERFISH)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.ENDERMAN)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.CREEPER)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.CAVE_SPIDER)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.SPIDER)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.SKELETON)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

		if (event.getRightClicked().getType() == EntityType.ZOMBIE_VILLAGER)
			event.getRightClicked().setFireTicks(howLongBeOnFire);

	}

}
