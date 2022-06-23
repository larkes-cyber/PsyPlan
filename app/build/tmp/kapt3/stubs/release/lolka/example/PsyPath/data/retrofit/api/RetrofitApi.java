package lolka.example.PsyPath.data.retrofit.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\r\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Llolka/example/PsyPath/data/retrofit/api/RetrofitApi;", "", "checkUser", "Lretrofit2/Response;", "", "retrofitLogin", "Llolka/example/PsyPath/data/retrofit/model/RetrofitLogin;", "(Llolka/example/PsyPath/data/retrofit/model/RetrofitLogin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSomeData", "Llolka/example/PsyPath/data/retrofit/model/RetrofitSomeData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushPatientData", "Llolka/example/PsyPath/data/retrofit/model/PatientDataResponse;", "retrofitPatientData", "Llolka/example/PsyPath/data/retrofit/model/PatientDataRetrofit;", "(Llolka/example/PsyPath/data/retrofit/model/PatientDataRetrofit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushSomeData", "Llolka/example/PsyPath/data/retrofit/model/RetrofitSomeDataResponse;", "retrofitGoalData", "(Llolka/example/PsyPath/data/retrofit/model/RetrofitSomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushTask", "Llolka/example/PsyPath/data/retrofit/model/RetrofitTaskResponse;", "Llolka/example/PsyPath/data/retrofit/model/RetrofitTask;", "(Llolka/example/PsyPath/data/retrofit/model/RetrofitTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface RetrofitApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "posts/1")
    public abstract java.lang.Object getSomeData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super lolka.example.PsyPath.data.retrofit.model.RetrofitSomeData> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/log")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object pushSomeData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    lolka.example.PsyPath.data.retrofit.model.RetrofitSomeData retrofitGoalData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<lolka.example.PsyPath.data.retrofit.model.RetrofitSomeDataResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/api/reg/patient")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object pushPatientData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    lolka.example.PsyPath.data.retrofit.model.PatientDataRetrofit retrofitPatientData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<lolka.example.PsyPath.data.retrofit.model.PatientDataResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/api/cheak_user")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object checkUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    lolka.example.PsyPath.data.retrofit.model.RetrofitLogin retrofitLogin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/reg/add_task")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object pushTask(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    lolka.example.PsyPath.data.retrofit.model.RetrofitTask retrofitPatientData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<lolka.example.PsyPath.data.retrofit.model.RetrofitTaskResponse>> continuation);
}