package com.example.assignment.repository

import com.example.assignment.room.TaskList
import com.example.assignment.room.TaskListDao

class Repository(private val taskDao : TaskListDao) {

    fun insertTask(taskList: TaskList) = taskDao.insertTask(taskList)
}