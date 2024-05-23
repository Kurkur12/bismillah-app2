// Generated by view binder compiler. Do not edit!
package com.example.storyapp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.storyapp1.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final FloatingActionButton fabAddStory;

  @NonNull
  public final ProgressBar pbLoadingScreen;

  @NonNull
  public final RecyclerView rvStory;

  private ActivityMainBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull FloatingActionButton fabAddStory, @NonNull ProgressBar pbLoadingScreen,
      @NonNull RecyclerView rvStory) {
    this.rootView = rootView;
    this.fabAddStory = fabAddStory;
    this.pbLoadingScreen = pbLoadingScreen;
    this.rvStory = rvStory;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab_add_story;
      FloatingActionButton fabAddStory = ViewBindings.findChildViewById(rootView, id);
      if (fabAddStory == null) {
        break missingId;
      }

      id = R.id.pb_loading_screen;
      ProgressBar pbLoadingScreen = ViewBindings.findChildViewById(rootView, id);
      if (pbLoadingScreen == null) {
        break missingId;
      }

      id = R.id.rv_story;
      RecyclerView rvStory = ViewBindings.findChildViewById(rootView, id);
      if (rvStory == null) {
        break missingId;
      }

      return new ActivityMainBinding((SwipeRefreshLayout) rootView, fabAddStory, pbLoadingScreen,
          rvStory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}