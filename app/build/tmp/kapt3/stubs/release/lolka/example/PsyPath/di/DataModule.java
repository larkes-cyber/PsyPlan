package lolka.example.PsyPath.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fH\u0007\u00a8\u0006\u001a"}, d2 = {"Llolka/example/PsyPath/di/DataModule;", "", "()V", "provideDataBase", "Llolka/example/PsyPath/data/storage/database_for_goals/AppDatabase;", "context", "Landroid/content/Context;", "provideDataBaseRepository", "Llolka/example/PsyPath/data/storage/database_for_goals/repository/DataBaseRepository;", "providePatientData", "Llolka/example/PsyPath/data/storage/user_data/PatientData;", "provideRetrofitRepository", "Llolka/example/PsyPath/data/retrofit/repository/RetrofitRepository;", "provideService", "Llolka/example/PsyPath/data/storage/Service;", "dataBaseRepository", "patientData", "provideSomeDao", "Llolka/example/PsyPath/data/storage/database_for_goals/dao/SomeDao;", "database", "provideTaskDao", "Llolka/example/PsyPath/data/storage/database_for_goals/dao/TaskDao;", "provideUserRepository", "Llolka/example/PsyPath/domain/repository/UserRepository;", "service", "retrofitRepository", "app_release"})
@dagger.Module()
public final class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.storage.database_for_goals.AppDatabase provideDataBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao provideSomeDao(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao provideTaskDao(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.retrofit.repository.RetrofitRepository provideRetrofitRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.storage.database_for_goals.repository.DataBaseRepository provideDataBaseRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.storage.Service provideService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.repository.DataBaseRepository dataBaseRepository, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.user_data.PatientData patientData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.data.storage.user_data.PatientData providePatientData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.Service service, @org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.retrofit.repository.RetrofitRepository retrofitRepository) {
        return null;
    }
}