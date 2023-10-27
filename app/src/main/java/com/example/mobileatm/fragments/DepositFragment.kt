package com.example.mobileatm.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobileatm.R
import com.example.mobileatm.data.Preference
import com.example.mobileatm.databinding.FragmentDepositBinding

class DepositFragment : Fragment() {
    private lateinit var binding : FragmentDepositBinding
    private lateinit var preference : Preference

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDepositBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preference = Preference(requireContext())
        binding.btnConfirm.setOnClickListener{
            if(binding.etAmount.text.isNotEmpty()) {
                val newBalance = preference.balance + binding.etAmount.text.toString().toFloat()
                preference.balance = newBalance
                findNavController().navigate(R.id.balanceFragment)
            }
        }
    }
}