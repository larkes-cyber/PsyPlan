package lolka.example.PsyPath.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a8\u0006\u0015"}, d2 = {"Llolka/example/PsyPath/di/AppComponent;", "", "injectDataBaseRepository", "", "dataBaseRepository", "Llolka/example/PsyPath/data/storage/database_for_goals/repository/DataBaseRepository;", "injectPatientProfileFragment", "patientFragment", "Llolka/example/PsyPath/presentation/fragment/ProfileOfPatientFragment;", "injectSignInFragment", "signIn1", "Llolka/example/PsyPath/presentation/fragment/SignIn1;", "injectSignOrAuthFragment", "signInOrAuth", "Llolka/example/PsyPath/presentation/fragment/SignInOrAuth;", "injectSomeFragment", "authFragment", "Llolka/example/PsyPath/presentation/fragment/AuthFragment;", "injectStateFragment", "stateFragment", "Llolka/example/PsyPath/presentation/fragment/StateFragment;", "app_debug"})
@dagger.Component(modules = {lolka.example.PsyPath.di.AppModule.class, lolka.example.PsyPath.di.DomainModule.class, lolka.example.PsyPath.di.DataModule.class})
public abstract interface AppComponent {
    
    public abstract void injectDataBaseRepository(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.database_for_goals.repository.DataBaseRepository dataBaseRepository);
    
    public abstract void injectSomeFragment(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.AuthFragment authFragment);
    
    public abstract void injectPatientProfileFragment(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.ProfileOfPatientFragment patientFragment);
    
    public abstract void injectSignOrAuthFragment(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.SignInOrAuth signInOrAuth);
    
    public abstract void injectStateFragment(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.StateFragment stateFragment);
    
    public abstract void injectSignInFragment(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.presentation.fragment.SignIn1 signIn1);
}