package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "usePushPatientDataToServer", "Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "useInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "(Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;Llolka/example/PsyPath/domain/usecase/UseSaveSession;)V", "lifeResultDatabase", "Landroidx/lifecycle/MutableLiveData;", "Llolka/example/PsyPath/domain/model/SomeData;", "lifeResultDatabaseConst", "Landroidx/lifecycle/LiveData;", "getLifeResultDatabaseConst", "()Landroidx/lifecycle/LiveData;", "lifeResultServer", "lifeResultServerConst", "getLifeResultServerConst", "getUseInsertPatientDataToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "getUsePushPatientDataToServer", "()Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "getUseSaveSession", "()Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "insertToDatabase", "", "props", "Llolka/example/PsyPath/domain/model/PatientData;", "(Llolka/example/PsyPath/domain/model/PatientData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushToServer", "Llolka/example/PsyPath/domain/model/Session;", "saveSession", "(Llolka/example/PsyPath/domain/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer usePushPatientDataToServer = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession = null;
    private androidx.lifecycle.MutableLiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultDatabase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultDatabaseConst = null;
    private androidx.lifecycle.MutableLiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultServer;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultServerConst = null;
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer usePushPatientDataToServer, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer getUsePushPatientDataToServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase getUseInsertPatientDataToDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseSaveSession getUseSaveSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.SomeData> getLifeResultDatabaseConst() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.SomeData> getLifeResultServerConst() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object pushToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}