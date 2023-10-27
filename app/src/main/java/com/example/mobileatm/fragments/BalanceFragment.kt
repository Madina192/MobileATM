package com.example.mobileatm.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobileatm.R
import com.example.mobileatm.data.Preference
import com.example.mobileatm.databinding.FragmentBalanceBinding
import com.example.mobileatm.databinding.FragmentMainBinding

class BalanceFragment : Fragment() {

    private lateinit var binding: FragmentBalanceBinding
    private lateinit var preference : Preference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBalanceBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preference = Preference(requireContext())
        binding.tvBalance.text = preference.balance.toString()
    }
}