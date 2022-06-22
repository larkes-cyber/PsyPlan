// Generated by view binder compiler. Do not edit!
package lolka.example.PsyPath.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import lolka.example.PsyPath.R;

public final class FragmentSignInOrAuthBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton auth;

  @NonNull
  public final AppCompatButton signId;

  private FragmentSignInOrAuthBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton auth,
      @NonNull AppCompatButton signId) {
    this.rootView = rootView;
    this.auth = auth;
    this.signId = signId;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignInOrAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignInOrAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_in_or_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignInOrAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.auth;
      AppCompatButton auth = ViewBindings.findChildViewById(rootView, id);
      if (auth == null) {
        break missingId;
      }

      id = R.id.sign_id;
      AppCompatButton signId = ViewBindings.findChildViewById(rootView, id);
      if (signId == null) {
        break missingId;
      }

      return new FragmentSignInOrAuthBinding((LinearLayout) rootView, auth, signId);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}