// Generated by Dagger (https://dagger.dev).
package lolka.example.PsyPath.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProvideContextFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static AppModule_ProvideContextFactory create(AppModule module) {
    return new AppModule_ProvideContextFactory(module);
  }

  public static Context provideContext(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}
