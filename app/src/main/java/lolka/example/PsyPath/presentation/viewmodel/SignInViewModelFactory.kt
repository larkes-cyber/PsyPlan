package lolka.example.PsyPath.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import lolka.example.PsyPath.domain.usecase.UseCheckUser

class SignInViewModelFactory(
    val useCheckUser: UseCheckUser
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SignInViewModel(
            useCheckUser = useCheckUser
        ) as T
    }
}