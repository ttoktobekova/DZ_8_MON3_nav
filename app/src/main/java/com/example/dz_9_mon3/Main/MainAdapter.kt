package com.example.dz_9_mon3.Main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.dz_9_mon3.LOGIKA.Character
import com.example.dz_9_mon3.LOGIKA.loadImage
import com.example.dz_9_mon3.databinding.ItemCharacterBinding

class MainAdapter(private val characterList: ArrayList<Character>
,val onClick:(model:Character)->Unit ):
    Adapter<MainAdapter.MainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int =characterList.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
holder.bind(characterList[position])    }


    inner class MainViewHolder(private val binding: ItemCharacterBinding) : ViewHolder(binding.root) {
        fun bind(character: Character) {
            binding.apply {
                character.apply {
                    tvCharacterName.text = name
                    tvCharacterExistense.text = existence
                    imgCharacter.loadImage(image)
                    itemView.setOnClickListener{
                        onClick(character)
                    }
                }



            }

        }

    }
}