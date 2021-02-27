package com.riyaldi.mysimplecleanarchitecture.domain

class MessageInteractor(private val messageRepository: IMessageRepository): MessageUseCase {
    override fun getMessage(name: String, place: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name, place)
    }
}


























