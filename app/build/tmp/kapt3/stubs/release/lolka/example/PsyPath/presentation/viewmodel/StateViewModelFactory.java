package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/StateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "useGetTasksFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "useInsertTaskToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "useGetSession", "Llolka/example/PsyPath/domain/usecase/UseGetSession;", "(Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;Llolka/example/PsyPath/domain/usecase/UseGetSession;)V", "getUseGetSession", "()Llolka/example/PsyPath/domain/usecase/UseGetSession;", "getUseGetTasksFromDatabase", "()Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "getUseInsertTaskToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"})
public final class StateViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetSession useGetSession = null;
    
    public StateViewModelFactory(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetSession useGetSession) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase getUseGetTasksFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase getUseInsertTaskToDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseGetSession getUseGetSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}