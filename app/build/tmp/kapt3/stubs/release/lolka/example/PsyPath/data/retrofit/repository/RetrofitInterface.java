package lolka.example.PsyPath.data.retrofit.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0005\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0005\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Llolka/example/PsyPath/data/retrofit/repository/RetrofitInterface;", "", "checkUser", "Lretrofit2/Response;", "", "props", "Llolka/example/PsyPath/data/retrofit/model/RetrofitLogin;", "(Llolka/example/PsyPath/data/retrofit/model/RetrofitLogin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSomeData", "Llolka/example/PsyPath/data/retrofit/model/RetrofitSomeData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushPatientDataToServer", "Llolka/example/PsyPath/data/retrofit/model/PatientDataResponse;", "Llolka/example/PsyPath/data/retrofit/model/PatientDataRetrofit;", "(Llolka/example/PsyPath/data/retrofit/model/PatientDataRetrofit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushSomeDataToServer", "Llolka/example/PsyPath/data/retrofit/model/RetrofitSomeDataResponse;", "(Llolka/example/PsyPath/data/retrofit/model/RetrofitSomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushTaskToServer", "Llolka/example/PsyPath/data/retrofit/model/RetrofitTaskResponse;", "Llolka/example/PsyPath/data/retrofit/model/RetrofitTask;", "(Llolka/example/PsyPath/data/retrofit/model/RetrofitTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface RetrofitInterface {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushSomeDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.retrofit.model.RetrofitSomeData props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<lolka.example.PsyPath.data.retrofit.model.RetrofitSomeDataResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSomeData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.retrofit.model.RetrofitSomeData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushPatientDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.retrofit.model.PatientDataRetrofit props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<lolka.example.PsyPath.data.retrofit.model.PatientDataResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object pushTaskToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.retrofit.model.RetrofitTask props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<lolka.example.PsyPath.data.retrofit.model.RetrofitTaskResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkUser(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.retrofit.model.RetrofitLogin props, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> continuation);
}