package lolka.example.PsyPath.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Llolka/example/PsyPath/presentation/viewmodel/StateViewModel;", "Landroidx/lifecycle/ViewModel;", "useInsertTaskToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "useGetTasksFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "(Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;)V", "lifeResultDatabase", "Landroidx/lifecycle/MutableLiveData;", "", "Llolka/example/PsyPath/domain/model/Task;", "lifeResultDatabaseConst", "Landroidx/lifecycle/LiveData;", "getLifeResultDatabaseConst", "()Landroidx/lifecycle/LiveData;", "getUseGetTasksFromDatabase", "()Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "getUseInsertTaskToDatabase", "()Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "getTasks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTask", "task", "(Llolka/example/PsyPath/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class StateViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<lolka.example.PsyPath.domain.model.Task>> lifeResultDatabase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<lolka.example.PsyPath.domain.model.Task>> lifeResultDatabaseConst = null;
    
    public StateViewModel(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase useInsertTaskToDatabase, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase useGetTasksFromDatabase) {
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
}