package com.example.assignment.room

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TaskListDao {
    @Insert
    fun insertTask(vararg task : TaskList)
}