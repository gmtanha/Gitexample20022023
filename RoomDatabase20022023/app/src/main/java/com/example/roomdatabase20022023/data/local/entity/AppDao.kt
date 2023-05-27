package com.example.roomdatabase20022023.data.local.entity

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AppDao {

    @Query("SELECT * FROM work")
    suspend fun getListWorks(): List<WorkEntity>

    @Insert(entity = WorkEntity::class)
    suspend fun addWorks(workEntity: WorkEntity)

    @Insert(entity = Priority::class)
    suspend fun addPriority(priority: List<Priority>)

    @Query("SELECT * FROM priority")
    suspend fun getPriority(): List<Priority>
}