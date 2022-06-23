package lolka.example.PsyPath.data.storage.database_for_goals.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Llolka/example/PsyPath/data/storage/database_for_goals/repository/DataBaseRepository;", "Llolka/example/PsyPath/data/storage/InterfaceService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "someDao", "Llolka/example/PsyPath/data/storage/database_for_goals/dao/SomeDao;", "getSomeDao", "()Llolka/example/PsyPath/data/storage/database_for_goals/dao/SomeDao;", "setSomeDao", "(Llolka/example/PsyPath/data/storage/database_for_goals/dao/SomeDao;)V", "taskDao", "Llolka/example/PsyPath/data/storage/database_for_goals/dao/TaskDao;", "getTaskDao", "()Llolka/example/PsyPath/data/storage/database_for_goals/dao/TaskDao;", "setTaskDao", "(Llolka/example/PsyPath/data/storage/database_for_goals/dao/TaskDao;)V", "getFromDatabase", "Llolka/example/PsyPath/data/storage/models/SomeDataStorage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataFromDatabase", "Llolka/example/PsyPath/data/storage/models/PatientDataStorage;", "getSession", "Llolka/example/PsyPath/data/storage/models/SessionStorage;", "getTaskFromDatabase", "", "Llolka/example/PsyPath/data/storage/models/TaskStorage;", "insertPatientDataToDatabase", "", "props", "(Llolka/example/PsyPath/data/storage/models/PatientDataStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTaskToDatabase", "task", "(Llolka/example/PsyPath/data/storage/models/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDatabase", "(Llolka/example/PsyPath/data/storage/models/SomeDataStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSession", "(Llolka/example/PsyPath/data/storage/models/SessionStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class DataBaseRepository implements lolka.example.PsyPath.data.storage.InterfaceService {
    private final android.content.Context context = null;
    @javax.inject.Inject()
    public lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao taskDao;
    public lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao someDao;
    
    public DataBaseRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao getTaskDao() {
        return null;
    }
    
    public final void setTaskDao(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao getSomeDao() {
        return null;
    }
    
    public final void setSomeDao(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.storage.models.SomeDataStorage> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.SomeDataStorage props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPatientDataFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.storage.models.PatientDataStorage> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.PatientDataStorage props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertTaskToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.TaskStorage task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTaskFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.data.storage.models.TaskStorage>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.SessionStorage props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.storage.models.SessionStorage> continuation) {
        return null;
    }
}