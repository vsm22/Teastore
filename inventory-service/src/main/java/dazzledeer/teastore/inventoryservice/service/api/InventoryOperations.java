package dazzledeer.teastore.inventoryservice.service.api;

import dazzledeer.teastore.inventoryservice.domain.Item;

import java.util.List;

public interface InventoryOperations {

    public boolean addNewItem(String itemName);

    public List<Item> findItemsByName(String name);
}
