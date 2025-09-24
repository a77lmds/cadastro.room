package com.alas7.lemos.dao
import androidx.room.*

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    suspend fun getAll(): List<Product>
    @Insert
    suspend fun insert(product: Product)
}