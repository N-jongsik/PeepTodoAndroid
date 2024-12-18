package com.peeptodo.peep_todo_andorid.ui.categorypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peeptodo.peep_todo_andorid.databinding.ActivityCategoryPageBinding

class CategoryPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}