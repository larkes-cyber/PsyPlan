package lolka.example.PsyPath.presentation.viewmodel

import androidx.lifecycle.ViewModel

import lolka.example.PsyPath.domain.model.Login
import lolka.example.PsyPath.domain.model.Session
import lolka.example.PsyPath.domain.usecase.UseCheckUser
import lolka.example.PsyPath.domain.usecase.UseSaveSession

class SignInViewModel(
    val useCheckUser: UseCheckUser,
    val useSaveSession: UseSaveSession
):ViewModel() {

    suspend fun check(login: Login):Session{
        return useCheckUser.execute(login)
    }

    suspend fun saveSession(session: Session){
        return useSaveSession.execute(session)
    }


}