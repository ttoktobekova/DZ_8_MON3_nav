package com.example.dz_9_mon3.Second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz_9_mon3.LOGIKA.Character
import com.example.dz_9_mon3.LOGIKA.loadImage
import com.example.dz_9_mon3.R
import com.example.dz_9_mon3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val model = it.getSerializable("character") as Character
        binding.apply {
            tvCharacterName.text = model.name
            tvCharacterExistense.text = model.existence
            imgCharacter.loadImage(model.image)
        }

        }
    }


}