package com.riyaldi.mysimplecleanarchitecture.data

import com.riyaldi.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String, place: String): MessageEntity {
        return MessageEntity("Hello $name", "Welcome to $place")
    }
}