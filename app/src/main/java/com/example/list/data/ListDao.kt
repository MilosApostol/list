package com.example.list.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface ListDao {

    @Query("SELECT * FROM list")
    suspend fun getAll(): Flow<List<ListEntity>>

    @Query("SELECT * FROM list WHERE id = :listId")
    suspend fun getListId(listId: Int): List<ListEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(list: ListEntity)

    @Update
    suspend fun updateList(list: ListEntity)

    @Delete
    suspend fun deleteList(list: ListEntity)


}