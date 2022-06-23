package lolka.example.PsyPath.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0003H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\""}, d2 = {"Llolka/example/PsyPath/di/AppModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "provideAuthOrSignViewModelFactory", "Llolka/example/PsyPath/presentation/viewmodel/SignOrAuthViewModelFactory;", "useGetPatientDataFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromDatabase;", "provideAuthViewModelFactory", "Llolka/example/PsyPath/presentation/viewmodel/AuthViewModelFactory;", "usePushPatientDataToServer", "Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "useInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "provideContext", "providePatientProfileViewModelFactory", "Llolka/example/PsyPath/presentation/viewmodel/PatientProfileViewModelFactory;", "provideSignInViewModelFactory", "Llolka/example/PsyPath/presentation/viewmodel/SignInViewModelFactory;", "useCheckUser", "Llolka/example/PsyPath/domain/usecase/UseCheckUser;", "provideStateViewModelFactory", "Llolka/example/PsyPath/presentation/viewmodel/StateViewModelFactory;", "useInsertTaskToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "useGetTasksFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "useGetSession", "Llolka/example/PsyPath/domain/usecase/UseGetSession;", "app_release"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.presentation.viewmodel.AuthViewModelFactory provideAuthViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer usePushPatientDataToServer, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.presentation.viewmodel.PatientProfileViewModelFactory providePatientProfileViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromDatabase useGetPatientDataFromDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.presentation.viewmodel.SignOrAuthViewModelFactory provideAuthOrSignViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromDatabase useGetPatientDataFromDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.presentation.viewmodel.StateViewModelFactory provideStateViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetSession useGetSession) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.presentation.viewmodel.SignInViewModelFactory provideSignInViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseCheckUser useCheckUser) {
        return null;
    }
}