package com.example.assignment.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TaskList::class], version = 1)
abstract class TaskListDataBase : RoomDatabase() {
    abstract fun taskListDao(): TaskListDao
}