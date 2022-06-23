package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/SignInViewModel;", "Landroidx/lifecycle/ViewModel;", "useCheckUser", "Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "(Llolka/example/PsyPath/domain/usecase/UseCheckUser;Llolka/example/PsyPath/domain/usecase/UseSaveSession;)V", "getUseCheckUser", "()Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "getUseSaveSession", "()Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "check", "Llolka/example/PsyPath/domain/model/Session;", "login", "Llolka/example/PsyPath/domain/model/Login;", "(Llolka/example/PsyPath/domain/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSession", "", "session", "(Llolka/example/PsyPath/domain/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SignInViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession = null;
    
    public SignInViewModel(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object check(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}