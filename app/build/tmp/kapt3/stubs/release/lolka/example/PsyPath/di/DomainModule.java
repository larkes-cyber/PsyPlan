package lolka.example.PsyPath.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0017"}, d2 = {"Llolka/example/PsyPath/di/DomainModule;", "", "()V", "provideGetPatientDataFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetPatientDataFromDatabase;", "userRepository", "Llolka/example/PsyPath/domain/repository/UserRepository;", "provideGetTasksFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetTasksFromDatabase;", "provideInsertPatientDataToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertPatientDataToDatabase;", "provideInsertTaskToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertTaskToDatabase;", "provideUseGetFromDatabase", "Llolka/example/PsyPath/domain/usecase/UseGetFromDatabase;", "provideUseGetSomeDataFromServer", "Llolka/example/PsyPath/domain/usecase/UseGetSomeDataFromServer;", "provideUseInsertToDatabase", "Llolka/example/PsyPath/domain/usecase/UseInsertToDatabase;", "provideUsePushPatientDataToServer", "Llolka/example/PsyPath/domain/usecase/UsePushPatientDataToServer;", "provideUsePushSomeDataToServer", "Llolka/example/PsyPath/domain/usecase/UsePushSomeDataToServer;", "app_release"})
@dagger.Module()
public final class DomainModule {
    
    public DomainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseGetFromDatabase provideUseGetFromDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseGetSomeDataFromServer provideUseGetSomeDataFromServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseInsertToDatabase provideUseInsertToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UsePushSomeDataToServer provideUsePushSomeDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer provideUsePushPatientDataToServer(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase provideInsertPatientDataToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromDatabase provideGetPatientDataFromDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseInsertTaskToDatabase provideInsertTaskToDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final lolka.example.PsyPath.domain.usecase.UseGetTasksFromDatabase provideGetTasksFromDatabase(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.domain.repository.UserRepository userRepository) {
        return null;
    }
}