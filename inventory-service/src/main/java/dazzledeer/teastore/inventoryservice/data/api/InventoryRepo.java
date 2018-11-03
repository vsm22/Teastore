package dazzledeer.teastore.inventoryservice.data.api;

import dazzledeer.teastore.inventoryservice.domain.Item;

public interface InventoryRepo {

    /**
     * Add a new item to the inventory.
     *
     * @param item
     * @return
     */
    public boolean addItem(Item item);
}
