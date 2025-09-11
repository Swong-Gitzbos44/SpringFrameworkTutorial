/**
 * The @Entity annotation specifies that this class is an entity and should be mapped to a database table.
 * The @Table annotation specifies the name of the database table that will store instances of this entity.
 * The @Id annotation specifies the primary key of the entity.
 * The @GeneratedValue annotation specifies that the primary key should be generated automatically.
 */

package com.example.SpringBootApps.entity;
import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int quantity;

    // Constructors, getters and setters, and other methods...

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
