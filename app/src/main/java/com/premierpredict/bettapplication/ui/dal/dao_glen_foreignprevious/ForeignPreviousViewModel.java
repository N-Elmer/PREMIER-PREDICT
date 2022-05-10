package com.premierpredict.bettapplication.ui.dal.dao_glen_foreignprevious;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ForeignPreviousViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ForeignPreviousViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dao_glen_foreignprevious fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}