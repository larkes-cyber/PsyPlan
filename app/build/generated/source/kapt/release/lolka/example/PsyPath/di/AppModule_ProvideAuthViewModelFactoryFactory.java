// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lolka.example.PsyPath.domain.usecase.UseInsertPatientDataToDatabase;
import lolka.example.PsyPath.domain.usecase.UsePushPatientDataToServer;
import lolka.example.PsyPath.presentation.viewmodel.AuthViewModelFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAuthViewModelFactoryFactory implements Factory<AuthViewModelFactory> {
  private final AppModule module;

  private final Provider<UsePushPatientDataToServer> usePushPatientDataToServerProvider;

  private final Provider<UseInsertPatientDataToDatabase> useInsertPatientDataToDatabaseProvider;

  public AppModule_ProvideAuthViewModelFactoryFactory(AppModule module,
      Provider<UsePushPatientDataToServer> usePushPatientDataToServerProvider,
      Provider<UseInsertPatientDataToDatabase> useInsertPatientDataToDatabaseProvider) {
    this.module = module;
    this.usePushPatientDataToServerProvider = usePushPatientDataToServerProvider;
    this.useInsertPatientDataToDatabaseProvider = useInsertPatientDataToDatabaseProvider;
  }

  @Override
  public AuthViewModelFactory get() {
    return provideAuthViewModelFactory(module, usePushPatientDataToServerProvider.get(), useInsertPatientDataToDatabaseProvider.get());
  }

  public static AppModule_ProvideAuthViewModelFactoryFactory create(AppModule module,
      Provider<UsePushPatientDataToServer> usePushPatientDataToServerProvider,
      Provider<UseInsertPatientDataToDatabase> useInsertPatientDataToDatabaseProvider) {
    return new AppModule_ProvideAuthViewModelFactoryFactory(module, usePushPatientDataToServerProvider, useInsertPatientDataToDatabaseProvider);
  }

  public static AuthViewModelFactory provideAuthViewModelFactory(AppModule instance,
      UsePushPatientDataToServer usePushPatientDataToServer,
      UseInsertPatientDataToDatabase useInsertPatientDataToDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideAuthViewModelFactory(usePushPatientDataToServer, useInsertPatientDataToDatabase));
  }
}
