package com.peeptodo.peep_todo_android.ui.mypage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.peeptodo.peep_todo_android.databinding.ActivityMyPageBinding

class MyPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}