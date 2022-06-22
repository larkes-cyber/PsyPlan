// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.presentation.fragment;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import lolka.example.PsyPath.presentation.viewmodel.StateViewModelFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StateFragment_MembersInjector implements MembersInjector<StateFragment> {
  private final Provider<StateViewModelFactory> vmFactoryProvider;

  public StateFragment_MembersInjector(Provider<StateViewModelFactory> vmFactoryProvider) {
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<StateFragment> create(
      Provider<StateViewModelFactory> vmFactoryProvider) {
    return new StateFragment_MembersInjector(vmFactoryProvider);
  }

  @Override
  public void injectMembers(StateFragment instance) {
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  @InjectedFieldSignature("lolka.example.PsyPath.presentation.fragment.StateFragment.vmFactory")
  public static void injectVmFactory(StateFragment instance, StateViewModelFactory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}