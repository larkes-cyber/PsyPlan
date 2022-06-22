package lolka.example.PsyPath.data.storage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Llolka/example/PsyPath/data/storage/Service;", "Llolka/example/PsyPath/data/storage/InterfaceService;", "context", "Landroid/content/Context;", "dataBaseRepository", "Llolka/example/PsyPath/data/storage/database_for_goals/repository/DataBaseRepository;", "patientData", "Llolka/example/PsyPath/data/storage/user_data/PatientData;", "(Landroid/content/Context;Llolka/example/PsyPath/data/storage/database_for_goals/repository/DataBaseRepository;Llolka/example/PsyPath/data/storage/user_data/PatientData;)V", "getFromDatabase", "Llolka/example/PsyPath/data/storage/models/SomeDataStorage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataFromDatabase", "Llolka/example/PsyPath/data/storage/models/PatientDataStorage;", "getTaskFromDatabase", "", "Llolka/example/PsyPath/data/storage/models/TaskStorage;", "insertPatientDataToDatabase", "", "props", "(Llolka/example/PsyPath/data/storage/models/PatientDataStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTaskToDatabase", "task", "(Llolka/example/PsyPath/data/storage/models/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDatabase", "(Llolka/example/PsyPath/data/storage/models/SomeDataStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class Service implements lolka.example.PsyPath.data.storage.InterfaceService {
    private final lolka.example.PsyPath.data.storage.database_for_goals.repository.DataBaseRepository dataBaseRepository = null;
    private final lolka.example.PsyPath.data.storage.user_data.PatientData patientData = null;
    private final android.content.Context context = null;
    
    public Service(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.repository.DataBaseRepository dataBaseRepository, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.user_data.PatientData patientData) {
        super();
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
}