package com.example.app_main;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.app_main.ui.splash.SplashViewModel;

import javax.inject.Inject;

/**
 * Created by jyotidubey on 22/02/19.
 */

public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {

  @Inject
  public ViewModelProviderFactory() {}


  @Override
  public <T extends ViewModel> T create(Class<T> modelClass) {
     if (modelClass.isAssignableFrom(MainViewModel.class)) {
      //noinspection unchecked
      return (T) new MainViewModel();
    }
    else if (modelClass.isAssignableFrom(SplashViewModel.class)) {
      //noinspection unchecked
      return (T) new SplashViewModel();
    }
    throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
  }
}