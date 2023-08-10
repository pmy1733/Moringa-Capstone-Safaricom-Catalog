package com.meroka.repository;

import com.meroka.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//repository that extends CrudRepository
@Repository
public interface ProductsRepository extends JpaRepository<Product, Long>
{
}
