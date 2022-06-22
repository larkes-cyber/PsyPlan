package lolka.example.PsyPath.data.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Llolka/example/PsyPath/data/storage/InterfaceService;", "", "getFromDatabase", "Llolka/example/PsyPath/data/storage/models/SomeDataStorage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataFromDatabase", "Llolka/example/PsyPath/data/storage/models/PatientDataStorage;", "getTaskFromDatabase", "", "Llolka/example/PsyPath/data/storage/models/TaskStorage;", "insertPatientDataToDatabase", "", "props", "(Llolka/example/PsyPath/data/storage/models/PatientDataStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTaskToDatabase", "task", "(Llolka/example/PsyPath/data/storage/models/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDatabase", "(Llolka/example/PsyPath/data/storage/models/SomeDataStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface InterfaceService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.storage.models.SomeDataStorage> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.SomeDataStorage props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientDataFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.storage.models.PatientDataStorage> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.PatientDataStorage props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTaskToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.TaskStorage task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTaskFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.data.storage.models.TaskStorage>> continuation);
}