package com.example.mobileatm.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobileatm.R
import com.example.mobileatm.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnShowBalance.setOnClickListener {
            findNavController().navigate(R.id.balanceFragment)
        }
        binding.btnDeposit.setOnClickListener{
            findNavController().navigate(R.id.depositFragment)
        }
        binding.btnWithdraw.setOnClickListener{
            findNavController().navigate(R.id.withdrawFragment)
        }
        binding.btnExit.setOnClickListener{
            findNavController().navigate(R.id.loginFragment)
        }
    }

}