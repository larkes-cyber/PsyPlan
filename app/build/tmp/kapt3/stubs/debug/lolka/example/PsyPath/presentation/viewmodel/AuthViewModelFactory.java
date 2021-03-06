package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/AuthViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "usePushPatientDataToServer", "Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "useInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "useSaveSession", "Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "(Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;Llolka/example/PsyPath/domain/usecase/UseSaveSession;)V", "getUseInsertPatientDataToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "getUsePushPatientDataToServer", "()Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "getUseSaveSession", "()Llolka/example/PsyPath/domain/usecase/UseSaveSession;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class AuthViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer usePushPatientDataToServer = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase useInsertPatientDataToDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseSaveSession useSaveSession = null;
    
    public AuthViewModelFactory(@org.jetbrains.annotations.NotNull()
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
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}