package com.example.roomdatabase20022023.data.util

import androidx.room.TypeConverter

class PriorityConverter {
    @TypeConverter
    fun toPriority(value: Int) = enumValues<PriorityEnum>()[value]

    @TypeConverter
    fun fromPriority(value: PriorityEnum) = value.ordinal
}