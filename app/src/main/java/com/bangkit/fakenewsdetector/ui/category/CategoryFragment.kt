package com.bangkit.fakenewsdetector.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.bangkit.fakenewsdetector.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {
    private var _binding: FragmentCategoryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(CategoryViewModel::class.java)

        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCategory
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
        // Inflate the layout for this fragment
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}