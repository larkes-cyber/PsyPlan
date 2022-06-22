// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lolka.example.PsyPath.domain.repository.UserRepository;
import lolka.example.PsyPath.domain.usecase.UseInsertToDatabase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DomainModule_ProvideUseInsertToDatabaseFactory implements Factory<UseInsertToDatabase> {
  private final DomainModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public DomainModule_ProvideUseInsertToDatabaseFactory(DomainModule module,
      Provider<UserRepository> userRepositoryProvider) {
    this.module = module;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UseInsertToDatabase get() {
    return provideUseInsertToDatabase(module, userRepositoryProvider.get());
  }

  public static DomainModule_ProvideUseInsertToDatabaseFactory create(DomainModule module,
      Provider<UserRepository> userRepositoryProvider) {
    return new DomainModule_ProvideUseInsertToDatabaseFactory(module, userRepositoryProvider);
  }

  public static UseInsertToDatabase provideUseInsertToDatabase(DomainModule instance,
      UserRepository userRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideUseInsertToDatabase(userRepository));
  }
}
