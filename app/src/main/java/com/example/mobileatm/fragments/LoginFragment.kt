package com.example.mobileatm.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.mobileatm.R
import com.example.mobileatm.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfUsers = ArrayList<HashMap<String, String>>()
        val map = HashMap<String, String>();
        map["login"] = "madina";
        map["password"] = "12345";
        listOfUsers.add(map)
        binding.btnLogin.setOnClickListener{
            for (element in listOfUsers) {
                if(binding.etLogin.text.toString() == element["login"] && binding.etPassword.text.toString() == element["password"]) {
                    findNavController().navigate(R.id.mainFragment)
                } else {
                    Toast.makeText(requireContext(), "Login or password is incorrect", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}