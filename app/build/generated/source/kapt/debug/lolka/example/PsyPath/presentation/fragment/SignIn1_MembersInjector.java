// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.presentation.fragment;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import lolka.example.PsyPath.presentation.viewmodel.SignInViewModelFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignIn1_MembersInjector implements MembersInjector<SignIn1> {
  private final Provider<SignInViewModelFactory> vmFactoryProvider;

  public SignIn1_MembersInjector(Provider<SignInViewModelFactory> vmFactoryProvider) {
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<SignIn1> create(
      Provider<SignInViewModelFactory> vmFactoryProvider) {
    return new SignIn1_MembersInjector(vmFactoryProvider);
  }

  @Override
  public void injectMembers(SignIn1 instance) {
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  @InjectedFieldSignature("lolka.example.PsyPath.presentation.fragment.SignIn1.vmFactory")
  public static void injectVmFactory(SignIn1 instance, SignInViewModelFactory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}
