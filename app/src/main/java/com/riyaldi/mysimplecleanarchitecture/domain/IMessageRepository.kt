package com.riyaldi.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String, place: String): MessageEntity
}