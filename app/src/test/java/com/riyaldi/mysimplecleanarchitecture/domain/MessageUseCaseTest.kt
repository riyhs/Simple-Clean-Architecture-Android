package com.riyaldi.mysimplecleanarchitecture.domain

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {
    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: IMessageRepository

    @Before
    fun setup() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME,","Welcome to $PLACE")
    }

    @Test
    fun `should get data from repository`() {
        messageUseCase.getMessage(NAME, PLACE)

        verify(messageRepository).getWelcomeMessage(NAME, PLACE)
        verifyNoMoreInteractions(messageRepository)
    }

    companion object {
        const val NAME = "Riyaldi"
        const val PLACE = "Clean Architecture"
    }
}