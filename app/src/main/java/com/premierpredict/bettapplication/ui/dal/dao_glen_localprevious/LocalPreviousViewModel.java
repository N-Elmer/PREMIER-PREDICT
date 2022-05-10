package com.premierpredict.bettapplication.ui.dal.dao_glen_localprevious;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocalPreviousViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocalPreviousViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dao_glen_localprevious fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}