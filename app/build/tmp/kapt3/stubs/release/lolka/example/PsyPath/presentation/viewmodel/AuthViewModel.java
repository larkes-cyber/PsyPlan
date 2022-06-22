package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "usePushPatientDataToServer", "Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "useInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "(Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;)V", "lifeResultDatabase", "Landroidx/lifecycle/MutableLiveData;", "Llolka/example/PsyPath/domain/model/SomeData;", "lifeResultDatabaseConst", "Landroidx/lifecycle/LiveData;", "getLifeResultDatabaseConst", "()Landroidx/lifecycle/LiveData;", "lifeResultServer", "lifeResultServerConst", "getLifeResultServerConst", "getUseInsertPatientDataToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "getUsePushPatientDataToServer", "()Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "insertToDatabase", "", "props", "Llolka/example/PsyPath/domain/model/PatientData;", "(Llolka/example/PsyPath/domain/model/PatientData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushToServer", "", "app_release"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer usePushPatientDataToServer = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase = null;
    private androidx.lifecycle.MutableLiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultDatabase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultDatabaseConst = null;
    private androidx.lifecycle.MutableLiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultServer;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.SomeData> lifeResultServerConst = null;
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer usePushPatientDataToServer, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase) {
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
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}