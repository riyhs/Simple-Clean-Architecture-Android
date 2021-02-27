package com.riyaldi.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String, place: String): MessageEntity
}