package com.peeptodo.peep_todo_android.ui.todopage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.peeptodo.peep_todo_android.R
import com.peeptodo.peep_todo_android.databinding.ActivityTodoPageBinding

class TodoPageAcitivity : AppCompatActivity() {
    private lateinit var binding: ActivityTodoPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = (supportFragmentManager.findFragmentById(R.id.todo_main_navHostFragment) as NavHostFragment).navController
        binding.todoMainBottomNavigation.setupWithNavController(navController)
    }
}