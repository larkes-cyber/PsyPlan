package lolka.example.PsyPath.data.storage.database_for_goals.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Llolka/example/PsyPath/data/storage/database_for_goals/dao/SomeDao;", "", "addSome", "", "entitySomeData", "Llolka/example/PsyPath/data/storage/database_for_goals/entity/EntitySomeData;", "(Llolka/example/PsyPath/data/storage/database_for_goals/entity/EntitySomeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSome", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeSome", "updateSome", "app_debug"})
public abstract interface SomeDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addSome(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData entitySomeData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM EntitySomeData")
    public abstract java.lang.Object getAllSome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeSome(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData entitySomeData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateSome(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData entitySomeData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}