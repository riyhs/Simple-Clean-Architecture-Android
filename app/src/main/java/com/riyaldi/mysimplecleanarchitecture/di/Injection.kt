package com.riyaldi.mysimplecleanarchitecture.di

import com.riyaldi.mysimplecleanarchitecture.data.IMessageDataSource
import com.riyaldi.mysimplecleanarchitecture.data.MessageDataSource
import com.riyaldi.mysimplecleanarchitecture.data.MessageRepository
import com.riyaldi.mysimplecleanarchitecture.domain.IMessageRepository
import com.riyaldi.mysimplecleanarchitecture.domain.MessageInteractor
import com.riyaldi.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}