package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/SignInViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "useCheckUser", "Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "(Llolka/example/PsyPath/domain/usecase/UseCheckUser;Llolka/example/PsyPath/domain/usecase/UseSaveSession;)V", "getUseCheckUser", "()Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "getUseSaveSession", "()Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class SignInViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession = null;
    
    public SignInViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseCheckUser getUseCheckUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseSaveSession getUseSaveSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}