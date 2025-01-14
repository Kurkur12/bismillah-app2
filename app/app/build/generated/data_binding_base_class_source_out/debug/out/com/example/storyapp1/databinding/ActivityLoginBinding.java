// Generated by view binder compiler. Do not edit!
package com.example.storyapp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.storyapp1.R;
import com.example.storyapp1.ui.custom.EmailEditText;
import com.example.storyapp1.ui.custom.PasswordEditText;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnLogin;

  @NonNull
  public final TextView btnRegister;

  @NonNull
  public final EmailEditText edtEmail;

  @NonNull
  public final PasswordEditText edtPassword;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final TextView text;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton btnLogin,
      @NonNull TextView btnRegister, @NonNull EmailEditText edtEmail,
      @NonNull PasswordEditText edtPassword, @NonNull LinearLayout linearLayout,
      @NonNull ProgressBar loading, @NonNull TextView text) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnRegister = btnRegister;
    this.edtEmail = edtEmail;
    this.edtPassword = edtPassword;
    this.linearLayout = linearLayout;
    this.loading = loading;
    this.text = text;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      MaterialButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btn_register;
      TextView btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.edt_email;
      EmailEditText edtEmail = ViewBindings.findChildViewById(rootView, id);
      if (edtEmail == null) {
        break missingId;
      }

      id = R.id.edt_password;
      PasswordEditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.linear_layout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.loading;
      ProgressBar loading = ViewBindings.findChildViewById(rootView, id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, btnRegister, edtEmail,
          edtPassword, linearLayout, loading, text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
