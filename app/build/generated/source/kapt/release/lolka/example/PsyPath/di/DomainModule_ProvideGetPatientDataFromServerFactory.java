// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lolka.example.PsyPath.domain.repository.UserRepository;
import lolka.example.PsyPath.domain.usecase.UseGetPatientDataFromServer;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DomainModule_ProvideGetPatientDataFromServerFactory implements Factory<UseGetPatientDataFromServer> {
  private final DomainModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public DomainModule_ProvideGetPatientDataFromServerFactory(DomainModule module,
      Provider<UserRepository> userRepositoryProvider) {
    this.module = module;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UseGetPatientDataFromServer get() {
    return provideGetPatientDataFromServer(module, userRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetPatientDataFromServerFactory create(DomainModule module,
      Provider<UserRepository> userRepositoryProvider) {
    return new DomainModule_ProvideGetPatientDataFromServerFactory(module, userRepositoryProvider);
  }

  public static UseGetPatientDataFromServer provideGetPatientDataFromServer(DomainModule instance,
      UserRepository userRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetPatientDataFromServer(userRepository));
  }
}