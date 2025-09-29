package com.mysports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mysports.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment() {

    private var _binding: FragmentMySportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMySportsBinding.inflate(inflater, container, false)

        // Navigate to Football
        binding.btnFootball.setOnClickListener {
            findNavController().navigate(R.id.footballFragment)
        }

        // Navigate to Basketball
        binding.btnBasketball.setOnClickListener {
            findNavController().navigate(R.id.basketballFragment)
        }

        // Navigate to Volleyball
        binding.btnVolleyball.setOnClickListener {
            findNavController().navigate(R.id.volleyballFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
