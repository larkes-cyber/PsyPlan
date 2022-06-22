package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/StateViewModel;", "Landroidx/lifecycle/ViewModel;", "useInsertTaskToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "useGetTasksFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "useGetSession", "Llolka/example/PsyPath/domain/usecase/UseGetSession;", "(Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;Llolka/example/PsyPath/domain/usecase/UseGetSession;)V", "lifeResultDatabase", "Landroidx/lifecycle/MutableLiveData;", "", "Llolka/example/PsyPath/domain/model/Task;", "lifeResultDatabaseConst", "Landroidx/lifecycle/LiveData;", "getLifeResultDatabaseConst", "()Landroidx/lifecycle/LiveData;", "getUseGetSession", "()Llolka/example/PsyPath/domain/usecase/UseGetSession;", "getUseGetTasksFromDatabase", "()Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "getUseInsertTaskToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "getSession", "Llolka/example/PsyPath/domain/model/Session;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "", "insertTask", "task", "(Llolka/example/PsyPath/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class StateViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetSession useGetSession = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<lolka.example.PsyPath.domain.model.Task>> lifeResultDatabase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<lolka.example.PsyPath.domain.model.Task>> lifeResultDatabaseConst = null;
    
    public StateViewModel(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetSession useGetSession) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase getUseInsertTaskToDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase getUseGetTasksFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.domain.usecase.UseGetSession getUseGetSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<lolka.example.PsyPath.domain.model.Task>> getLifeResultDatabaseConst() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTasks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTask(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
}