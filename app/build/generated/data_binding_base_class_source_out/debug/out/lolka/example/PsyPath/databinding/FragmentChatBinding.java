// Generated by view binder compiler. Do not edit!
package lolka.example.PsyPath.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import lolka.example.PsyPath.R;

public final class FragmentChatBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final EditText mess;

  @NonNull
  public final RecyclerView rcView;

  @NonNull
  public final LinearLayout recyclerContainer;

  @NonNull
  public final ImageView send;

  private FragmentChatBinding(@NonNull LinearLayout rootView, @NonNull ImageView back,
      @NonNull EditText mess, @NonNull RecyclerView rcView, @NonNull LinearLayout recyclerContainer,
      @NonNull ImageView send) {
    this.rootView = rootView;
    this.back = back;
    this.mess = mess;
    this.rcView = rcView;
    this.recyclerContainer = recyclerContainer;
    this.send = send;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.mess;
      EditText mess = ViewBindings.findChildViewById(rootView, id);
      if (mess == null) {
        break missingId;
      }

      id = R.id.rc_view;
      RecyclerView rcView = ViewBindings.findChildViewById(rootView, id);
      if (rcView == null) {
        break missingId;
      }

      id = R.id.recyclerContainer;
      LinearLayout recyclerContainer = ViewBindings.findChildViewById(rootView, id);
      if (recyclerContainer == null) {
        break missingId;
      }

      id = R.id.send;
      ImageView send = ViewBindings.findChildViewById(rootView, id);
      if (send == null) {
        break missingId;
      }

      return new FragmentChatBinding((LinearLayout) rootView, back, mess, rcView, recyclerContainer,
          send);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}