package com.premierpredict.bettapplication.ui.dal.dao_issabel_localtoday;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.premierpredict.bettapplication.R;

public class LocalTodayFragment extends Fragment {

    private LocalTodayViewModel mViewModel;

    public static LocalTodayFragment newInstance() {
        return new LocalTodayFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_local_today, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LocalTodayViewModel.class);
        // TODO: Use the ViewModel
    }

}