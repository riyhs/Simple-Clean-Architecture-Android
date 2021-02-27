package com.riyaldi.mysimplecleanarchitecture.data

import com.riyaldi.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String, place: String): MessageEntity
}