// Generated by view binder compiler. Do not edit!
package lolka.example.PsyPath.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import lolka.example.PsyPath.R;

public final class FragmentAuth2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton buttonf;

  @NonNull
  public final TextView error;

  @NonNull
  public final TextView lol;

  @NonNull
  public final EditText name;

  private FragmentAuth2Binding(@NonNull LinearLayout rootView, @NonNull AppCompatButton buttonf,
      @NonNull TextView error, @NonNull TextView lol, @NonNull EditText name) {
    this.rootView = rootView;
    this.buttonf = buttonf;
    this.error = error;
    this.lol = lol;
    this.name = name;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAuth2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAuth2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_auth2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAuth2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonf;
      AppCompatButton buttonf = ViewBindings.findChildViewById(rootView, id);
      if (buttonf == null) {
        break missingId;
      }

      id = R.id.error;
      TextView error = ViewBindings.findChildViewById(rootView, id);
      if (error == null) {
        break missingId;
      }

      id = R.id.lol;
      TextView lol = ViewBindings.findChildViewById(rootView, id);
      if (lol == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      return new FragmentAuth2Binding((LinearLayout) rootView, buttonf, error, lol, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
