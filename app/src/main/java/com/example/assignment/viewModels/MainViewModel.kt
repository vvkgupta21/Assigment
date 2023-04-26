package com.example.assignment.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.assignment.repository.Repository
import com.example.assignment.room.TaskList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun insertTask(taskList: TaskList){
        viewModelScope.launch {
            repository.insertTask(taskList)
        }
    }
}