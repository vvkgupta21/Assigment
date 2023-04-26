package com.example.assignment.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskList(
    val taskName: String,
    val status: String
)