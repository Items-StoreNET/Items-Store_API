package net.items.store.minigames.api.map;

import com.google.common.collect.Lists;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.List;

@Getter
public abstract class AbstractMap {
	
	private String mapName;
	private World world;
	private List<Location> locationList;

	public AbstractMap(String mapName, World world){
		this.mapName = mapName;
		this.locationList = Lists.newArrayList();
		this.world = world;
	}
}
