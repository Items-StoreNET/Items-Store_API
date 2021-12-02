package net.items.store.minigames.api.kit;

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

@Getter
public class Kit {

    private String kitName;
    private int kitPrice;
    private boolean kitDefault;
    private ItemStack kitMainItem;
    @Setter
    private Map<Integer, ItemStack> kitItemList;

    public Kit(String kitName, int kitPrice, boolean kitDefault, ItemStack kitMainItem){
        this.kitName = kitName;
        this.kitPrice = kitPrice;
        this.kitDefault = kitDefault;
        this.kitItemList = Maps.newHashMap();
        this.kitMainItem = kitMainItem;
    }
}
