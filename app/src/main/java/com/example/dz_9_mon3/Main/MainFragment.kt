package com.example.dz_9_mon3.Main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.dz_9_mon3.LOGIKA.Character
import com.example.dz_9_mon3.R
import com.example.dz_9_mon3.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val characterList = arrayListOf(
        Character(
            "https://static.wikia.nocookie.net/ricksanchez/images/7/71/Rick.jpg/revision/latest?cb=20160605174338",
            "Rick Sanchez ",
            "Alive"
        ),
        Character(
            "https://upload.wikimedia.org/wikipedia/az/4/41/Morty_Smith.jpg",
            "Morty Smith ",
            "Alive"
        ),
        Character(
            "https://static.wikia.nocookie.net/rickandmorty/images/b/bc/Albert_Einstein.png/revision/latest?cb=20150730213810",
            "Albert Einstein ",
            "Dead"
        ),
        Character(
            "https://static.wikia.nocookie.net/rick-y-morty-espanol/images/4/43/Jerry_Smith1.png/revision/latest?cb=20230311072148&path-prefix=es",
            "Jerry Smith ",
            "Alive"
        ),
        Character(
            "https://upload.wikimedia.org/wikipedia/az/4/41/Morty_Smith.jpg",
            "Morti ",
            "Alive"
        ),
        Character(
            "https://upload.wikimedia.org/wikipedia/az/4/41/Morty_Smith.jpg",
            "Morti ",
            "Alive"
        ),
        Character(
            "https://upload.wikimedia.org/wikipedia/az/4/41/Morty_Smith.jpg",
            "Morti ",
            "Alive"
        )

    )
    private val adapter = MainAdapter(characterList,this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MainAdapter(characterList, this::onClick)
        binding.recyclerView.adapter = adapter
    }
    private fun onClick(model:Character){
findNavController().navigate(R.id.secondFragment, bundleOf("character" to model))
    }

}