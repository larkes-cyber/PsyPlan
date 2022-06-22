// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.presentation.fragment;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import lolka.example.PsyPath.presentation.viewmodel.SignOrAuthViewModelFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInOrAuth_MembersInjector implements MembersInjector<SignInOrAuth> {
  private final Provider<SignOrAuthViewModelFactory> vmFactoryProvider;

  public SignInOrAuth_MembersInjector(Provider<SignOrAuthViewModelFactory> vmFactoryProvider) {
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<SignInOrAuth> create(
      Provider<SignOrAuthViewModelFactory> vmFactoryProvider) {
    return new SignInOrAuth_MembersInjector(vmFactoryProvider);
  }

  @Override
  public void injectMembers(SignInOrAuth instance) {
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  @InjectedFieldSignature("lolka.example.PsyPath.presentation.fragment.SignInOrAuth.vmFactory")
  public static void injectVmFactory(SignInOrAuth instance, SignOrAuthViewModelFactory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}