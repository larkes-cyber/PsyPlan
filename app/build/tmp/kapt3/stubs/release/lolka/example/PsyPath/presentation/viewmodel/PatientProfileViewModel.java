package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/PatientProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "useGetPatientDataFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromDatabase;", "(Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromDatabase;)V", "lifeResultDatabase", "Landroidx/lifecycle/MutableLiveData;", "Llolka/example/PsyPath/domain/model/PatientData;", "lifeResultDatabaseConst", "Landroidx/lifecycle/LiveData;", "getLifeResultDatabaseConst", "()Landroidx/lifecycle/LiveData;", "getUseGetPatientDataFromDatabase", "()Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromDatabase;", "getUserData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class PatientProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromDatabase useGetPatientDataFromDatabase = null;
    private androidx.lifecycle.MutableLiveData<lolka.example.PsyPath.domain.model.PatientData> lifeResultDatabase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.PatientData> lifeResultDatabaseConst = null;
    
    public PatientProfileViewModel(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromDatabase useGetPatientDataFromDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromDatabase getUseGetPatientDataFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<lolka.example.PsyPath.domain.model.PatientData> getLifeResultDatabaseConst() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}