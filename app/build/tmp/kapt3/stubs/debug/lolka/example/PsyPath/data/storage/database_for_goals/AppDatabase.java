package lolka.example.PsyPath.data.storage.database_for_goals;

import java.lang.System;

@androidx.room.Database(entities = {lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData.class, lolka.example.PsyPath.data.storage.database_for_goals.entity.EntityTask.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Llolka/example/PsyPath/data/storage/database_for_goals/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "someDao", "Llolka/example/PsyPath/data/storage/database_for_goals/dao/SomeDao;", "taskDao", "Llolka/example/PsyPath/data/storage/database_for_goals/dao/TaskDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao someDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao taskDao();
}