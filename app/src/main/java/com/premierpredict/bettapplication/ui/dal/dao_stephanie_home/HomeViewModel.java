package com.premierpredict.bettapplication.ui.dal.dao_stephanie_home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dao_stephanie_home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}