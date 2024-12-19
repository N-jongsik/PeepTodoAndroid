package com.peeptodo.peep_todo_android.ui.categorypage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peeptodo.peep_todo_android.databinding.FragmentCategoryAddPageBinding

class AddPageFragment : Fragment() {
    private var _binding : FragmentCategoryAddPageBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryAddPageBinding.inflate(inflater, container, false)
        // binding.view의 id 로 불러서 씀
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}