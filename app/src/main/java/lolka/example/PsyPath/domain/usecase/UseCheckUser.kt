package lolka.example.PsyPath.domain.usecase

import lolka.example.PsyPath.domain.model.Login
import lolka.example.PsyPath.domain.repository.UserRepository

class UseCheckUser(val userRepository: UserRepository) {

    suspend fun execute(login: Login):String{
        return userRepository.checkUser(login = login)
    }

}