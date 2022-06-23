package lolka.example.PsyPath.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0016\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010&\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010)\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Llolka/example/PsyPath/domain/repository/UserRepository;", "", "checkUser", "Llolka/example/PsyPath/domain/model/Session;", "login", "Llolka/example/PsyPath/domain/model/Login;", "(Llolka/example/PsyPath/domain/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMessages", "", "Llolka/example/PsyPath/domain/model/Message;", "props", "Llolka/example/PsyPath/domain/model/UserDataToGetMessages;", "(Llolka/example/PsyPath/domain/model/UserDataToGetMessages;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFromDatabase", "Llolka/example/PsyPath/domain/model/SomeData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataFromServer", "Llolka/example/PsyPath/domain/model/PatientDataServer;", "session", "(Llolka/example/PsyPath/domain/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataToDatabase", "Llolka/example/PsyPath/domain/model/PatientData;", "getSession", "getSomeDataFromServer", "getTasksFromDatabase", "Llolka/example/PsyPath/domain/model/Task;", "insertPatientDataToDatabase", "", "(Llolka/example/PsyPath/domain/model/PatientData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTaskToDatabase", "task", "(Llolka/example/PsyPath/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDataBase", "(Llolka/example/PsyPath/domain/model/SomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushMessageToServer", "", "(Llolka/example/PsyPath/domain/model/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushPatientDataToServer", "pushSomeDataToServer", "pushTaskToServer", "", "saveSession", "app_release"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushSomeDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.SomeData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSomeDataFromServer(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.SomeData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertToDataBase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.SomeData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.SomeData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushPatientDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllMessages(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.UserDataToGetMessages props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.domain.model.Message>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushMessageToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Message props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.PatientData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.PatientData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertTaskToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTasksFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.domain.model.Task>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushTaskToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Task task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkUser(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Login login, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.Session> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientDataFromServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.model.Session session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.domain.model.PatientDataServer> continuation);
}