package lolka.example.PsyPath.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Llolka/example/PsyPath/domain/repository/UserRepository;", "", "getAllMessages", "", "Llolka/example/PsyPath/domain/model/Message;", "props", "Llolka/example/PsyPath/domain/model/UserDataToGetMessages;", "(Llolka/example/PsyPath/domain/model/UserDataToGetMessages;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFromDatabase", "Llolka/example/PsyPath/domain/model/SomeData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientDataToDatabase", "Llolka/example/PsyPath/domain/model/PatientData;", "getSession", "Llolka/example/PsyPath/domain/model/Session;", "getSomeDataFromServer", "getTasksFromDatabase", "Llolka/example/PsyPath/domain/model/Task;", "insertPatientDataToDatabase", "", "(Llolka/example/PsyPath/domain/model/PatientData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTaskToDatabase", "task", "(Llolka/example/PsyPath/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToDataBase", "(Llolka/example/PsyPath/domain/model/SomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushMessageToServer", "", "(Llolka/example/PsyPath/domain/model/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushPatientDataToServer", "pushSomeDataToServer", "pushTaskToServer", "", "saveSession", "session", "(Llolka/example/PsyPath/domain/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
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
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
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
}