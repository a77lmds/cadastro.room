package com.alas7.lemos.dao

@dao
interface UserDao {
    @Query("SELECT * FROM users")
    suspend fun getAll(): List<User>
    @Insert
    suspend fun insert(user: User)
}