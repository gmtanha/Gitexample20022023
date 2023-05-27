package com.example.roomdatabase20022023.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.roomdatabase20022023.data.util.PriorityEnum

@Entity(tableName = "priority")
data class Priority(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @TypeConverters(PriorityEnum::class)
    @ColumnInfo(name = "name")
    val priorityEnum: PriorityEnum
){
    companion object {
        fun getDataMock(): List<Priority> {
            return mutableListOf<Priority>().apply {
                add(Priority(null, PriorityEnum.LOW))
                add(Priority(null, PriorityEnum.MEDIUM))
                add(Priority(null, PriorityEnum.HIGH))
            }
        }
    }
}