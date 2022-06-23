package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/SignInViewModel;", "Landroidx/lifecycle/ViewModel;", "useCheckUser", "Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "useGetPatientDataFromServer", "Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromServer;", "useInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "(Llolka/example/PsyPath/domain/usecase/UseCheckUser;Llolka/example/PsyPath/domain/usecase/UseSaveSession;Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromServer;Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;)V", "getUseCheckUser", "()Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "getUseGetPatientDataFromServer", "()Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromServer;", "getUseInsertPatientDataToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "getUseSaveSession", "()Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "check", "Llolka/example/PsyPath/domain/model/Session;", "login", "Llolka/example/PsyPath/domain/model/Login;", "(Llolka/example/PsyPath/domain/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientData", "Llolka/example/PsyPath/domain/model/PatientDataServer;", "session", "(Llolka/example/PsyPath/domain/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSession", "", "app_debug"})
public final class SignInViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromServer useGetPatientDataFromServer = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase = null;
    
    public SignInViewModel(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromServer useGetPatientDataFromServer, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase) {
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
    public final lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromServer getUseGetPatientDataFromServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase getUseInsertPatientDataToDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object check(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPatientData(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.PatientDataServer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}