package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.assignment.databinding.ActivityMainBinding
import com.example.assignment.repository.Repository
import com.example.assignment.room.TaskList
import com.example.assignment.room.TaskListDataBase
import com.example.assignment.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
//    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            TaskListDataBase::class.java, "database-name"
        ).build()

        val userDao = db.taskListDao()
        val task = TaskList("asdfasd","pending")
        userDao.insertTask(task)


//        val tasKListDataBase = TaskListDataBase.getInstance(this)
//        val task = TaskList("asdfasd","pending")
//        tasKListDataBase?.taskListDao()?.insertTask(task)

//        val repository = Repository(tasKListDataBase.taskListDao())

//        viewModel = ViewModelProvider(this, ViewModelFactory(repository))[MainViewModel::class.java]

//        val task = TaskList(0, "Task-1", "pending")
//        viewModel.insertTask(task)

    }
}