package com.peeptodo.peep_todo_android.ui.todopage.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peeptodo.peep_todo_android.databinding.FragmentTodoMainPageBinding
import com.peeptodo.peep_todo_android.ui.mypage.MyPageActivity

class MainPageFragment : Fragment() {

    private var _binding : FragmentTodoMainPageBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTodoMainPageBinding.inflate(inflater, container, false)
        // binding.view의 id 로 불러서 씀

        binding.textView.setOnClickListener {
            // MyPageActivity로 이동
            val intent = Intent(requireContext(), MyPageActivity::class.java)
            startActivity(intent)
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}