/**
 * @Repository annotation specifies that this interface is a repository and Spring will create an instance of it automatically.
 * The JpaRepository interface provides a set of methods for performing CRUD (Create, Read, Update, Delete) operations on the "Product" entity.
 */

package com.example.SpringBootApps.repository;

import com.example.SpringBootApps.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Product entity
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
