package dazzledeer.teastore.inventoryservice.data;

import dazzledeer.teastore.inventoryservice.data.api.InventoryRepo;
import dazzledeer.teastore.inventoryservice.domain.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryDAO implements InventoryRepo {

    @Autowired
    private SessionFactory sessionFactory;

    public boolean addItem(Item item) {

        Session session = sessionFactory.getCurrentSession();
        session.save(item);
    }
}
