package com.example.marvelapp.presentation.characters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.core.domain.model.Character
import com.example.marvelapp.databinding.FragmentCharactersBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment() {

    private var _binding: FragmentCharactersBinding? = null
    private val binding: FragmentCharactersBinding get() = _binding!! //get() - Instanciado no momento que é chamado

    private val charactersAdapter = CharactersAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCharactersBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCharactersAdapter()

        charactersAdapter.submitList(
            listOf(
                Character(
                    "Spider Man",
                    "https://tm.ibxk.com.br/2021/11/11/11150912834388.jpg?ims=704x264"
                ),
                Character(
                    "Spider Man",
                    "https://tm.ibxk.com.br/2021/11/11/11150912834388.jpg?ims=704x264"
                ),
                Character(
                    "Spider Man",
                    "https://tm.ibxk.com.br/2021/11/11/11150912834388.jpg?ims=704x264"
                ),
                Character(
                    "Spider Man",
                    "https://tm.ibxk.com.br/2021/11/11/11150912834388.jpg?ims=704x264"
                )
            )
        )

    }

    private fun initCharactersAdapter() {
        with(binding.recyclerCharacters) {
            setHasFixedSize(true)
            adapter = charactersAdapter
        }
    }

}