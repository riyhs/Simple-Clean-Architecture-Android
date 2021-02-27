package com.riyaldi.mysimplecleanarchitecture.data

import com.riyaldi.mysimplecleanarchitecture.domain.IMessageRepository
import com.riyaldi.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository{
    override fun getWelcomeMessage(name: String, place: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name, place)
    }
}