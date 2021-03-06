package lolka.example.PsyPath.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u001b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u001c\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010\'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010+\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010,\u001a\u00020-2\u0006\u0010#\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010.\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Llolka/example/PsyPath/data/repository/UserRepositoryData;", "Llolka/example/PsyPath/domain/repository/UserRepository;", "service", "Llolka/example/PsyPath/data/storage/Service;", "retrofitRepository", "Llolka/example/PsyPath/data/retrofit/repository/RetrofitRepository;", "(Llolka/example/PsyPath/data/storage/Service;Llolka/example/PsyPath/data/retrofit/repository/RetrofitRepository;)V", "checkUser", "Llolka/example/PsyPath/domain/model/Session;", "login", "Llolka/example/PsyPath/domain/model/Login;", "(Llolka/example/PsyPath/domain/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMessages", "", "Llolka/example/PsyPath/domain/model/Message;", "props", "Llolka/example/PsyPath/domain/model/UserDataToGetMessages;", "(Llolka/example/PsyPath/domain/model/UserDataToGetMessages;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFromDatabase", "Llolka/example/PsyPath/domain/model/SomeData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataFromServer", "Llolka/example/PsyPath/domain/model/PatientDataServer;", "session", "(Llolka/example/PsyPath/domain/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataToDatabase", "Llolka/example/PsyPath/domain/model/PatientData;", "getSession", "getSomeDataFromServer", "getTasksFromDatabase", "Llolka/example/PsyPath/domain/model/Task;", "insertPatientDataToDatabase", "", "(Llolka/example/PsyPath/domain/model/PatientData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTaskToDatabase", "task", "(Llolka/example/PsyPath/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDataBase", "(Llolka/example/PsyPath/domain/model/SomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushMessageToServer", "", "(Llolka/example/PsyPath/domain/model/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushPatientDataToServer", "pushSomeDataToServer", "pushTaskToServer", "", "saveSession", "app_debug"})
public final class UserRepositoryData implements lolka.example.PsyPath.domain.repository.UserRepository {
    private final lolka.example.PsyPath.data.storage.Service service = null;
    private final lolka.example.PsyPath.data.retrofit.repository.RetrofitRepository retrofitRepository = null;
    
    public UserRepositoryData(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.Service service, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.retrofit.repository.RetrofitRepository retrofitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object pushSomeDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.SomeData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSomeDataFromServer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.SomeData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertToDataBase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.SomeData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.SomeData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object pushPatientDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllMessages(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.UserDataToGetMessages props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.domain.model.Message>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object pushMessageToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Message props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.PatientData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertTaskToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTasksFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.domain.model.Task>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object pushTaskToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkUser(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPatientDataFromServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.PatientDataServer> continuation) {
        return null;
    }
}