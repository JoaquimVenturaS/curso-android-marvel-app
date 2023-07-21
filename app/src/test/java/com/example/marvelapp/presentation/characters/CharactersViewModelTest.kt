package com.example.marvelapp.presentation.characters

import androidx.paging.PagingData
import com.example.core.domain.model.Character
import com.example.core.useCase.GetCharactersUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CharactersViewModelTest {

    @OptIn(ExperimentalCoroutinesApi::class)
    val testDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()

    @Mock
    lateinit var getCharactersUseCase: GetCharactersUseCase

    private lateinit var charactersViewModel: CharactersViewModel

    @Before
    fun setUp() {
        charactersViewModel = CharactersViewModel(getCharactersUseCase)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `should validate the paging data object values when calling charactersPagingData`() =
        runBlockingTest {
            val expectedPagingData = PagingData.from(
                listOf(
                    Character(

                    )
                )
            )

            val result = charactersViewModel.charactersPagingData("").first()
        }

}