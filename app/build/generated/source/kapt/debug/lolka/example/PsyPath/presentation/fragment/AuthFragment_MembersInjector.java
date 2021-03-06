// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.presentation.fragment;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import lolka.example.PsyPath.presentation.viewmodel.AuthViewModelFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthFragment_MembersInjector implements MembersInjector<AuthFragment> {
  private final Provider<AuthViewModelFactory> vmFactoryProvider;

  public AuthFragment_MembersInjector(Provider<AuthViewModelFactory> vmFactoryProvider) {
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<AuthFragment> create(
      Provider<AuthViewModelFactory> vmFactoryProvider) {
    return new AuthFragment_MembersInjector(vmFactoryProvider);
  }

  @Override
  public void injectMembers(AuthFragment instance) {
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  @InjectedFieldSignature("lolka.example.PsyPath.presentation.fragment.AuthFragment.vmFactory")
  public static void injectVmFactory(AuthFragment instance, AuthViewModelFactory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}
