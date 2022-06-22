package lolka.example.PsyPath.presentation.viewmodel

import androidx.lifecycle.ViewModel

import lolka.example.PsyPath.domain.model.Login
import lolka.example.PsyPath.domain.usecase.UseCheckUser

class SignInViewModel(
    val useCheckUser: UseCheckUser
):ViewModel() {

    suspend fun check(login: Login):String{
        return useCheckUser.execute(login)
    }


}