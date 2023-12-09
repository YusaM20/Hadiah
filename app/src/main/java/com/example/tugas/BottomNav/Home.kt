package com.example.tugas.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.tugas.R
import com.example.tugas.TabLayout.TabActivity
import com.example.tugas.databinding.FragmentHomeBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



class Home : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

        val btnHuhu: TextView = binding.btntab
        btnHuhu.setOnClickListener {
            navigateToMapActivity()
        }
    }

    private fun navigateToMapActivity() {
        val intent = Intent(requireActivity(), TabActivity::class.java)
        startActivity(intent)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}