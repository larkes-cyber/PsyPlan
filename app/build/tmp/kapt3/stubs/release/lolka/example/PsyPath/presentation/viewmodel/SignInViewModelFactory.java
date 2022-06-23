package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/SignInViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "useCheckUser", "Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "useGetPatientDataFromServer", "Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromServer;", "useInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "(Llolka/example/PsyPath/domain/usecase/UseCheckUser;Llolka/example/PsyPath/domain/usecase/UseSaveSession;Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromServer;Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;)V", "getUseCheckUser", "()Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "getUseGetPatientDataFromServer", "()Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromServer;", "getUseInsertPatientDataToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "getUseSaveSession", "()Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
public final class SignInViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromServer useGetPatientDataFromServer = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase = null;
    
    public SignInViewModelFactory(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}