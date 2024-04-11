package com.example.ExamTopPhonesApp.ui.iphone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ExamTopPhonesApp.databinding.FragmentIphoneBinding

class iphoneFragment : Fragment(){


    private var _binding: FragmentIphoneBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val iphoneViewModel =
            ViewModelProvider(this)[iphoneViewModel::class.java]

        _binding = FragmentIphoneBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textIphone
        iphoneViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}