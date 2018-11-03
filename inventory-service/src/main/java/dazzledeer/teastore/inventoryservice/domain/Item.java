package dazzledeer.teastore.inventoryservice.domain;

import lombok.Value;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item")
@Value
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "itemName")
    private String itemName;
}
