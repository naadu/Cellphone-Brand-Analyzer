package com.example.ExamTopPhonesApp.ui.huawei

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ExamTopPhonesApp.R
import com.example.ExamTopPhonesApp.databinding.FragmentGalleryBinding


class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var isImage1 = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        val btnNext: Button = binding.btnNext
        val imageView: ImageView = binding.imageView

        btnNext.setOnClickListener {
            // Toggle between image1 and image2
            isImage1 = !isImage1

            // Change the image based on the flag
            if (isImage1) {
                imageView.setImageResource(R.drawable.huawei)
            } else {
                imageView.setImageResource(R.drawable.huawei2)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}