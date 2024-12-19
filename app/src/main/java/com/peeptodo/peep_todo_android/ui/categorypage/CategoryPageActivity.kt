package com.peeptodo.peep_todo_android.ui.categorypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peeptodo.peep_todo_android.databinding.ActivityCategoryPageBinding

class CategoryPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}